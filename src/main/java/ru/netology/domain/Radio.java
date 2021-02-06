package ru.netology.domain;

public class Radio {
    private int currentRadioStation = 1;
    int maxRadioStation = 9;
    int minRadioStation = 0;
    private int currentVolume = 1;
    int maxVolume = 10;
    int minVolume = 0;

    public int changeRadioStationByRemoteControl(int intendedRadioStation) {
        if (intendedRadioStation >= 0 && intendedRadioStation <= 9) {
            currentRadioStation = intendedRadioStation;
        }
        return currentRadioStation;
    }

    public int changeStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            ++currentRadioStation;
        }
        return currentRadioStation;
    }

    public int changeStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
        } else {
            --currentRadioStation;
        }
        return currentRadioStation;
    }

    public int changeToVolumeMax() {
        if (currentVolume == maxVolume) {
            return currentVolume;
        } else {
            return ++currentVolume;
        }
    }

    public int changeToVolumeMin() {
        if (currentVolume == minVolume) {
            return currentVolume;
        } else {
            return --currentVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}