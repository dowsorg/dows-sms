package org.dows.sms.entity.elastic;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dows.sms.api.constant.SmsConsts;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * 发送详情
 */
@Document(indexName = "#{@indexNameGenerator.smsIndexByMonth(\"" + SmsConsts.INDEX_SMS_SEND_DETAIL_MONTH + "\")}")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MsgSendDetail implements Serializable {

    @Id
    //  @Field(type = FieldType.Auto, store = true, index = false)
    private String detailNo;
    // 应用id
    private String appId;
    // 租户id
    private String tenantId;
    // 当前请求的id(一个请求id 对应一个号码集合，一个号码集合可能是一个或多个号码）)
    private String requestId;
    // 当前请求手机号对应的messageId（相当于一个手机号一个messageId,1:1）
    private String messageId;
    // 请求的提交时间（发送时间）
    private String requestSubmitTime;
    private String phoneNumber;
    // 是否发送陈工标志（成功状态：一个发送成功号码对应一个通道，失败状态：一个号码可能对应多个通道id）
    private boolean success;
    // 号码的回执时间
    private Date receiptTime;

    // 通道id（当前发送过该手机号、签名、内容的那个通道，可能有一个或多个,切换通道时产生）
    private Long channelId;
    private String channelName;
    private String channelCode;
    /**
     * 发送内容
     */
    private String smsContent;
    // 请求时间
    private Date requestTime;

    /**
     * 发送方id
     */
    private String subUserId;

    /**
     * 自定义编码
     */
    private String customId;
    /**
     * 短信类型
     */
    private String smsType;

    /**
     * 短信签名
     */
    private String sign;
    /**
     * 短信内容是否主动加签名
     * 0：不是
     * 1：是
     */
    private Integer isSigned;
    /**
     * 账号
     */
    private String account;
    // 天
    private Integer day;
    // 请求的对应通道的回执时间
    private String channelReceiptTime;
    // 请求通道的回执码
    private String channelReceiptCode;
    // 请求通道的回执描述
    private String channelReceiptDescr;
    //发送状态 0失败1成功
    private Integer status;
    //是否重发标识，检测时如果发送失败需要重发的，通过该字段更新标记
    private boolean reSendFlag;
    //重发次数，如果失败需要重发则记录次数
    private Integer reSendCount;

    //消息序列号
    private String messageNo;

    //直观时间
    private String dateTime;
    //是否删除
    private boolean deleted;

    @ApiModelProperty("通道商返回状态（原生）")
    private String channelProviderResponseStatus;

}
