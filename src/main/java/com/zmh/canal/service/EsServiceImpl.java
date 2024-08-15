package com.zmh.canal.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description: EsServiceImpl
 * @author: zhou ming hao
 * @date: 2024年08月15日 17:08
 */
@Service
@RequiredArgsConstructor
public class EsServiceImpl {

    private final ElasticsearchTemplate template;

    public void inToEs(){

    }
}
