package com.demo.asd.pagination;

public class PagingRequest<T>{
    private T criteria;
    private Pagination pagination;

    public PagingRequest() {
    }

    public T getCriteria() {
        return this.criteria;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public void setCriteria(final T criteria) {
        this.criteria = criteria;
    }

    public void setPagination(final Pagination pagination) {
        this.pagination = pagination;
    }
}
