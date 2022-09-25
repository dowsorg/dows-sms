package org.dows.sms.entity.elastic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Title: SmsUpstreamEs
 * @Description: 用户发送的数据内容
 * @date 2021/11/1613:53
 */
@Document(indexName = "msg_monitor_detail")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel("触发监控策略详细数据")
public class MsgMonitorDetailEs {
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;

    @ApiModelProperty("通道名称")
    private String channelName;
    @ApiModelProperty("通道id")
    private String channelId;
    @ApiModelProperty("发送器")
    private String senderCode;
    @ApiModelProperty("短信类型")
    private String smsType;
    @ApiModelProperty("触发时间")
    private Date dt;
    @ApiModelProperty("策略等级")
    private String frequencyLevel;
    @ApiModelProperty("策略成功率")
    private String frequencyRate;
    @ApiModelProperty("下发成功率")
    private String triggerRate;

}
