package org.dows.sms.entity.mysql;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.SqlCondition;
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

import java.util.Date;

/**
 * 消息实列(MsgInstance)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgInstance对象", description = "消息实列")
public class MsgInstance implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("消息实列编号（指令id+签名id+模板id+通道id+租户号+当前时间）redis缓存该序列号对应的对象")
    private String msgNo;
    @ApiModelProperty("签名id")
    private String signatureNo;
    @ApiModelProperty("通道id")
    //@NotEmpty(message = "通道id不能为空", groups = {InsertValid.class})
    private String channelNo;
    @ApiModelProperty("通道名称")

    @TableField(value = "channel_name", condition = SqlCondition.LIKE)
    private String channelName;
    @ApiModelProperty("发送器id")
    private String senderNo;
    //    @Min(value = 1, groups = {InsertValid.class}, message = "消息类型取值为1,2，3")
//    @Max(value = 3, groups = {InsertValid.class}, message = "消息类型取值为1,2，3")
    @ApiModelProperty("消息类型（1:营销,2:行业,3:语音）")
    private Integer msgTyp;
    @ApiModelProperty("消息类型名称")
    //@NotEmpty(message = "消息类型名称不能为空", groups = {InsertValid.class})
    private String msgTypName;
    @ApiModelProperty("对业务方的回调接口")
    private String callbackApi;
    @ApiModelProperty("商户或租户号")
    //@NotEmpty(message = "商户或租户号不能为空", groups = {InsertValid.class})
    @TenantNoQuery
    @TableField(value = "merchant_no", condition = SqlCondition.LIKE)
    private String merchantNo;
    @ApiModelProperty("全局唯一应用编号或ID")
    private String appNo;
    @ApiModelProperty("是否测试（0:否，1：是）")
    @JsonIgnore
    //  @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean test;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;

    @ApiModelProperty("签名")
    //@NotEmpty(message = "签名不能为空", groups = {InsertValid.class})
    private String singnature;
    @ApiModelProperty("通道码")
    private String channelCode;
    @ApiModelProperty("发送器编码")
    private String senderCode;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    //  @ApiModelProperty("用户id")
    //  private String userId;
    //  @ApiModelProperty("用户名")
    //  private String userName;
    @ApiModelProperty("状态 0不可用1可用")
    private Integer status;
    @ApiModelProperty("租户名称")
    private String tenantName;
    @ApiModelProperty("应用名称")
    private String appName;
}