package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void changeRadioStationByRemoteControl() {
        Radio radio = new Radio();
        assertEquals(1, radio.changeRadioStationByRemoteControl(1));
    }

    @Test
    void ChangeTheStationByRemoteControlIfNumberIsOverMax() {
        Radio radio = new Radio();
        assertEquals(1, radio.changeRadioStationByRemoteControl(12));
    }
    @Test
    void ChangeTheStationByRemoteControlIfNumberIsLessMin() {
        Radio radio = new Radio();
        assertEquals(1, radio.changeRadioStationByRemoteControl(-15));
    }

    @Test
    void ChangeTheStationByButtonNextIfCurrentIsNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.changeStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void changeStationByNextButton() {
        Radio radio = new Radio();
        radio.changeStationByNextButton();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void ChangeTheStationByPrevButtonIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changeStationByPrevButton();
        assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    void changeStationByPrevButton() {
        Radio radio = new Radio();
        radio.changeStationByPrevButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.changeToVolumeMax();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void DecreaseVolume() {
        Radio radio = new Radio();
        radio.changeToVolumeMin();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void DecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.changeToVolumeMin();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.changeToVolumeMax();
        assertEquals(10, radio.getCurrentVolume());
    }
}
