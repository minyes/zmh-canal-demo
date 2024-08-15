package com.zmh.canal.service;

import com.zmh.canal.bo.Product;
import com.zmh.canal.common.handler.IEsHandler;
import com.zmh.canal.dao.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description: EsServiceImpl
 * @author: zhou ming hao
 * @date: 2024年08月15日 17:08
 */
@Service
@RequiredArgsConstructor
public class ProductEsServiceImpl implements IEsHandler<Product> {

    private final ProductDao productDao;

    /**
     * 保存产品信息
     * @param product
     */
    @Override
    public void insert(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product before, Product after) {
        productDao.save(after);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }


}
