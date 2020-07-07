package com.demo.asd.model.client.wantBuy;

import com.demo.asd.base.entity.BaseRequest;

/**
 * 意向买房客户新增属性
 * create by chenCy at 2020/07/07
 */
public class ClientWantBuyExRequest extends ClientWantBuyRequest
{
    public Integer startClientExpectPrice;//客户期待售价起始区间
    public Integer endClientExpectPrice;//客户期待售价结束区间
    public Integer startClientExpectSquare;//客户期待面积起始区间
    public Integer endClientExpectSquare;//客户期待面积结束区间

    public Integer getStartClientExpectPrice() {
        return startClientExpectPrice;
    }

    public void setStartClientExpectPrice(Integer startClientExpectPrice) {
        this.startClientExpectPrice = startClientExpectPrice;
    }

    public Integer getEndClientExpectPrice() {
        return endClientExpectPrice;
    }

    public void setEndClientExpectPrice(Integer endClientExpectPrice) {
        this.endClientExpectPrice = endClientExpectPrice;
    }

    public Integer getStartClientExpectSquare() {
        return startClientExpectSquare;
    }

    public void setStartClientExpectSquare(Integer startClientExpectSquare) {
        this.startClientExpectSquare = startClientExpectSquare;
    }

    public Integer getEndClientExpectSquare() {
        return endClientExpectSquare;
    }

    public void setEndClientExpectSquare(Integer endClientExpectSquare) {
        this.endClientExpectSquare = endClientExpectSquare;
    }
}
