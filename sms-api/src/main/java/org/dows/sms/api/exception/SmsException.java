package org.dows.sms.api.exception;

import lombok.Data;

@Data
public class SmsException extends RuntimeException {
    private String msg;
    private int code = 500000;

    public SmsException(String msg) {
        super(msg);
        this.msg = msg;
        //this.msg = ResourceBundleHandler.getInstance().getValue(msg);
    }

    public SmsException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        //this.msg = ResourceBundleHandler.getInstance().getValue(msg);
    }

    public SmsException(int code, String msg) {
        super(msg);
        this.msg = msg;
        //this.msg = ResourceBundleHandler.getInstance().getValue(msg);
        this.code = code;
    }

    public SmsException(int code, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        // this.msg = ResourceBundleHandler.getInstance().getValue(msg);
        this.code = code;
    }
}
