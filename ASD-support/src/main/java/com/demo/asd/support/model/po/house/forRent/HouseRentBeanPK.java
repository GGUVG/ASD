package com.demo.asd.support.model.po.house.forRent;

import com.demo.asd.base.entity.BasePk;

public class HouseRentBeanPK extends BasePk {
    public Long houseId;

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    @Override
    public String toString() {
        return "HouseRentBeanPK{" +
                "houseId=" + houseId +
                '}';
    }
}
