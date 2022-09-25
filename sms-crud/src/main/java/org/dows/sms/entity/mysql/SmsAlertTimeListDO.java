package org.dows.sms.entity.mysql;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("sms_alert_timelist")
@ApiModel(value = "通道警告配置", description = "通道警告配置")
public class SmsAlertTimeListDO implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    private String startTime;
    private String endTime;
    private String timeNum;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;

}
