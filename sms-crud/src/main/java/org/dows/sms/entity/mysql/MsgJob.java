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
 * 消息job,申请审核通过后会创建一个job,根据cron自动执行发送(MsgJob)表实体类
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
@ApiModel(value = "MsgJob对象", description = "消息job,申请审核通过后会创建一个job,根据cron自动执行发送")
public class MsgJob implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("job编号")
    //@NotEmpty(message = "job编号不能为空")
    private String jobNo;
    @ApiModelProperty("消息类型（1:营销,2:行业,3:语音）")
    //@NotEmpty(message = "消息类型不能为空")
    private Integer msgTyp;
    @ApiModelProperty("调度表达式")
    //@NotEmpty(message = "调度表达式不能为空")
    private String cronExpr;
    @ApiModelProperty("提取表达式(sql://*；el://)")
    private String ruleExpr;
    @ApiModelProperty("号码提取接口，业务方提供，参数为ruleExpr，根据cron表达式,获取一批手机号")
    private String dataApi;
    @ApiModelProperty("执行次数")
    private Integer count;
    @ApiModelProperty("全局唯一应用编号或ID")
    private String appNo;
    @ApiModelProperty("商户或租户号")
    //@NotEmpty(message = "商户或租户号不能为空")
    @TenantNoQuery
    @TenantNoInsert
    private String merchantNo;
    @ApiModelProperty("状态(0:启用,1:停用)")
    private Integer status;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;

    @ApiModelProperty("消息模板no")
    private String templateNo;

    @ApiModelProperty("消息签名")
    private String signature;

    @ApiModelProperty("quartz任务名称")
    private String jobName;
    @ApiModelProperty("quartz任务组名称")
    private String jobGroupName;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
