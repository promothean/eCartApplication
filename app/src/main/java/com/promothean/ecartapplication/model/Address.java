package com.promothean.ecartapplication.model;

public class Address {
    private String txtUserName;
    private String txtPhoneNo;
    private Boolean isDefault;
    private Boolean isHomeOrOffice;
    private String txtHomeOrOffice;
    private String txtAddress;
    private Boolean isChecked;

    public Address(String txtUserName, String txtPhoneNo, Boolean isDefault, Boolean isHomeOrOffice, String txtHomeOrOffice, String txtAddress, Boolean isChecked) {
        this.txtUserName = txtUserName;
        this.txtPhoneNo = txtPhoneNo;
        this.isDefault = isDefault;
        this.isHomeOrOffice = isHomeOrOffice;
        this.txtHomeOrOffice = txtHomeOrOffice;
        this.txtAddress = txtAddress;
        this.isChecked = isChecked;
    }

    public String getTxtUserName() {
        return txtUserName;
    }

    public void setTxtUserName(String txtUserName) {
        this.txtUserName = txtUserName;
    }

    public String getTxtPhoneNo() {
        return txtPhoneNo;
    }

    public void setTxtPhoneNo(String txtPhoneNo) {
        this.txtPhoneNo = txtPhoneNo;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getHomeOrOffice() {
        return isHomeOrOffice;
    }

    public void setHomeOrOffice(Boolean homeOrOffice) {
        isHomeOrOffice = homeOrOffice;
    }

    public String getTxtHomeOrOffice() {
        return txtHomeOrOffice;
    }

    public void setTxtHomeOrOffice(String txtHomeOrOffice) {
        this.txtHomeOrOffice = txtHomeOrOffice;
    }

    public String getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(String txtAddress) {
        this.txtAddress = txtAddress;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }
}