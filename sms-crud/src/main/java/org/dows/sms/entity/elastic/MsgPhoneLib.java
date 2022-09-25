package org.dows.sms.entity.elastic;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@ApiModel
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "msg_phone_lib")
public class MsgPhoneLib {
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;

    private String phoneNumer;
    private String local;

    private Integer operatorNo;

    private Integer numberStatus;

    private Integer searchCount;

    private boolean deleted;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyyMMddHHmmss")
    private Date createTime;


}
