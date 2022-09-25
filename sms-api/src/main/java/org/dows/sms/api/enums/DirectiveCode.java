package org.dows.sms.api.enums;

import lombok.Getter;

import java.util.Arrays;

public enum DirectiveCode {
    // 立即发送指令（即时/即刻）
    SPEED(0, "sf", "即时"),
    // 定时发送指令（定时/一次性）
    TIMING(1, "td", "定时"),
    // 计划发送指令（现在/将来/周期性）
    CRON(2, "cd", "周期");
    @Getter
    private int no;
    @Getter
    private String name;
    @Getter
    private String desc;

    DirectiveCode(int no, String name, String desc) {
        this.no = no;
        this.name = name;
        this.desc = desc;
    }

    public static DirectiveCode getDirectiveCodeByNo(int no) {
        return Arrays.stream(DirectiveCode.values())
                .filter(code -> code.getNo() == no)
                .findFirst()
                .orElse(null);
    }
}
