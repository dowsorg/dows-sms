package org.dows.sms.api.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

/**
 * 短信类型
 */
public enum MsgTyp {
    // 营销
    MARKET("营销", "market", 1, "marketSender"),
    // 行业
    INDUSTRY("行业", "industry", 2, "industrySender"),
    // 语音
    VOICE("语音", "voice", 3, "voiceSender"),
    VOICE_NOTIFY("语音通知", "voice", 4, "voiceNotifySender");;

    @Getter
    private final String msgSender;
    @Getter
    private final String name;
    @Getter
    private final String code;
    @Getter
    private final Integer value;

    MsgTyp(String name, String code, int value, String msgSender) {
        this.name = name;
        this.code = code;
        this.value = value;
        this.msgSender = msgSender;
    }

    public static MsgTyp getMsgType(Integer value) {
        return Arrays.stream(MsgTyp.values())
                .filter(msgTyp -> Objects.equals(msgTyp.getValue(), value))
                .findFirst()
                .orElse(null);
    }

    public static MsgTyp getMsgTypeByName(String name) {
        return Arrays.stream(MsgTyp.values())
                .filter(msgTyp -> Objects.equals(msgTyp.getName(), name))
                .findFirst()
                .orElse(null);
    }
}
