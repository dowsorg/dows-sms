package org.dows.sms.api.alert.vo;

import lombok.Data;

@Data
public class smsInfoVO {
    private String channelProviderId;
    private String code;
    private String isSigned;
    private String sign;
    private String messageId;
    private String channelProviderResponseStatus;
    private String customId;
    private String sendTime;
    private String channelProviderName;
    private String phoneNumber;
    private String requestId;
    private String smsContent;
    private String sendStatus;
    private String smsType;
    private String subUserId;
    private String account;
    private String receiveTime;
    private String submitTime;
    private String errCode;
}
