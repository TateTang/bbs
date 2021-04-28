package com.tmf.bbs.util;

public class Pages {


    public Pages() {

    }

    public Pages(Integer rowCount) {
        this.rowCount = rowCount;
        this.pageSize = 5;
        this.indexPage = 1;
    }

    //总记录数
    private Integer rowCount;
    //总页码
    private Integer pageCount;
    //每页大小
    private Integer pageSize;
    //当前页码
    private Integer indexPage;
    //开始行
    private Integer beginRow;
    //结束行
    private Integer endRow;

    public Integer getRowCount() {
        return rowCount;
    }


    public Integer getPageCount() {
        return getRowCount() % pageSize == 0 ? getRowCount() / pageSize : getRowCount() / pageSize + 1;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(Integer indexPage) {
        this.indexPage = indexPage;
    }

    public Integer getBeginRow() {
        return (getIndexPage() - 1) * getPageSize();
    }


    public Integer getEndRow() {
        return getIndexPage() * getPageSize() - 1;
    }


}
