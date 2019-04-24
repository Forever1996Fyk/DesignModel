package com.javaDesign.designModel.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 17:31
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}