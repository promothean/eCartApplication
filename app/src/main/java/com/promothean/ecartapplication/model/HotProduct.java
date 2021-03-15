package com.promothean.ecartapplication.model;

public class HotProduct {
    private int imgRes;
    private String txtTitle;
    private String txtPrice;

    public HotProduct(int imgRes, String txtTitle, String txtPrice) {
        this.imgRes = imgRes;
        this.txtTitle = txtTitle;
        this.txtPrice = txtPrice;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
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
}