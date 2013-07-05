package com.stm.domain;

public class Filter implements Comparable<Filter> {
    private String color;
    private int filterID;
    private boolean isActive;
    private String name;
    private int rank;

    public Filter(){

    }
    public Filter(String color, int filterID, boolean isActive, String name, int rank) {
        this.color = color;
        this.filterID = filterID;
        this.isActive = isActive;
        this.name = name;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getFilterID() {
        return filterID;
    }

    public void setFilterID(int filterID) {
        this.filterID = filterID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHigherRank(Filter otherFilter){
        return compareTo(otherFilter)>0;
    }

    public int compareTo(Filter otherFilter) {
        return this.getRank() - otherFilter.getRank();
    }
}
