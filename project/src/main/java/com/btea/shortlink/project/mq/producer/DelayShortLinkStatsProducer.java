package com.btea.shortlink.project.mq.producer;

import cn.hutool.core.lang.UUID;
import com.btea.shortlink.project.dto.biz.ShortLinkStatsRecordDTO;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RBlockingDeque;
import org.redisson.api.RDelayedQueue;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

import static com.btea.shortlink.project.common.constant.RedisKeyConstant.DELAY_QUEUE_STATS_KEY;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/17 13:52
 * @Description: 延迟消费短链接统计发送者
 */
@Component
@Deprecated
@RequiredArgsConstructor
public class DelayShortLinkStatsProducer {

    private final RedissonClient redissonClient;

    /**
     * 发送延迟消费短链接统计
     *
     * @param statsRecord 短链接统计实体参数
     */
    public void send(ShortLinkStatsRecordDTO statsRecord) {
        statsRecord.setKeys(UUID.fastUUID().toString());
        RBlockingDeque<ShortLinkStatsRecordDTO> blockingDeque = redissonClient.getBlockingDeque(DELAY_QUEUE_STATS_KEY);
        RDelayedQueue<ShortLinkStatsRecordDTO> delayedQueue = redissonClient.getDelayedQueue(blockingDeque);
        delayedQueue.offer(statsRecord, 5, TimeUnit.SECONDS);
    }
}