package org.dows.sms.mapper.elastic;

import org.dows.sms.entity.elastic.QuartzRunLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: QuartzRunLogMapper
 * @Description: TODO
 * @date 2022/1/2610:59
 */
@Repository
public interface QuartzRunLogMapper extends ElasticsearchRepository<QuartzRunLog, String> {
}
