package com.stm.dao;

import com.stm.domain.Filter;
import com.stm.domain.Task;

import java.util.List;

public interface TaskDAO {
    public List<Task> getAllTasks();
}
