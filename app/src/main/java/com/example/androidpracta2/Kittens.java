package com.example.androidpracta2;

public class Kittens {

    private final String name;
    private final String description;
    private final int imageResourceId;

    public Kittens(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
