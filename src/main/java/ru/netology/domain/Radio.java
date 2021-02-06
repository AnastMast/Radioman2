package ru.netology.domain;

public class Radio {
    private int currentRadioStationIndex;
    private int maxRadioStationIndex;
    private int minRadioStationIndex;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio(int radioStationCount) {
        this.maxRadioStationIndex = radioStationCount - 1;
        this.minRadioStationIndex = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
        this.currentRadioStationIndex = 0;
        this.currentVolume = 50;
    }

    public Radio() {
        this(10);
    }

    public int changeRadioStationByRemoteControl(int newRadioStationIndex) {
        if (newRadioStationIndex >= minRadioStationIndex && newRadioStationIndex <= maxRadioStationIndex) {
            currentRadioStationIndex = newRadioStationIndex;
        }
        return currentRadioStationIndex;
    }

    public int changeStationByNextButton() {
        if (currentRadioStationIndex == maxRadioStationIndex) {
            currentRadioStationIndex = minRadioStationIndex;
        } else {
            ++currentRadioStationIndex;
        }
        return currentRadioStationIndex;
    }

    public int changeStationByPrevButton() {
        if (currentRadioStationIndex == minRadioStationIndex) {
            currentRadioStationIndex = maxRadioStationIndex;
        } else {
            --currentRadioStationIndex;
        }
        return currentRadioStationIndex;
    }

    public int increaseVolume() {
        if (currentVolume == maxVolume) {
            return currentVolume;
        } else {
            return ++currentVolume;
        }
    }

    public int decreaseVolume() {
        if (currentVolume == minVolume) {
            return currentVolume;
        } else {
            return --currentVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStationIndex;
    }

    public void setCurrentRadioStation(int currentRadioStationIndex) {
        this.currentRadioStationIndex = currentRadioStationIndex;
    }

    public void switchToMinStation() {
        this.currentRadioStationIndex = minRadioStationIndex;
    }

    public void switchToMaxStation() {
        this.currentRadioStationIndex = maxRadioStationIndex;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMinVolume() {
        this.currentVolume = minVolume;
    }

    public void setMaxVolume() {
        this.currentVolume = maxVolume;
    }

    public int getMaxRadioStationIndex() {
        return maxRadioStationIndex;
    }

    public int getMinRadioStationIndex() {
        return minRadioStationIndex;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
}