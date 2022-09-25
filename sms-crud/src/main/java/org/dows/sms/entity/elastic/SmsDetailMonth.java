package org.dows.sms.entity.elastic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dows.sms.api.constant.SmsConsts;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.io.Serializable;

/**
 * @Title: SmsDetailMonth
 * @Description: "mappings": {
 * "_doc": {
 * "properties": {
 * "channelProviderId": {
 * "type": "keyword"
 * },
 * "code": {
 * "type": "text",
 * "fields": {
 * "keyword": {
 * "ignore_above": 256,
 * "type": "keyword"
 * }
 * }
 * },
 * "isSigned": {
 * "type": "integer"
 * },
 * "sign": {
 * "type": "keyword"
 * },
 * "messageId": {
 * "type": "keyword"
 * },
 * "channelProviderResponseStatus": {
 * "type": "keyword"
 * },
 * "customId": {
 * "type": "keyword"
 * },
 * "sendTime": {
 * "type": "keyword"
 * },
 * "receiveTime": {
 * "format": "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis",
 * "type": "date"
 * },
 * "channelProviderName": {
 * "type": "keyword"
 * },
 * "phoneNumber": {
 * "type": "keyword"
 * },
 * "submitTime": {
 * "format": "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis",
 * "type": "date"
 * },
 * "errCode": {
 * "type": "keyword"
 * },
 * "requestId": {
 * "type": "keyword"
 * },
 * "smsContent": {
 * "type": "keyword"
 * },
 * "sendStatus": {
 * "type": "integer"
 * },
 * "smsType": {
 * "type": "keyword"
 * },
 * "subUserId": {
 * "type": "keyword"
 * },
 * "account": {
 * "type": "text",
 * "fields": {
 * "keyword": {
 * "ignore_above": 256,
 * "type": "keyword"
 * }
 * }
 * }
 * }
 * }
 * },
 * @date 2021/11/815:26
 */
//@Document(indexName = "#{@indexNameGenerator.smsIndexByMonth(\"" + SmsConsts.INDEX_SMS_DETAIL_MONTH + "\")}",type = "_doc")

@Document(indexName = "#{@indexNameGenerator.smsIndexByMonth(\"" + SmsConsts.INDEX_SMS_DETAIL_MONTH + "\")}")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel("短信下行详细数据")
public class SmsDetailMonth implements Serializable {
    @Id
    // @Field(type = FieldType.Text, store = true, index = false)
    private String smsDetailNo;
    /**
     * 手机号
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("手机号")
    private String phoneNumber;

    /**
     * 发送内容
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("发送内容")
    private String smsContent;

    /**
     * 发送方id
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("发送方id")
    private String subUserId;

    /**
     * 自定义编码
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("自定义编码")
    private String customId;

    /**
     * 发送短信到通道商的时间
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("发送短信到通道商的时间")
    private String sendTime;

    /**
     * 回执接收时间
     */
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("回执接收时间")
    private String receiveTime;

    /**
     * 回执状态
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("回执状态 DELIVRD：成功/其他字符：失败")
    private String errCode;
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("回执描述")
    private String errCodeDesc;

    /**
     * 平台批次号
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("平台批次号")
    private String messageId;

    /**
     * 短信类型
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("短信类型")
    private String smsType;

    /**
     * 通道商
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("通道商")
    private String channelProviderName;

    /**
     * 通道商编码
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("通道商编码")
    private String channelProviderId;

    /**
     * 请求平台编码
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("请求平台编码")
    private String requestId;

    /**
     * 短信签名
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("短信签名")
    private String sign;

    /**
     * 通道商返回状态（原生）
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("通道商返回状态（原生）")
    private String channelProviderResponseStatus;
    /**
     * 通道商返回状态说明
     */
    @Field(type = FieldType.Keyword)
    @ApiModelProperty("通道商返回状态说明（原生）")
    private String channelProviderResponseDesc;
    /**
     * 短信内容是否主动加签名
     * 0：不是
     * 1：是
     */
    @ApiModelProperty("短信内容是否主动加签名0不是/1是")
    private Integer isSigned;

    /**
     * 发送短信状态（0:发送成功，1:发送失败，2:还未有回执状态）
     */
    @ApiModelProperty("发送短信状态（0:发送成功，1:发送失败，2:还未有回执状态）")
    private Integer sendStatus;

    /**
     * 账号
     * 原来的格式是这样
     */
    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = @InnerField(suffix = "keyword", type = FieldType.Keyword))
    private String account;

    /**
     * 通道商code: ymrt/wt/mwkj/xsxx....
     */
    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = @InnerField(suffix = "keyword", type = FieldType.Keyword))
    private String code;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String submitTime;
    /**
     * sendTime的日期格式类型，便于查询
     */
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String sendTimeDateTime;


    private String sendTimeStr;
    /**
     * 内容按照条件分割之后的条数
     */
    @ApiModelProperty("拆分条数")
    private Integer contentCount;
    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = @InnerField(suffix = "keyword", type = FieldType.Keyword))
    private String appNo;
    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = @InnerField(suffix = "keyword", type = FieldType.Keyword))
    private String tenantId;
    @Field(type = FieldType.Keyword)
    private String appName;
    @Field(type = FieldType.Keyword)
    private String senderCode;
    @ApiModelProperty("统一状态码")
    @Field(type = FieldType.Keyword)
    private String stateCode;

    @ApiModelProperty("统一状态描述")
    @Field(type = FieldType.Keyword)
    private String stateDescr;

    public String getSendTimeStr() {
        return this.sendTime.substring(0, 8);
    }

    public void setSendTimeStr(String sendTimeStr) {
        this.sendTimeStr = sendTimeStr;
    }
}
