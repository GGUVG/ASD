package com.demo.asd.pagination;

public class Pagination {
    public int totalSize;
    public int pageSize = 20;
    public String sortColumn;
    public int pageNo;
    public int sort;

    public Pagination() {
    }

    public int getOffset() {
        return this.pageNo < 1 ? 0 : (this.pageNo - 1) * this.pageSize;
    }

    public int getLimit() {
        return this.pageSize;
    }

    public int getTotalSize() {
        return this.totalSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String getSortColumn() {
        return this.sortColumn;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public int getSort() {
        return this.sort;
    }

    public void setTotalSize(final int totalSize) {
        this.totalSize = totalSize;
    }

    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    public void setSortColumn(final String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public void setPageNo(final int pageNo) {
        this.pageNo = pageNo;
    }

    public void setSort(final int sort) {
        this.sort = sort;
    }

}
