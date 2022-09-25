package org.dows.sms.api.enums;

import lombok.Getter;

import java.util.Arrays;

/**
 * @Title: org.dows.sms.api.enums.SendStatusEnum
 * @Description: TODO
 * @date 2022/2/1116:16
 */
public enum SendStatusEnum {
    /**
     * 0:发送成功，1:发送失败，2:还未有回执状态
     */
    SEND_SUCCESS(0, "成功"),
    SEND_FAILED(1, "发送失败"),
    SEND_WAIT_RECEIPT(2, "还未有回执状态");

    @Getter
    private int no;
    @Getter
    private String desc;

    SendStatusEnum(int no, String desc) {
        this.no = no;

        this.desc = desc;
    }

    public static SendStatusEnum getData(int no) {
        return Arrays.stream(SendStatusEnum.values())
                .filter(code -> code.getNo() == no)
                .findFirst()
                .orElse(null);
    }
}
