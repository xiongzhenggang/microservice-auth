package com.cmiov.search.client.service;

import com.alibaba.fastjson.JSONObject;
import com.cmiov.common.model.PageResult;
import com.cmiov.search.model.LogicDelDto;
import com.cmiov.search.model.SearchDto;

import java.util.Map;

/**
 * 搜索客户端接口
 *
 * @autho
 * @date 2019/4/24
 */
public interface IQueryService {
    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto);

    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @param logicDelDto 逻辑删除Dto
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto, LogicDelDto logicDelDto);

    /**
     * 访问统计聚合查询
     * @param indexName 索引名
     * @param routing es的路由
     */
    Map<String, Object> requestStatAgg(String indexName, String routing);
}
