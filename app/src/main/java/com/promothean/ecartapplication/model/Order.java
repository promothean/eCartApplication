package com.promothean.ecartapplication.model;

public class Order {
    private String txtOrderNo;
    private String txtNoItems;
    private String txtItems;
    private String txtCategory;
    private String txtDate;
    private String txtAmount;

    public Order(String txtOrderNo, String txtNoItems, String txtItems, String txtCategory, String txtDate, String txtAmount) {
        this.txtOrderNo = txtOrderNo;
        this.txtNoItems = txtNoItems;
        this.txtItems = txtItems;
        this.txtCategory = txtCategory;
        this.txtDate = txtDate;
        this.txtAmount = txtAmount;
    }

    public String getTxtOrderNo() {
        return txtOrderNo;
    }

    public void setTxtOrderNo(String txtOrderNo) {
        this.txtOrderNo = txtOrderNo;
    }

    public String getTxtNoItems() {
        return txtNoItems;
    }

    public void setTxtNoItems(String txtNoItems) {
        this.txtNoItems = txtNoItems;
    }

    public String getTxtItems() {
        return txtItems;
    }

    public void setTxtItems(String txtItems) {
        this.txtItems = txtItems;
    }

    public String getTxtCategory() {
        return txtCategory;
    }

    public void setTxtCategory(String txtCategory) {
        this.txtCategory = txtCategory;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(String txtDate) {
        this.txtDate = txtDate;
    }

    public String getTxtAmount() {
        return txtAmount;
    }

    public void setTxtAmount(String txtAmount) {
        this.txtAmount = txtAmount;
    }
}