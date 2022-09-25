package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "MsgMonitorFrequency", description = "监控频次配置")
public class MonitorFrequency implements Serializable {

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


}