package com.stm.dao.impl;

import com.stm.dao.FilterDAO;
import com.stm.domain.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilterDAOImpl implements FilterDAO {
    private DriverManagerDataSource dataSource;
    private NamedParameterJdbcTemplate template;

    public FilterDAOImpl(){

        template = new NamedParameterJdbcTemplate(dataSource);
    }
    public List<Filter> getAllFilters() {
        return null;
    }
    @Autowired
    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
