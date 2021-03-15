package com.promothean.ecartapplication.model;

public class Cart {
    private int resID;
    private String txtTitle;
    private String txtWeight;
    private String txtDiscountPrice;
    private String txtOldPrice;
    private String txtQuantity;
    private String txtTotalPrice;

    public Cart(int resID, String txtTitle, String txtWeight, String txtDiscountPrice, String txtOldPrice, String txtQuantity, String txtTotalPrice) {
        this.resID = resID;
        this.txtTitle = txtTitle;
        this.txtWeight = txtWeight;
        this.txtDiscountPrice = txtDiscountPrice;
        this.txtOldPrice = txtOldPrice;
        this.txtQuantity = txtQuantity;
        this.txtTotalPrice = txtTotalPrice;
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

    public String getTxtWeight() {
        return txtWeight;
    }

    public void setTxtWeight(String txtWeight) {
        this.txtWeight = txtWeight;
    }

    public String getTxtDiscountPrice() {
        return txtDiscountPrice;
    }

    public void setTxtDiscountPrice(String txtDiscountPrice) {
        this.txtDiscountPrice = txtDiscountPrice;
    }

    public String getTxtOldPrice() {
        return txtOldPrice;
    }

    public void setTxtOldPrice(String txtOldPrice) {
        this.txtOldPrice = txtOldPrice;
    }

    public String getTxtQuantity() {
        return txtQuantity;
    }

    public void setTxtQuantity(String txtQuantity) {
        this.txtQuantity = txtQuantity;
    }

    public String getTxtTotalPrice() {
        return txtTotalPrice;
    }

    public void setTxtTotalPrice(String txtTotalPrice) {
        this.txtTotalPrice = txtTotalPrice;
    }
}