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
 * 消息账号(MsgAccount)表实体类
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
@ApiModel(value = "MsgAccount对象", description = "消息账号")
public class MsgAccount implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("账号编号.云平台统一账号编号")
    ////@NotEmpty(message = "账号编号不能为空")
    private String accountNo;
    @ApiModelProperty("账号")
    ////@NotEmpty(message = "账号不能为空")
    private String account;
    @ApiModelProperty("密码")
    ////@NotEmpty(message = "密码不能为空")
    private String password;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("商户号")
//    @TenantNoQuery
    private String merchantNo;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;


}
