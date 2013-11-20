package com.stm.mpa.web.controller;

import com.stm.services.FilterService;
import com.stm.services.TaskService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
@Controller
public class TaskController {
    @Qualifier("taskService")
    @Autowired
    private TaskService taskService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = {"/tasks"}, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getAllActiveTasks() throws IOException {
        return objectMapper.writeValueAsString(this.taskService.getAllActiveTasks());
    }
}
