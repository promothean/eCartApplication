package com.promothean.ecartapplication.model;

public class Notification {
    private String txtTitle;
    private String txtContent;
    private String txtDate;

    public Notification(String txtTitle, String txtContent, String txtDate) {
        this.txtTitle = txtTitle;
        this.txtContent = txtContent;
        this.txtDate = txtDate;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtContent() {
        return txtContent;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(String txtDate) {
        this.txtDate = txtDate;
    }
}