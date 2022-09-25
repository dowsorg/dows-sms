package org.dows.sms.entity.mysql;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.api.annotation.TenantNoQuery;
import org.dows.framework.crud.mybatis.CrudEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 消息账单（job每天24点定时生成前一天数据）(MsgBilling)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgBilling对象", description = "消息账单（job每天24点定时生成前一天数据）")
public class MsgBilling implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("账单编号")
    private String billingNo;
    @ApiModelProperty("发送器对应的消息类型（1:营销,2:行业,3:语音）")
    private String msgTyp;
    @ApiModelProperty("通道编号或ID")
    private String channelNo;
    @ApiModelProperty("通道名称")
    private String channelName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("总条数")
    private Long count;
    @ApiModelProperty("全局唯一应用编号或ID")
    private String appNo;
    @ApiModelProperty("商户号")
    @TenantNoQuery
    private String merchantNo;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("成功总条数")
    private Long successCount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计费总条数")
    private Long chargeCount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("失败总条数")
    private Long failedCount;
    @ApiModelProperty("总价")
    private BigDecimal amout;
    @ApiModelProperty("账单日期")
    private String billingDate;
    @ApiModelProperty("对账状态（1待同步，2待提交，3待审核，4待确认，5已完成，7作废，8驳回，10重提，11拒绝，12重提过的数据通过，13拒绝过的数据通过）")
    private Integer status;
    @ApiModelProperty("统计依据")
    private String groupKey;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    @ApiModelProperty("通道id")
    private String channelId;
    @ApiModelProperty("签名")
    private String sign;
    @ApiModelProperty("通道账户")
    private String account;
    @ApiModelProperty("用户账号")
    private String accountNo;
}