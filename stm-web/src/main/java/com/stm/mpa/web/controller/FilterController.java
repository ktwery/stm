package com.stm.mpa.web.controller;

import com.stm.services.FilterService;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class FilterController {
    @Autowired
    private FilterService filterService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = {"/filters"}, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getAllActiveFilters() throws IOException {
        return objectMapper.writeValueAsString(this.filterService.getAllActiveFilters());
    }
}
