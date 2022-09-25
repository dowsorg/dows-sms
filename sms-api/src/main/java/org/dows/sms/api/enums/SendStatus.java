package org.dows.sms.api.enums;

import lombok.Getter;

/**
 * 0:发送成功，1:发送失败，2:还未有回执状态
 */
public enum SendStatus {
    SEND_SUCCESS(0),

    SEND_FAILED(1),

    SEND_WAIT_RECEIPT(2);

    @Getter
    private Integer status;

    SendStatus(int status) {
        this.status = status;
    }
}
