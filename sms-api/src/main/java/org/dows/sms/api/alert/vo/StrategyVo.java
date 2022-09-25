package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Title: StrategyVo
 * @Description: TODO
 * @date 2021/12/1016:45
 */

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyVo implements Serializable {
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
    private List<Integer> notifyTyps;
}
