package com.demo.asd.pagination;

public class PagingCriteria<T> {
    private T criteria;
    private Pagination pagination;
    private boolean autoCount;

    public PagingCriteria() {
    }

    public T getCriteria() {
        return this.criteria;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public boolean isAutoCount() {
        return this.autoCount;
    }

    public void setCriteria(final T criteria) {
        this.criteria = criteria;
    }

    public void setPagination(final Pagination pagination) {
        this.pagination = pagination;
    }

    public void setAutoCount(final boolean autoCount) {
        this.autoCount = autoCount;
    }
}