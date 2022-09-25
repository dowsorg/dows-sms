package org.dows.sms.api.quartz;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: QuartzQueryVo
 * @Description: 用以查询
 * @date 2021/11/2311:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuartzQueryVo {
    @ApiModelProperty(value = "消息类型", required = false)
    private String msgType;
    @ApiModelProperty(value = "appid", required = false)
    private String appId;
    @ApiModelProperty(value = "用户账号", required = false)
    private String merchantNo;
    @ApiModelProperty(value = "短信签名", required = false)
    private String signature;
}
