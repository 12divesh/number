package com.example.app;

public class MainModel {
    Integer numberImages;
    String numberWords;

    public MainModel(Integer numberImages, String numberWords) {
        this.numberImages = numberImages;
        this.numberWords = numberWords;
    }

    public Integer getNumberImages() {
        return numberImages;
    }

    public void setNumberImages(Integer numberImages) {
        this.numberImages = numberImages;
    }

    public String getNumberWords() {
        return numberWords;
    }

    public void setNumberWords(String numberWords) {
        this.numberWords = numberWords;
    }
}
