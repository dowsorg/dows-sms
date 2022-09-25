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

import java.util.Date;

/**
 * 消息模型定义(MsgEntity)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-18 20:42:58
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgEntity对象", description = "消息模型定义")
public class MsgEntity implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("实体编号或ID")
    private String entityNo;
    @ApiModelProperty("推送方式(0:短信推送,1:邮箱推送,2:消息推送，3:社交账号推送【微信，QQ...】)")
    private Integer pushTyp;
    @ApiModelProperty("发送器对应的消息类型（1:营销,2:行业,3:语音）")
    private Integer msgTyp;
    @ApiModelProperty("自定义ID")
    private String customId;
    @ApiModelProperty("接受者(手机号/邮箱/社交账号等...)")
    private String msgAccepter;
    @ApiModelProperty("签名或主题")
    private String topic;
    @ApiModelProperty("消息内容")
    private String content;
    @ApiModelProperty("是否测试标记")
    private Boolean test;
    @ApiModelProperty("全局唯一应用编号或ID")
    private String appNo;
    @ApiModelProperty("商户号")
    private String merchantNo;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
