package org.dows.sms.api;

import lombok.Data;
import org.dows.sms.api.enums.SendStatus;

import java.util.List;

/**
 * 消息session，记录那一个requestId 对应的通道列表及当前回话的相关配置参数及发送的会话管理对象
 */
@Data
public class MsgSession {
    // 请求id
    private String requestId;
    // 通道集合码
    private List<String> channelSenderCodes;
    // 发送状态
    private SendStatus sendStatus;
    // 标志
    private boolean flag;
    // subUserid
    //   @JsonIgnore
    private String subUserId;
    // 通过或异步发送
    //    @JsonIgnore
    private boolean async;
    // 重试次数
    //   @JsonIgnore
    private int retryCount;
    // 发送次数统计
    //  @JsonIgnore
    private int sentCounter;
    // 回调接口，用于通知请求方
    //   @JsonIgnore
    private String callbackApi;
}
