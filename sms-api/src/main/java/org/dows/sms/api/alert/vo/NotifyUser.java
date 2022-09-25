package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: Noti
 * @Description: TODO
 * @date 2021/12/3118:51
 */
@ApiModel("短信监控配置推送人员")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotifyUser implements Serializable {
    //    @ApiModelProperty("推送类型0短信1企业微信")
//    private Integer notifyType;
//    @ApiModelProperty("具体人员信息")
//    List<NotifyUserVo> notifyUsers;
    @ApiModelProperty("用户姓名")
    private String userCnName;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("工号")
    private String userId;
    @ApiModelProperty("群组")
    private List<String> userGroups;
    @ApiModelProperty("是否为常用联系人")
    private Boolean isCommon;
}
