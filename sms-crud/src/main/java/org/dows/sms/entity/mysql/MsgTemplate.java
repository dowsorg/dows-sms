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
 * 消息模板(MsgTemplate)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:39
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgTemplate对象", description = "消息模板")
public class MsgTemplate implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("模板编号")
    //@NotEmpty(message = "模板编号不能为空")
    private String templateNo;
    @ApiModelProperty("模板名称")
    //@NotEmpty(message = "模板名称不能为空")
    private String templateName;
    @ApiModelProperty("模板码")
    //@NotEmpty(message = "模板码不能为空")
    private String templateCode;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @ApiModelProperty("模板内容（动态填充）")
    //@NotEmpty(message = "模板内容不能为空")
    private String templateContent;
    @ApiModelProperty("消息类型（0：验证类，1：营销类，2：通知类）")
    //@NotEmpty(message = "消息类型不能为空")
    private Integer msgTyp;
    @ApiModelProperty("商户或租户号")
    //@NotEmpty(message = "商户或租户号不能为空")
    @TenantNoQuery
    @TenantNoInsert
    private String merchantNo;
    @ApiModelProperty("状态(0:启用,1:停用)")
    private Integer status;

    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
