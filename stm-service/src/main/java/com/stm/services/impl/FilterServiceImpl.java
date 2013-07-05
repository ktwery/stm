package com.stm.services.impl;

import com.stm.dao.FilterDAO;
import com.stm.domain.Filter;
import com.stm.services.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class FilterServiceImpl implements FilterService {
    private FilterDAO filterDAO;

    @Autowired
    public void setFilterDAO(@Qualifier("filterDao") FilterDAO filterDAO) {
        this.filterDAO = filterDAO;
    }

    public List<Filter> sortFiltersByRank() {
        List<Filter> unsortedFilter = filterDAO.getAllFilters();
        Collections.sort(unsortedFilter);
        return unsortedFilter;//they are now filterd
    }
}
