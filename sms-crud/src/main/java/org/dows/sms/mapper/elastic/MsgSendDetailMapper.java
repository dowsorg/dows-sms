package org.dows.sms.mapper.elastic;

import org.dows.sms.entity.elastic.MsgSendDetail;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgSendDetailMapper extends ElasticsearchRepository<MsgSendDetail, String> {
}
