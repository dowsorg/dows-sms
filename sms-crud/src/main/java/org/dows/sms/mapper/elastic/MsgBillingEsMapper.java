package org.dows.sms.mapper.elastic;

import org.dows.sms.entity.elastic.MsgBillingEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: MsgMonitorDetailEsMapper
 * @Description: TODO
 * @date 2021/12/1517:45
 */
@Repository
public interface MsgBillingEsMapper extends ElasticsearchRepository<MsgBillingEs, String> {
}
