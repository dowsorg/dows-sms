package org.dows.sms.api.alert.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel
public class SmsChannelProviderDTO {

    @ApiModelProperty(value = "通道商户ID", required = false)
    private String id;

    @ApiModelProperty(value = "通道商名称", required = true)
    private String name;

    @ApiModelProperty(value = "账号", required = true)
    private String account;

    @ApiModelProperty(value = "密钥", required = true)
    private String password;

    @ApiModelProperty(value = "短信类型", required = true)
    private String smsType;

    @ApiModelProperty(value = "长号码", required = false)
    private String longNumber;

    @ApiModelProperty(value = "签名", required = true)
    private String sign;

    @ApiModelProperty(value = "通道商户编码", required = true)
    private String code;

    @ApiModelProperty(value = "是否自动加入签名", required = true)
    private Integer isSigned;
}
