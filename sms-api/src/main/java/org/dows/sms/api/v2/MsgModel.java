package org.dows.sms.api.v2;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.dows.sms.api.enums.MsgTyp;
import org.dows.sms.api.enums.PushTyp;

import javax.validation.constraints.NotEmpty;

/**
 * 消息模型定义:
 * 即哪个应用（appId）的哪个业务（customId），
 * 以哪种推送的方式（pushTyp）给哪些人或接受者（msgAccepter），
 * 推送了哪些类型（msgTyp）的哪些签名或主题（topic）的内容(content)
 */

public class MsgModel {
    /**
     * 应用编号或ID
     */
    @Setter
    @Getter
    private String appId;
    /**
     * 用户自定义流水号或业务ID和当前消息建立关联：
     * 该条消息可以是您业务系统内的ID，比如订单号或者短信发送记录的流水号
     * 填写后发送状态返回值内将包含用户自定义流水号
     */
    @Setter
    @Getter
    @NotEmpty
    @ApiModelProperty(value = "自定义ID", required = true)
    private String customId;

    /**
     * 推送方式(0:短信推送,1:邮箱推送,2:消息推送，3:社交账号推送【微信，QQ...】)
     */
    @Getter
    private PushTyp pushTyp;
    /**
     * 消息接受者（与platformTyp映射），会有校验进行判断
     * platformTyp=0,msgAccepter = 手机号，
     * platformTyp=2，msgAccepter = 设备号
     */
    @Setter
    @Getter
    @NotEmpty
    @ApiModelProperty(value = "接受者(手机号/邮箱/社交账号等...)", required = true)
    private String msgAccepter;
    /**
     * 消息类型
     */
    @Getter
    private MsgTyp msgTyp;

    @Setter
    @Getter
    @NotEmpty
    @ApiModelProperty(value = "签名或主题", required = true)
    // 签名或主题(sign/topic）
    private String topic;

    // 内容
    @Setter
    @Getter
    @NotEmpty
    @ApiModelProperty(value = "消息内容", required = true)
    private String content;

}
