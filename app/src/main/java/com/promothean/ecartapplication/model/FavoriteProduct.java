package com.promothean.ecartapplication.model;

public class FavoriteProduct {
    private int resID;
    private String txtTitle;
    private String txtPrice;
    private String txtDate;

    public FavoriteProduct(int resID, String txtTitle, String txtPrice, String txtDate) {
        this.resID = resID;
        this.txtTitle = txtTitle;
        this.txtPrice = txtPrice;
        this.txtDate = txtDate;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(String txtPrice) {
        this.txtPrice = txtPrice;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(String txtDate) {
        this.txtDate = txtDate;
    }
}