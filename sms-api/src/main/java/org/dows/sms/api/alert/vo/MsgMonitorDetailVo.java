package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Title: MsgMonitorDetailVo
 * @Description: TODO
 * @date 2022/1/1314:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MsgMonitorDetailVo {
    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("短信类型")
    private String smsType;
    @ApiModelProperty("触发时间起")
    private Date dtStart;
    @ApiModelProperty("触发时间止")
    private Date dtEnd;
    @ApiModelProperty("策略等级")
    private String frequencyLevel;
    @ApiModelProperty("策略成功率")
    private String frequencyRate;
    @ApiModelProperty("下发成功率")
    private String triggerRate;

}
