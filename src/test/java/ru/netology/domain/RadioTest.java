package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void changeRadioStationByRemoteControl() {
        Radio radio = new Radio();
        int newRadioStationIndex = radio.getMaxRadioStationIndex() / 2;
        assertEquals(newRadioStationIndex, radio.changeRadioStationByRemoteControl(newRadioStationIndex));
    }

    @Test
    void changeTheStationByRemoteControlIfNumberIsOverMax() {
        Radio radio = new Radio();
        int currentRadioStation = radio.getCurrentRadioStation();
        radio.changeRadioStationByRemoteControl(radio.getMaxRadioStationIndex() + 1);
        assertEquals(currentRadioStation, radio.getCurrentRadioStation());
    }

    @Test
    void changeTheStationByRemoteControlIfNumberIsLessMin() {
        Radio radio = new Radio();
        int currentRadioStation = radio.getCurrentRadioStation();
        radio.changeRadioStationByRemoteControl(radio.getMinRadioStationIndex() - 1);
        assertEquals(currentRadioStation, radio.getCurrentRadioStation());
    }

    @Test
    void changeTheStationByButtonNextIfCurrentIsMaximum() {
        Radio radio = new Radio();
        radio.switchToMaxStation();
        radio.changeStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void changeStationByNextButton() {
        Radio radio = new Radio();
        int currentRadioStation = radio.getCurrentRadioStation();
        radio.changeStationByNextButton();
        assertEquals(currentRadioStation + 1, radio.getCurrentRadioStation());
    }

    @Test
    void changeTheStationByPrevButtonIfCurrentIsMin() {
        Radio radio = new Radio();
        radio.switchToMinStation();
        radio.changeStationByPrevButton();
        assertEquals(radio.getMaxRadioStationIndex(), radio.getCurrentRadioStation());
    }


    @Test
    void changeStationByPrevButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.changeStationByPrevButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setMinVolume();
        radio.decreaseVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.increaseVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }
}
