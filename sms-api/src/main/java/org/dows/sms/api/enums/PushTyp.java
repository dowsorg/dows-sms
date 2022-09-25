package org.dows.sms.api.enums;

import lombok.Getter;

/**
 * 推送类型
 */
public enum PushTyp {

    SMS(0, "短信推送", "//"),
    EMAIL(1, "邮箱推送", "//"),
    MSG(2, "消息推送", "//"),
    WEIXIN(3, "微信推送", "//"),
    ;

    @Getter
    int val;
    @Getter
    String descr;
    @Getter
    String ruleExpr;

    PushTyp(int val, String descr, String ruleExpr) {
        this.descr = descr;
        this.val = val;
        this.ruleExpr = ruleExpr;
    }
}
