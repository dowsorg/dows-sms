package org.dows.sms.api.mq;

import lombok.Data;

/**
 * @author lait.zhang@gmail.com
 * @description: 短信实列消息
 * @weixin SH330786
 * @date 2/21/2022
 */
@Data
public class SmsInstanceMessage {
    private String orderNo;
    private String tenantNo;
    private String accountInfo;
    private String appId;

//    private Set<SmsInstanceInfo> smsInstanceInfos;

}
