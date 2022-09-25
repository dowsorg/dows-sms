package org.dows.sms.mapper.elastic;

import org.dows.sms.entity.elastic.MsgPriorityDtoEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: MsgPriorityDtoEsMapper
 * @Description: TODO
 * @date 2021/11/1715:59
 */
@Repository
public interface MsgPriorityDtoEsMapper extends ElasticsearchRepository<MsgPriorityDtoEs, String> {
}
