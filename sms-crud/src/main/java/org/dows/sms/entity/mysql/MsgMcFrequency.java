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

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgMcFrequency对象", description = "监控配置数据")
public class MsgMcFrequency implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @ApiModelProperty("监控时间段开始时间")
    @NotNull
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$")
    private String monitorStartDt;
    @ApiModelProperty("监控时间段结束时间")
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$")
    @NotNull
    private String monitorEndDt;
    @ApiModelProperty("监控频次")
    @NotNull
    @Min(value = 3, message = "间隔至少为3")
    private Integer frequency;
    @ApiModelProperty("config表id")
    private Long mcId;


}
