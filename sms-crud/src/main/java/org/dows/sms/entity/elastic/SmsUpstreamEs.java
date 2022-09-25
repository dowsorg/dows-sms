//package org.dows.sms.entity.elastic;
//
//import io.swagger.annotations.ApiModel;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
///**
// * @Title: SmsUpstreamEs
//
// * @Description: 用户发送的数据内容
// * @date 2021/11/1613:53
// */
//@Document(indexName = "sms_upstream")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//@ApiModel("短信上行数据")
//public class SmsUpstreamEs extends SmsUpstream {
//    @Id
//    @Field(type = FieldType.Auto, store = true, index = false)
//    private String id;
//}
