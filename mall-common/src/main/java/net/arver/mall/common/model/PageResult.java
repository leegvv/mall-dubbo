package net.arver.mall.common.model;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    public PageResult(){}

    public PageResult(final long total, final List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    private List<T> rows;

    private long total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(final long total) {
        this.total = total;
    }
}
