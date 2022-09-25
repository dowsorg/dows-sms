package org.dows.sms.entity.elastic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 消息账单（job每天24点定时生成前一天数据）(MsgBilling)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Document(indexName = "msg_billing_day")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel(value = "MsgBilling对象", description = "消息账单（job每天24点定时生成前一天数据）")
public class MsgBillingEs {

    //    @Field(type = FieldType.Auto, store = true, index = false)
//    private Long id;
    @ApiModelProperty("账单编号")
    private String billingNo;
    @ApiModelProperty("发送器对应的消息类型（1:营销,2:行业,3:语音）")
    private String msgTyp;

    @ApiModelProperty("通道名称")
    private String channelName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("发送总条数(未拆分)")
    private Long count;
    @ApiModelProperty("成功总条数(未拆分)")
    private Long successCount;
    @ApiModelProperty("失败总条数(未拆分)")
    private Long failedcount;
    @ApiModelProperty("拆分总条数")
    private Long totalCount;
    @ApiModelProperty("全局唯一应用编号或ID")
    private String appNo;
    @ApiModelProperty("商户号")
    private String merchantNo;
    @ApiModelProperty("用户账号")
    private String accountNo;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("成功总条数(已拆分)")
    private Long successTotalCount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计费总条数")
    private Long chargeTotalCount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("失败总条数(已拆分)")
    private Long failedTotalCount;

    @ApiModelProperty("账单日期")
    private String billingDate;

    @ApiModelProperty("统计依据")
    @Id
    private String groupKey;
    @ApiModelProperty("通道id")
    private String channelId;
    @ApiModelProperty("签名")
    private String sign;
    @ApiModelProperty("通道账户")
    private String account;


}
