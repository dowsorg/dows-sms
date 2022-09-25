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
import org.dows.framework.crud.mybatis.CrudEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 消息接入申请(MsgApply)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgApply对象", description = "消息接入申请")
public class MsgApply implements CrudEntity {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("申请编号")
    //@NotEmpty(groups = {InsertValid.class}, message = "申请编号不能为空")
    private String applyNo;
    //@TenantNoQuery
    // @TenantNoInsert
    @ApiModelProperty("商户或租户号")
    //  @TableField(value = "merchant_no", condition = SqlCondition.LIKE)
    private String merchantNo;
    @ApiModelProperty("全局唯一应用编号或ID")
    //@NotEmpty(groups = {InsertValid.class}, message = "全局唯一应用编号或ID不能为空")
    private String appNo;
    @ApiModelProperty("应用下载链接")
    private String appUrl;
    @ApiModelProperty("消息类型（1:营销,2:行业,3:语音）")
//    @Min(value = 1, message = "消息类型取值为1,2,3", groups = {InsertValid.class, UpdateValid.class})
//    @Max(value = 3, message = "消息类型取值为1,2,3", groups = {InsertValid.class, UpdateValid.class})
    private Integer msgTyp;
    @ApiModelProperty("消息签名")
    // //@NotEmpty(groups = {InsertValid.class}, message = "消息签名不能为空")
    private String signature;
    @ApiModelProperty("消息价格")
    private BigDecimal price;
    @ApiModelProperty("消息内容最大长度")
    private Integer maxLength;
    @ApiModelProperty("消息模板内容（动态填充）")
    private String templateContent;
    @ApiModelProperty("对业务方的回调接口")
    private String callbackApi;
    @ApiModelProperty("指令编号或ID")
    private String directiveNo;
    @ApiModelProperty("规则编号或ID")
    private String ruleNo;
    @ApiModelProperty("指令类型（sf|td|cd即时、定时、周期）")
    private Integer directiveTyp;
    @ApiModelProperty("审核是否通过（0:待审核，1：审核通过，2审核拒绝）")
    private Integer checked;
    @ApiModelProperty("是否测试（0:否，1：是）")
    @JsonIgnore
    // @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean test;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("消息模板no")
    private String templateNo;
    @ApiModelProperty("申请描述")
    private String applyDescr;
    @ApiModelProperty("审核时间")
    private Date checkedTime;
    @ApiModelProperty("审核人")
    private String checkedUser;
    @ApiModelProperty("审核描述")
    private String checkedDescr;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    @ApiModelProperty("签名类型。0系统签名1用户自定义")
    private Integer signTyp;
    @ApiModelProperty("用户id")
    // @UserIdInsert(inQuery = false)
    private String userId;
    @ApiModelProperty("用户名")
    //  @UserNameInsert(inQuery = false)
    private String accountName;
    @ApiModelProperty("app名称")
    //@NotEmpty(groups = {InsertValid.class}, message = "全局唯一应用编号或ID不能为空")
    private String appName;
    @ApiModelProperty("租户名称")
    //@TenantNameInsert
    private String tenantName;
}
