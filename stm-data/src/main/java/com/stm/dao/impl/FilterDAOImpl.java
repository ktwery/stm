package com.stm.dao.impl;

import com.stm.dao.FilterDAO;
import com.stm.domain.Filter;
import com.stm.domain.FilterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("dev")
public class FilterDAOImpl implements FilterDAO {
    private DriverManagerDataSource dataSource;
    private JdbcTemplate template;

    public FilterDAOImpl(){
        template = new JdbcTemplate(dataSource);
    }
    public List<Filter> getAllFilters() {
        return template.query("SELECT * FROM filtertable",new FilterMapper());
    }
    @Autowired
    public void setDataSource(@Qualifier("dataSource") DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
