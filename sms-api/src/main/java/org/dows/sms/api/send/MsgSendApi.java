//package org.dows.sms.api.send;
//
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import org.dows.framework.api.Response;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//
///**
// * 短信发送对外暴露接口
// */
//public interface MsgSendApi {
//    @PostMapping("/industrial")
//    @ApiOperation(value = "行业短信接口")
//    Response<SmsResult> sendIndustrial(
//            @ApiParam(value = "行业短信body", required = true)
//            @RequestBody @Validated IndustrialSms industrialSms,
//            @RequestHeader(required = false) String userInfo,
//            @RequestHeader(required = true) String uid,
//            @RequestHeader(required = true) String appId,
//            @RequestHeader(required = true) String tenantId,
//            @RequestHeader(required = false) Integer msgTyp,
//            @RequestHeader(required = false) Integer directive);
//
//    @PostMapping("/market")
//    @ApiOperation(value = "营销短信接口")
//    Response<SmsResult> sendMarket(
//            @ApiParam(value = "营销短信body", required = true)
//            @RequestBody @Validated MarketSms marketSms,
//            @RequestHeader(required = false) String userInfo,
//            @RequestHeader(required = true) String uid,
//            @RequestHeader(required = true) String appId,
//            @RequestHeader(required = true) String tenantId,
//            @RequestHeader(required = false) Integer msgTyp,
//            @RequestHeader(required = false) Integer directive);
//
//    @PostMapping("/voice")
//    @ApiOperation(value = "语音验证码接口")
//    Response<SmsResult> sendVoice(
//            @ApiParam(value = "语音短信body", required = true)
//            @RequestBody @Validated VoiceSms voiceSms,
//            @RequestHeader(required = false) String userInfo,
//            @RequestHeader(required = true) String uid,
//            @RequestHeader(required = true) String appId,
//            @RequestHeader(required = true) String tenantId,
//            @RequestHeader(required = false) Integer msgTyp,
//            @RequestHeader(required = false) Integer directive);
//
//    @PostMapping("/voice/notify")
//    @ApiOperation(value = "语音通知接口")
//    Response<SmsResult> sendVoiceNotify(
//            @ApiParam(value = "语音通知body", required = true)
//            @RequestBody @Validated VoiceNotifySms voiceNotifySms,
//            @RequestHeader(required = false) String userInfo,
//            @RequestHeader(required = true) String uid,
//            @RequestHeader(required = true) String appId,
//            @RequestHeader(required = true) String tenantId,
//            @RequestHeader(required = false) Integer msgTyp,
//            @RequestHeader(required = false) Integer directive);
//}
