package org.dows.sms.api.enums;

import lombok.Getter;

public enum MsgStatus {
    SEND_SUCCESS(0),

    SEND_FAILED(1),

    SEND_WAIT_RECEIPT(2);

    @Getter
    private Integer status;

    MsgStatus(int status) {
        this.status = status;
    }
}
