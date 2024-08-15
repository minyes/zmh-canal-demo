package com.zmh.canal.common.handler;

/**
 * @Description: IEsService es数据服务处理接口
 * @author: zhou ming hao
 * @date: 2024年08月15日 19:41
 */

public interface IEsHandler<T> {

     /**
      * 新增
      *
      * @param t 新增数据
      */
     void insert(T t);


     /**
      * 修改
      *
      * @param before 修改前数据
      * @param after  修改后数据
      */
     void update(T before, T after);


     /**
      * 删除
      *
      * @param t 删除数据
      */
     void delete(T t);
}
