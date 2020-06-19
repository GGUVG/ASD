package com.demo.asd.support.model.po.client.forRent;

import com.demo.asd.base.entity.BaseBean;

public class ClientRentPkBean extends BaseBean {
    public Long clientId;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "ClientRentPkBean{" +
                "clientId=" + clientId +
                '}';
    }
}
