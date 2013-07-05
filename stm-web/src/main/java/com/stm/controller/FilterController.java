package com.stm.controller;

import com.stm.services.impl.FilterServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilterController.class);
    private FilterServiceImpl filterService;

    /**
     * get all sorted filters
     */
    @RequestMapping(value = {"/filters"})
    public String requestCards(Model model) {
        LOGGER.debug("Requesting filters");
        filterService.sortFiltersByRank();
        return "filterView";
    }

    @Autowired
    public void setFilterService(FilterServiceImpl filterService) {
        this.filterService = filterService;
    }
}
