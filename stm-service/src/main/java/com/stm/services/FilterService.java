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
    public ArrayList<Filter> activeFilters;

    public List<Filter> getAllActiveFilters(){
        List<Filter> unfilteredList= this.filterDAO.getAllFilters();
        this.activeFilters = new ArrayList<Filter>();
        for(Filter filter:unfilteredList){
            if(filter.isActive()){
                this.activeFilters.add(filter);
            }
        }
        return this.activeFilters;
    }

    public boolean isFilterActiveForTask(int filterID){
        //TODO check is int is in range of ranks
        for(Filter filter :this.activeFilters){
            if(filterID == filter.getFilterID()){
                return true;
            }
        }
        return false;
    }

    public void setFilterDAO(FilterDAOImpl filterDAO){
        this.filterDAO=filterDAO;
    }

    public void setActiveFilters(ArrayList<Filter> newFilters){
        this.activeFilters=newFilters;

    }
}
