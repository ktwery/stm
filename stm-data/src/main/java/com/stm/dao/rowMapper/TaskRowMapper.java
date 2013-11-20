package com.stm.dao.rowMapper;

import com.stm.domain.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task();
        task.setTaskID(rs.getInt("TASK_ID"));
        task.setFilterID(rs.getInt("FILTER_ID"));
        task.setTitle(rs.getString("TITLE"));
        task.setRank(rs.getInt("RANK"));
        task.setContent(rs.getString("CONTENT"));
        return task;
    }
}
