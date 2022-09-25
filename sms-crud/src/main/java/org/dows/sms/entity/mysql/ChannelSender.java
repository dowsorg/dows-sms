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
import org.dows.framework.crud.mybatis.CrudEntity;

import java.util.Date;

/**
 * 通道消息发送器(ChannelSender)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ChannelSender对象", description = "通道消息发送器")
public class ChannelSender implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("发送器编号")
    //@NotEmpty(message = "发送器不能为空", groups = {InsertValid.class, UpdateValid.class})
    private String senderNo;
    //@NotEmpty(message = "通道ID不能为空", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("通道ID")
    private String channelNo;
    @ApiModelProperty("通道名称")

    @TableField(value = "channel_name", condition = SqlCondition.LIKE)
    private String channelName;

    @ApiModelProperty("通道码")
    private String channelCode;
    //    @Min(value = 1, message = "短信类型应为1,2,3", groups = {InsertValid.class, UpdateValid.class})
//    @Max(value = 3, message = "短信类型应为1,2,3", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("发送器对应的消息类型（1:营销,2:行业,3:语音）")
    private Integer msgTyp;
    @ApiModelProperty("发送器名称")
    private String senderName;

    @ApiModelProperty("发送器编码")
    private String senderCode;
    //@NotEmpty(message = "发送接口不能为空", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("发送接口")
    private String sendApi;
    @ApiModelProperty("接口参数列表")
    private String paramJson;
    @ApiModelProperty("重试次数")
    private Integer retryCount;
    @ApiModelProperty("成功应答时间")
    private Long ackTime;
    @ApiModelProperty("优先级权重等(人为定义，如果有定义，优先采用，如果没有定义，根据监控反馈自动调整)")
    private Integer weight;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    //与原型字段相比缺少是否包含签名，是否有效。
}
