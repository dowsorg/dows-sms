package org.dows.sms.api.enums;

import lombok.Getter;

public enum MsgDirective {
    SPEED(0),
    TIMING(1),
    CRON(2),
    ;

    @Getter
    private int val;

    MsgDirective(int val) {
        this.val = val;
    }
}
