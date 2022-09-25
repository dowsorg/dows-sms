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
import org.dows.framework.crud.api.annotation.TenantNoInsert;
import org.dows.framework.crud.api.annotation.TenantNoQuery;
import org.dows.framework.crud.mybatis.CrudEntity;

import java.util.Date;

/**
 * 手机号提取规则(MsgRule)表实体类
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
@ApiModel(value = "MsgRule对象", description = "手机号提取规则")
public class MsgRule implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("规则编号")
    //@NotEmpty(message = "规则编号不能为空")
    private String ruleNo;
    @ApiModelProperty("规则名称")
    //@NotEmpty(message = "规则名称不能为空")
    private String ruleName;
    @ApiModelProperty("规则码")
    //@NotEmpty(message = "规则码不能为空")
    private String ruleCode;
    @ApiModelProperty("商户或租户号")
    //@NotEmpty(message = "商户或租户号不能为空")
    @TenantNoQuery
    @TenantNoInsert
    private String merchantNo;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @ApiModelProperty("提取表达式(sql://*；el://)")
    //@NotEmpty(message = "提取表达式")
    private String ruleExpr;
    @ApiModelProperty("号码提取接口，业务方提供，参数为ruleExpr，根据cron表达式,获取一批手机号")
    private String dataApi;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
