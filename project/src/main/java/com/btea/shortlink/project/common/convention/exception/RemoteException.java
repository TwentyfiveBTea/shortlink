package com.btea.shortlink.project.common.convention.exception;

import com.btea.shortlink.project.common.convention.errorcode.BaseErrorCode;
import com.btea.shortlink.project.common.convention.errorcode.IErrorCode;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 18:34
 * @Description: 远程服务调用异常
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
