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
 * 消息指令job(MsgDirective)表实体类
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
@ApiModel(value = "MsgDirective对象", description = "消息指令job")
public class MsgDirective implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("调度表达式")
    private String cronExpr;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("指令编号")
    //@NotEmpty(message = "指令编号不能为空")
    private String directiveNo;
    @ApiModelProperty("指令名称")
    //@NotEmpty(message = "指令名称不能为空")
    private String directiveName;
    @ApiModelProperty("指令类型（sf|td|cd即时、定时、周期）")
    //@NotEmpty(message = "指令类型不能为空")
    private Integer directiveTyp;
    @ApiModelProperty("商户或租户号")
    //@NotEmpty(message = "商户或租户号不能为空")
//    @TenantNoQuery
    private String merchantNo;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
