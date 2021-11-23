package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    //текущая радиостанция
    public void getCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //следующая радиостанция
    public void nextCurrentRadioStation() {
        Radio radio = new Radio();
        radio.nextCurrentRadioStation();

        int expected = 1;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }

    @Test
    //предыдущая радиостанция
    public void prevCurrentRadioStation() {
        Radio radio = new Radio();
        radio.prevCurrentRadioStation();

        int expected = 8;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }

    @Test
    //увеличение звука
    public void moreVolume() {
        Radio radio = new Radio();
        radio.moreVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    //уменьшение звука
    public void underVolume() {
        Radio radio = new Radio();
        radio.underVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);

    }

    @Test
    //текущая громкость
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

}