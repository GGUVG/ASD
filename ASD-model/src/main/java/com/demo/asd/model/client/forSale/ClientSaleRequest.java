package com.demo.asd.model.client.forSale;

public class ClientSaleRequest {
    public long clientId;
    public String clientName;
    public String clientSex;
    public String clientAddress;
    public String clientPhone;
    public String clientRemark;
    public long clientStaffId;
    public int status;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientRemark() {
        return clientRemark;
    }

    public void setClientRemark(String clientRemark) {
        this.clientRemark = clientRemark;
    }

    public long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(long clientStaffId) {
        this.clientStaffId = clientStaffId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClientSaleRequest{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientRemark='" + clientRemark + '\'' +
                ", clientStaffId=" + clientStaffId +
                ", status=" + status +
                '}';
    }
}
