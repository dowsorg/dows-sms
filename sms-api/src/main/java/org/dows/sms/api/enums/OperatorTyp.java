package org.dows.sms.api.enums;

import lombok.Getter;
import org.dows.sms.api.constant.SmsConsts;

import java.util.Arrays;
import java.util.Objects;

/**
 * 运营商类型
 */
public enum OperatorTyp {
    // 营销
    CHAINA_MOBILE_LTD("中国移动", 0, org.dows.sms.api.constant.SmsConsts.PhoneLib.CHAINA_MOBILE_LTD),
    // 行业
    CHAINA_TELECOM_LTD("中国电信", 1, org.dows.sms.api.constant.SmsConsts.PhoneLib.CHAINA_TELECOM_LTD),
    // 语音
    CHAINA_UNICOM_LTD("中国联通", 2, SmsConsts.PhoneLib.CHAINA_UNICOM_LTD);

    @Getter
    private final Integer no;
    @Getter
    private final String name;

    @Getter
    private final String code;

    OperatorTyp(String name, Integer no, String code) {
        this.name = name;
        this.no = no;
        this.code = code;
    }

    public static OperatorTyp getOperatorTyp(Integer no) {
        return Arrays.stream(OperatorTyp.values())
                .filter(operatorTyp -> Objects.equals(operatorTyp.getNo(), no))
                .findFirst()
                .orElse(null);
    }

    public static OperatorTyp getMsgTypeByName(String name) {
        return Arrays.stream(OperatorTyp.values())
                .filter(operatorTyp -> Objects.equals(operatorTyp.getName(), name))
                .findFirst()
                .orElse(null);
    }
}
