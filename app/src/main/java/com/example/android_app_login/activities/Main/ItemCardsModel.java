package com.example.android_app_login.activities.Main;

public class ItemCardsModel {
    private String item, bottomColor;
    private int photo;

    public ItemCardsModel(String item, int photo, String bottomColor) {
        this.item = item;
        this.photo = photo;
        this.bottomColor = bottomColor;
    }

    public String getItem() {
        return item;
    }

    public int getPhoto() {
        return photo;
    }

    public String getBottomColor() {
        return bottomColor;
    }
}

