package com.stm.services;

import com.stm.dao.impl.FilterDAOImpl;
import com.stm.domain.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterService {
    @Qualifier("filterDAOImpl")
    @Autowired
    private FilterDAOImpl filterDAO = new FilterDAOImpl();

    public List<Filter> getAllActiveFilters(){
        List<Filter> unfilteredList= this.filterDAO.getAllFilters();
        ArrayList<Filter> filteredList = new ArrayList<Filter>();
        for(Filter filter:unfilteredList){
            if(filter.isActive()){
                filteredList.add(filter);
            }
        }
        return filteredList;
    }
}
