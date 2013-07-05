package com.stm.services;

import com.stm.domain.Filter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilterService {
    public List<Filter> sortFiltersByRank();
}
