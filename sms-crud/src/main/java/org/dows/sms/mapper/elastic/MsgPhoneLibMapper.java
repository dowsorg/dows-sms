package org.dows.sms.mapper.elastic;


import org.dows.sms.entity.elastic.MsgPhoneLib;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgPhoneLibMapper extends ElasticsearchRepository<MsgPhoneLib, String> {
}
