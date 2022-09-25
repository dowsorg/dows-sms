package org.dows.sms.mapper.elastic;


import org.dows.sms.entity.elastic.PhoneInfoQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneInfoQueryMapper extends ElasticsearchRepository<PhoneInfoQuery, String> {

}