package com.lospernas.model;

import android.widget.ImageView;

/**
 * Created by rflpazini on 27/08/2015.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private ImageView icon;

    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title, ImageView icon) {
        this.showNotify = showNotify;
        this.title = title;
        this.icon = icon;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {

        this.showNotify = showNotify;
    }

    public String getTitle() {

        return title;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setTitle(String title) {

        this.title = title;
    }

}
