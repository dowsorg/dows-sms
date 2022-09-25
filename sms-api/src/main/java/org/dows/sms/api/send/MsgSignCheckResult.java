package org.dows.sms.api.send;

import lombok.Data;

@Data
public class MsgSignCheckResult {
    private Integer status; //0 无效 1有效


    public MsgSignCheckResult(Integer status) {
        this.status = status;
    }

    public MsgSignCheckResult() {
    }
}
