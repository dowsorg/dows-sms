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
 * 短信统一状态码(ChannelStatus)表实体类
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
@ApiModel(value = "ChannelStatus对象", description = "短信统一状态码")
public class ChannelStatus implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("通道id")
    private String channelNo;
    @ApiModelProperty("通道名")
    private String channelName;
    @ApiModelProperty("通道码")
    private String channelCode;
    @ApiModelProperty("通道状态码")
    private String channelStateCode;
    @ApiModelProperty("通道状态英文描述")
    private String channelStateEnDescr;
    @ApiModelProperty("通道状态描述")
    private String channelStateDescr;
    @ApiModelProperty("统一状态码")
    private String stateCode;
    @ApiModelProperty("统一状态英文描述")
    private String stateEnDescr;
    @ApiModelProperty("统一状态描述")
    private String stateDescr;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("消息类型")
    private Integer msgTyp;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
