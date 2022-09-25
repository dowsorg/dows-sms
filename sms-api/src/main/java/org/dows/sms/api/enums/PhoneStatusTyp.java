package org.dows.sms.api.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

/**
 * 运营商类型
 */
public enum PhoneStatusTyp {
    //0 空号，1 实号，2 停机，3 库无，4 沉默号，5 风险号
    EMPTY_NUMBER(0, "空号"),
    TRUE_NUMBER(1, "实号"),
    SHUTDOWN_NUMBER(2, "停机"),
    DB_NONE_NUMBER(3, "库无"),
    SILENCE_NUMBER(4, "沉默号"),
    RISK_NUMBER(5, "风险号");

    @Getter
    private final Integer no;
    @Getter
    private final String desc;

    PhoneStatusTyp(Integer no, String desc) {
        this.no = no;
        this.desc = desc;
    }

    public static PhoneStatusTyp getPhoneStatusTyp(Integer no) {
        return Arrays.stream(PhoneStatusTyp.values())
                .filter(operatorTyp -> Objects.equals(operatorTyp.getNo(), no))
                .findFirst()
                .orElse(null);
    }


}
