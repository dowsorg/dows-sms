package org.dows.sms.api.alert.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SmsCurrentUsedDTO {

    @ApiModelProperty(value = "ID", required = false)
    private String id;

    @ApiModelProperty(value = "通道商配置ID", required = true)
    private String channelProviderId;

    @ApiModelProperty(value = "短信签名", required = true)
    private String sign;

    @ApiModelProperty(value = "短信类型", required = true)
    private String smsType;

    @ApiModelProperty(value = "通道商名称", required = false)
    private String name;

}
