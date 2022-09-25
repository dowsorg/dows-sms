package org.dows.sms.mapper.elastic;

import org.dows.sms.entity.elastic.MsgRequestList;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRequestListMapper extends ElasticsearchRepository<MsgRequestList, String> {
}
