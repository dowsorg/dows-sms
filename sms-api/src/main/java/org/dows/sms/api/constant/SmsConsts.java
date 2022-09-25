package org.dows.sms.api.constant;


public class SmsConsts {
    /**
     * 梦网科技相关常量
     */
    public static final String MWKJ_SEND_STR = "00000000";
    /**
     * elasticsearch索引
     */
    public static final String INDEX_SMS_DETAIL = "sms_detail_all";
    public static final String INDEX_SMS_UPSTREAM = "sms_upstream";
    public static final String INDEX_SMS_DETAIL_MONTH = "sms_detail-";
    public static final String INDEX_SMS_BILL_DAY = "msg_billing_day";
    public static final String INDEX_SMS_REQUEST_LIST_MONTH = "msg_request_list_";
    public static final String INDEX_SMS_SEND_DETAIL_MONTH = "msg_send_detail_";
    public static final String INDEX_SMS_LOGS_MONTH = "msg_logs_";
    /**
     * 查询elasticsearch默认大小
     */
    public static final int SEND_DETAIL_RESPONSE_SIZE = 200;
    public static final int UPSTREAM_RESPONSE_SIZE = 10000;
    /**
     * 查询elasticsearch默认超时时间
     */
    public static final long SEARCH_TIME_OUT = 30;
    /**
     * 短信预警redisKey
     */
    public static final String WARN_LOCK = "Warn_lockKey";
    public static final String WARN_API_FREQUENCY = "TAIYI:Warn:API_Frequency:";
    public static final String WARN_CONTACT_PERSON = "TAIYI:Warn:Contact_Person:";
    public static final String WARN_ACCOUNT_AUTH = "TAIYI:Warn:SMS_Auth:userInfo";
    public static final String WARN_SERVICE = "sms";
    public static final String WARN_ACTION_MARKET = "market";
    public static final String WARN_ACTION_VOICE_NNOTIFY = "voiceNotify";
    public static final String WARN_RECEIPT = "SMS:CHANNEL:RECEIPT:";
    /**
     * 短信通道服务商 zset key
     */
    public static final String SMS_PROVIDER_ROUTER_ZSET_KEY = "SMS:PROVIDER:ROUTER:";
    /**
     * sms engine启动初始化的缓存内容
     */
    public static final String SMS_ENGINE_KEY = "SMS:CHANNEL:";
    public static final String SMS_CONFIG_KEY = "SMS:CONFIG:"; //系统配置
    public static final String SMS_SEND_RECORD = "SMS:RECORDS:"; //发送详细数据，如果存入es失败，暂放redis
    /**
     * 类型对应的发送器
     */
    public static final String SMS_TYP_SENDERS = "SMS:TYP:SENDERS:";
    //  public static final int WARN_RECEIPT_TIMEOUT=60; //S
    // ============= redis key =============
    public static final String SMS_SIGN_CHANNEL_KEY = "SMS:SIGN:";
    public static final String SMS_INSTANCE_KEY = "SMS:INSTANCE:";
    /**
     * 短信通道服务商每天发送总次数次数前缀
     */
    public static final String SMS_PROVIDER_STATISTICS = "SMS:PROVIDER:STATISTICS";
    /**
     * 短信通道服务商发送失败次数总计前缀
     */
    public static final String SMS_PROVIDER_STATISTICS_FAILED = "SMS:PROVIDER:STATISTICS:FAILED";
    /**
     * redis 中存放的 成功率  暂时以短信类型作为初始择优划分。比如，行业短信选择 成功率最高的通道优先
     */
    public static final String SMS_PRIORITY_KEY = "SMS:SMS_PRIORITY:";
    public static final String TEMPLATE_DIR = "\\src\\main\\resources\\template\\";

    /**
     * 系统实例配置。
     */
    public static class MsgServiceSysData {
        public static final String APP_ID = "msg-service-appId";
        public static final String U_ID = "sys-user";
        public static final Integer MSG_TYP = 2;

    }

    public static class ChannelProvider {
        public static final String BST_NAME = "博士通";
        public static final String WLWX_NAME = "未来无线";
        public static final String ZSKL_NAME = "兆升凯莱";
        public static final String YMRT_NAME = "亿美软通";
        public static final String ZWX_NAME = "中网信";
        public static final String LHWT_NAME = "联合维拓";
        public static final String MWKJ_NAME = "梦网科技";
        public static final String WT_NAME = "沃淘信息";
        public static final String XSXX_NAME = "线上线下";
        public static final String XMJW_NAME = "厦门集微";
        public static final String YLA_NAME = "易路安";
        /**
         * 亿美软通地址
         */
        public static final String YMRT_INDUSTRY_URL = "http://shmtn.b2m.cn:80";

        /**
         * 亿美软通营销地址
         */
        public static final String YMRT_MARKET_URL = "http://sh2mtn.b2m.cn:8081";

        /**
         * 亿美软通语音地址
         */
        public static final String YMRT_VOICE_URL = "http://voice.b2m.cn:80";

        /**
         * 沃淘行业短信地址
         */
        public static final String WT_INDUSTRY_URL = "http://114.116.26.124:8001";

        /**
         * 沃淘营销短信地址
         */
        public static final String WT_MARKET_URL = "http://122.144.203.24:8001";
        /**
         * 厦门集微营销短信地址
         */
        public static final String XMJW_URL = "http://hbsmservice.com:8080";


        /**
         * 梦网科技地址服务账号：J80232     密码：644994
         */
        public static final String MWKJ_URL = "http://61.145.229.28:6101";
        /**
         * 测试地址
         */
        public static final String TEST_URL = "http://localhost:8081";
        public static final String XMJW_VOICENOTIFY_URL = "http://verifycode.baiwutong.com:9999/voicenotify/";
        public static final String XMJW_VOICE_URL = "http://verifycode.baiwutong.com:8888/VoiceClient/";

        /**
         * 易路安营销短信地址
         */
        public static final String YLA_URL = "http://114.55.203.205";
    }

    /**
     * kafka的topic
     */
    public static final class KafkaTopic {
        public static final String SMS_SEND_RECORD = "SmsSendRecord";
        public static final String SMS_SEND_RECEIPT = "SmsSendReceipt";
    }

    /**
     * 发送短信状态
     */
    public static final class SendStatus {

        /**
         * 0:发送成功，1:发送失败，2:还未有回执状态
         */
        public static final Integer SEND_SUCCESS = 0;
        public static final Integer SEND_FAILED = 1;
        public static final Integer SEND_WAIT_RECEIPT = 2;
        public static final String SUCCESS = "SUCCESS";

        /**
         * 调用通道商接口正常， 但是其中取值为非正常发送状态码，并需要进行重试 的发送记录 此时填入的状态码
         */
        public static final String RETRY_PROVIDER_RESPONSE_STATUS = "FALSE";
        public static final String RETRY_PROVIDER_RESPONSE_NAME = "调用该通道失败进入重试操作";
    }

    /**
     * 短信类型
     */

    public static final class SmsType {
        public static final String INDUSTRIAL = "行业";
        public static final String MARKET = "营销";
        public static final String VOICE = "语音";
        public static final String SMS_OTHER = "其它";
    }

    public static final class HttpResponse {
        public static final String SUCCESS = "success";
        public static final int SUCCESS_INT = 0;
        public static final String SUCCESS_OK = "ok";
        public static final String SUCCESS_NUM = "0000";
    }

    public static final class PhoneLib {
        public static final String LIB_INDEX_NAME = "msg_phone_lib";

        public static final String CHAINA_MOBILE_LTD = "CHINA_MOBILE";
        public static final String CHAINA_UNICOM_LTD = "CHINA_UNICOM";
        public static final String CHAINA_TELECOM_LTD = "CHINA_TELECOM";

    }

    public static final class ValidPhoneConfig {
        public static final String VALID_PHONE_URL = "http://apis.juhe.cn/";
        public static final int PHONE_INFO_CACHE = 0;
        public static final int PHONE_INFO_CURRENT = 1;
        public static final int PHONE_INFO_CACHE_CUR = 2;
        //0bc60faee2a766b667044493e2c9c87c 线上在用这个key 20211228 。下面这个也能用，有条数限制，正式上线记得换回这个啊啊啊啊啊！！！！
        //e61fa7741c3cc1fec45dac1045fc6401
        public static final String VALID_PHONE_KEY = "0bc60faee2a766b667044493e2c9c87c";
        public static final String INDEX_SMS_PHONE_INFO = "sms_phone_info";
        public static final String INDEX_SMS_PHONE_INFO_TYPE = "sms_phone_info";
        public static final String INDEX_SMS_PHONE_INFO_QUERY = "sms_phone_info_query";
        public static final String INDEX_SMS_PHONE_INFO_QUERY_TYPE = "sms_phone_info_query";
        public static final String PHONE_INFO_REDIS_PRE = "itservice:sms:phone:"; // 在redis中记录号码。保存7天
        public static final int PHONE_INFO_REDIS_TTL = 7; //day

        public static final String VALID_PHONE_BATCH_KEY = "8f45f0a9aebb872986a8aa8c469e8860";
    }

    public static final class ChannelAlert {
        public static final String SMS_ALERT_PER = "alertpercent";
        public static final String SMS_CHANGE_PER = "changepercent";
        public static final String SMS_CHANGE_PER_ONCE = "changebyonce";
        public static final String SMS_MONITOR_LIST = "smsmonitorlist";
        public static final String SMS_MIN_NUM = "smsminnum";
        public static final String SMS_MAX_NUM = "smsmaxnum";
        public static final String ERR_PERCENT_MAP = "errPercentMap";
        public static final String MSG_CAHNNEL_SILENCE = "MSG:CHANNEL:SILENCE:";
    }

    public static final class QuartzConfig {
        public static final String MSG_JOB_GROUP_NAME = "group-msg-job"; //msgjob的定时任务名称，使用 -msgjob表中的id或no
        public static final String MSG_JOB_JOB_NAME = "msg-job-";

        public static final String RECEIPT_JOB_GROUP_NAME = "group-receipt-warn"; //监视回执异常
        public static final String RECEIPT_JOB_NAME = "receipt-warn-job";
        public static final String RECEIPT_JOB_CRON = "0 */10 * * * ?";

        public static final String MSG_BILL_JOB_GROUP_NAME = "group-msg-bill"; //统计前一天的账单
        public static final String MSG_BILL_JOB_NAME = "msg-bill-job";
        public static final String MSG_BILL_JOB_CRON = "0 0 23 * * ?";
        public static final String BILL_MONTH_JOB_GROUP_NAME = "group-msg-bill-month"; //统计YUEDU的账单
        public static final String BILL_MONTH_JOB_NAME = "msg-bill-job-month";
        public static final String BILL_MONTH_JOB_CRON = "0 0 2 2 * ? *";  //每个月2号凌晨2点写阅读账单
        public static final String MSG_MONITOR_GROUP_NAME = "group-msg-monitor"; //监视回执异常
        public static final String MSG_MONITOR_JOB_NAME = "msg-monitor-job-"; //加一个随机数
    }
}
