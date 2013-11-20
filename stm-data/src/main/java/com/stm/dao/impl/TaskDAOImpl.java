package com.stm.dao.impl;

import com.stm.dao.TaskDAO;
import com.stm.dao.rowMapper.TaskRowMapper;
import com.stm.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {
    private DataSource dataSource;
    private NamedParameterJdbcTemplate template;

    public TaskDAOImpl() {
    }

    public List<Task> getAllTasks() {
        //TODO cache this data somehow?
        return template.query("SELECT * FROM TASKS", new TaskRowMapper());
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.template = new NamedParameterJdbcTemplate(this.dataSource);
    }
}