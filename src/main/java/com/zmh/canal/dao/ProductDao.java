package com.zmh.canal.dao;

import com.zmh.canal.bo.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: ProductDao
 * @author: zhou ming hao
 * @date: 2024年08月15日 18:56
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
