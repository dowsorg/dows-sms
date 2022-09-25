package org.dows.sms.entity.elastic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dows.sms.api.constant.SmsConsts;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信发送请求原始清单
 */

@Document(indexName = "#{@indexNameGenerator.smsIndexByMonth(\"" + SmsConsts.INDEX_SMS_REQUEST_LIST_MONTH + "\")}")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MsgRequestList implements Serializable {
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;
    private String appId;
    private String tenantId;

    // 请求id（一次请求集合肯能会被多个通道分割，即一个reqeustId对应多个通道）
    private String requestId;
    // 请求时间
    private Date requestTime;

    // 消息类型
    private String msgTyp;
    //发送内容
    //   @Field(analyzer = "sms_content", type = FieldType.Text)
    private String smsContent;
    // 号码
    private String phoneNo;
    // 签名
    private String sign;
    // 天
    private Integer day;
    //直观时间
    private String dateTime;
    //是否删除
    private boolean deleted;

}
