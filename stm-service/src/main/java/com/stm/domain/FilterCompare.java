package com.stm.domain;

public class FilterCompare {

    public boolean compare(Filter filter1, Filter filter2) {
        return filter1.getRank()-filter2.getRank() > 0;
    }

}
