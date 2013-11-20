package com.stm.dao.impl;

import com.stm.dao.FilterDAO;
import com.stm.dao.rowMapper.FilterRowMapper;
import com.stm.domain.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class FilterDAOImpl implements FilterDAO {
    private DataSource dataSource;
    private NamedParameterJdbcTemplate template;

    public FilterDAOImpl(){
    }
    public List<Filter> getAllFilters() {
        //TODO cache this data somehow?
        return template.query("SELECT * FROM FILTERS", new FilterRowMapper());
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.template = new NamedParameterJdbcTemplate(this.dataSource);
    }
}
