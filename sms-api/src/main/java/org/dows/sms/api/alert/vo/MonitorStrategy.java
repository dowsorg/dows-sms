package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "MsgMonitorStrategy对象", description = "监控策略数据")
public class MonitorStrategy implements Serializable {


    @ApiModelProperty("详细信息")
    List<StrategyVo> strategyVoList;
    @ApiModelProperty("短信类型,1营销2行业")
    @NotNull
    private String smsType;
    @ApiModelProperty("监控最低条数")
    @NotNull
    @Min(value = 10, message = "监控最低条数至少为10")
    private Integer minimumCount;


}