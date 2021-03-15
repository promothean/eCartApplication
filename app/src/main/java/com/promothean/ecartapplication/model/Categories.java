package com.promothean.ecartapplication.model;

public class Categories {
    private int imgRes;
    private String txtTagLine;

    public Categories(int imgRes, String txtTagLine) {
        this.imgRes = imgRes;
        this.txtTagLine = txtTagLine;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTxtTagLine() {
        return txtTagLine;
    }

    public void setTxtTagLine(String txtTagLine) {
        this.txtTagLine = txtTagLine;
    }
}