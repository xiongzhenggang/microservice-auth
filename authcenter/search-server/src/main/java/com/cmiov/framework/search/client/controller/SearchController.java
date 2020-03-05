package com.cmiov.framework.search.client.controller;

import com.alibaba.fastjson.JSONObject;

import com.cmiov.framework.search.client.dto.SearchDto;
import com.cmiov.framework.search.common.model.PageResult;
import com.cmiov.framework.search.client.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

/**
 * 通用搜索
 *
 * @autho
 */
@Slf4j
@RestController
@Api(tags = "搜索模块api")
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private ISearchService searchService;

    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    @PostMapping("/{indexName}")
    public PageResult<JSONObject> strQuery(@PathVariable String indexName, @RequestBody(required = false) SearchDto searchDto) {
        if (searchDto == null) {
            searchDto = new SearchDto();
        }
        return searchService.strQuery(indexName, searchDto);
    }
}