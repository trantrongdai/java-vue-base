package com.cmc.dto.request.filter;

public class BaseFilter {
    protected String searchText;

    public BaseFilter() {
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
