package com.demo.asd.pagination;

import java.util.List;

public class PagingResponse<T>  {
    public List<T> rows;
    public Pagination pagination;

    public PagingResponse() {
    }

    public List<T> getRows() {
        return this.rows;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

    public void setPagination(final Pagination pagination) {
        this.pagination = pagination;
    }
}
