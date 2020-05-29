package com.demo.asd.pagination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PagingResult<T> implements List<T> {
    private List<T> rows;
    private long totalCount;

    public PagingResult() {
        this.rows = new ArrayList();
    }

    public PagingResult(List<T> rows, long totalCount) {
        this.rows = (List)(rows == null ? new ArrayList() : rows);
        this.totalCount = totalCount;
    }

    public int size() {
        return this.rows.size();
    }

    public boolean isEmpty() {
        return this.rows.isEmpty();
    }

    public boolean contains(Object o) {
        return this.rows.contains(o);
    }

    public Iterator<T> iterator() {
        return this.rows.iterator();
    }

    public Object[] toArray() {
        return this.rows.toArray();
    }

    public <T1> T1[] toArray(T1[] a) {
        return this.rows.toArray(a);
    }

    public boolean add(T t) {
        return this.rows.add(t);
    }

    public boolean remove(Object o) {
        return this.rows.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return this.rows.containsAll(c);
    }

    public boolean addAll(Collection<? extends T> c) {
        return this.rows.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return this.rows.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return this.rows.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return this.rows.retainAll(c);
    }

    public void clear() {
        this.rows.clear();
    }

    public T get(int index) {
        return (T) this.rows.get(index);
    }

    public T set(int index, T element) {
        return (T) this.rows.set(index, element);
    }

    public void add(int index, T element) {
        this.rows.add(index, element);
    }

    public T remove(int index) {
        return (T) this.rows.remove(index);
    }

    public int indexOf(Object o) {
        return this.rows.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return this.rows.lastIndexOf(o);
    }

    public ListIterator<T> listIterator() {
        return this.rows.listIterator();
    }

    public ListIterator<T> listIterator(int index) {
        return this.rows.listIterator(index);
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return this.rows.subList(fromIndex, toIndex);
    }

    public List<T> getRows() {
        return this.rows;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

    public void setTotalCount(final long totalCount) {
        this.totalCount = totalCount;
    }
}