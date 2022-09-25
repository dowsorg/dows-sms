package org.dows.sms.mapper.elastic;


import org.dows.sms.entity.elastic.SmsDetailMonth;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: SmsDetailMonthMapper
 * @Description: TODO
 * @date 2021/11/815:44
 */
@Repository
public interface SmsDetailMonthMapper extends ElasticsearchRepository<SmsDetailMonth, String> {
}
