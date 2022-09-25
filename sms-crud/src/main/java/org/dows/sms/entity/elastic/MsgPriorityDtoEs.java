package org.dows.sms.entity.elastic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Title: SmsPriorityDtoEs
 * @Description: 通道发送数据 排分统计落库
 * 在每一次到设置的间隔时 ，自动落库
 * @date 2021/11/1715:56
 */
@Document(indexName = "msg_priority")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class MsgPriorityDtoEs {
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;

    private String smsType;

}
