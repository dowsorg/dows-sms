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
import java.util.Date;

@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgMcStrategy对象", description = "监控配置数据")
public class MsgMcStrategy implements CrudEntity {
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
    @ApiModelProperty("策略等级")
    @NotNull
    private String level;

    @ApiModelProperty("需要提醒的成功率")
    @NotNull
    @Min(value = 1, message = "值至少为1")
    private String rate;
    @ApiModelProperty("发送器暂停使用时间")
    @NotNull
    private Integer senderSilenceTime;
    @ApiModelProperty("允许通知")
    private Boolean isNotify;
    @ApiModelProperty("通知方式，0短信/1企业微信")
    private String notifyTyp;
    @ApiModelProperty("config表id")
    private Long mcId;
    @ApiModelProperty("短信类型,1营销2行业")
    @NotNull
    private String smsType;
    @ApiModelProperty("监控最低条数")
    @NotNull
    @Min(value = 10, message = "监控最低条数至少为10")
    private Integer minimumCount;

}
