package org.dows.sms.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@EqualsAndHashCode
@Data
public class PhoneNumber {
    // 机主
    private String owner;
    // 运营商
    private Integer mno;
    // 归属地
    private String local;
    // 手机号
    @NotEmpty
    @Pattern(regexp = "^[1]([3-9])[0-9]{9}$")
    private String phoneNo;
    // 标记类型(0:正常，1:空号，2:流量号,3...)
    private Integer flag;
}
