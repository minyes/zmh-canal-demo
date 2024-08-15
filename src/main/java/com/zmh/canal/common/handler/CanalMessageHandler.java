package com.zmh.canal.common.handler;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.zmh.canal.common.utils.FieldUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * canal消息处理
 * </p>
 *
 * @author MrWen
 */
public class CanalMessageHandler {

    /**
     * key:table名称，value：EntryHandler实现类
     */
    private Map<String, IEsHandler> tableHandlerMap;

    public CanalMessageHandler(List<? extends IEsHandler> entryHandlers) {
        this.tableHandlerMap = this.getTableHandler(entryHandlers);
    }


    public IEsHandler getHandlerMap(String tableName) {
        return tableHandlerMap.get(tableName);
    }


    /**
     * 获取所有EntryHandler信息
     *
     * @param esHandlers 所有EsHandler
     * @return map类型，key：CanalTable注解的value名称   value：对应的EsHandler
     */
    private Map<String, IEsHandler> getTableHandler(List<? extends IEsHandler> esHandlers) {
        if (CollUtil.isEmpty(esHandlers)) {
            return CollUtil.newHashMap();
        }
        Map<String, IEsHandler> tableHandlerMap = new HashMap<>(esHandlers.size());
        for (IEsHandler esHandler : esHandlers) {
            String tableName = FieldUtil.getTableGenericProperties(esHandler);
            if (StrUtil.isNotBlank(tableName)) {
                tableHandlerMap.putIfAbsent(tableName, esHandler);
            }
        }
        return tableHandlerMap;
    }
}
