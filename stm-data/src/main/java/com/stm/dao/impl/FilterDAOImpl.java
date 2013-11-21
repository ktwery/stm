package com.stm.dao.impl;

import com.stm.dao.FilterDAO;
import com.stm.dao.rowMapper.FilterRowMapper;
import com.stm.domain.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FilterDAOImpl implements FilterDAO {
    private NamedParameterJdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Filter> getAllFilters() {
        //TODO cache this data somehow?
        return this.template.query("SELECT * FROM FILTERS", new FilterRowMapper());
    }

    public void addFilter() {
        this.template.update("INSERT INTO FILTERS VALUES ()", new HashMap<String, Object>() {});
    }
}
