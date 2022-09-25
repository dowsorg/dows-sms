package org.dows.sms.api.send;

import lombok.Data;

import java.util.List;

@Data
public class SmsResult {
    private String requestId;

    private Boolean smsResult = Boolean.FALSE;
    /**
     * 语音短信数量超限集合(未发送)
     */
    private List<Object> exceedPhoneList;

    public SmsResult(String requestId) {
        this.requestId = requestId;
        this.smsResult = Boolean.TRUE;
    }

    public SmsResult(String requestId, Boolean smsResult) {
        this.requestId = requestId;
        this.smsResult = smsResult;
    }

    public SmsResult() {
    }
}
