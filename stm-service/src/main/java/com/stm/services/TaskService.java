package com.stm.services;

import com.stm.dao.impl.TaskDAOImpl;
import com.stm.domain.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private TaskDAOImpl taskDAO = new TaskDAOImpl();
    private FilterService filterService;

    public List<Task> getAllActiveTasks() {
        //TODO create a local cache for filtered list?
        List<Task> unfilteredList = this.taskDAO.getAllTasks();
        ArrayList<Task> filteredList = new ArrayList<Task>();
        for (Task task : unfilteredList) {
            if (filterService.isFilterActiveForTask(task.getFilterID())) {
                filteredList.add(task);
            }
        }
        return filteredList;
    }

    public void setTaskDAO(TaskDAOImpl taskDAO){
        this.taskDAO=taskDAO;
    }
    public void setFilterService(FilterService filterService){
        this.filterService=filterService;
    }
}
