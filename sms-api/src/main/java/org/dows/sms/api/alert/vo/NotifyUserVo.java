package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Title: NotifyUser
 * @Description: TODO
 * @date 2021/12/3118:47
 */
@ApiModel("短信监控配置推送人员")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotifyUserVo implements Serializable {
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("工号")
    private String userId;
    @ApiModelProperty("群组")
    private String userGroup;

}
