package com.stm.dao;

import com.stm.domain.Filter;

import java.util.List;

public interface FilterDAO{
    public List<Filter> getAllFilters();
    public void addFilter();

}