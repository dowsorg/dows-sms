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
 * 通道实列(ChannelInstance)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:33
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ChannelInstance对象", description = "通道实列")
public class ChannelInstance implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("通道编号")
    ////@NotEmpty(message = "通道编号不能为空")
    private String channelNo;
    //@NotEmpty(message = "通道名称不能为空", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("通道名称")
    @TableField(value = "channel_name", condition = SqlCondition.LIKE)
    private String channelName;
    //@NotEmpty(message = "通道码不能为空", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("通道码")
    private String channelCode;
    @ApiModelProperty("通道主页")
    private String channelHome;
    @ApiModelProperty("是否有效")
    @TableField(fill = FieldFill.INSERT)
    private Boolean disable;
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
