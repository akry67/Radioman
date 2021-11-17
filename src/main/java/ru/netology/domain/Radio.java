package ru.netology.domain;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        //диапазон от 0 до 9 радиостанция
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            return;
        }
            if (currentRadioStation < 9) {
                this.currentRadioStation = currentRadioStation + 1;
            }
        }

        public void prevCurrentRadioStation ( int currentRadioStation){
            if (currentRadioStation <= 0) {
                this.currentRadioStation = 9;
            }
            if (currentRadioStation > 9) {
                return;
            }
            if (currentRadioStation >= 1) {
                this.currentRadioStation = currentRadioStation - 1;
            }
        }

        public int getCurrentRadioStation () {
            //getCurrentRadioStation - дай текущую радиостанцию
            return currentRadioStation;
        }

        public void moreVolume ( int currentVolume){
            if (currentVolume < 0) {
                return;
            }
            if (currentVolume < 10) {
                this.currentVolume = currentVolume + 1;
            }
        }

        public void underVolume ( int currentVolume){
            if (currentVolume > 10) {
                return;
            }
            if (currentVolume > 0) {
                this.currentVolume = currentVolume - 1;
            }
        }

        public void maxVolume ( int currentVolume){
            if (currentVolume > 10) {
                return;
            }
        }

        public void minVolume ( int currentVolume){
            if (currentVolume < 0) {
                return;
            }
        }

        public void setCurrentVolume ( int currentVolume){
            //диапазон от 0 до 10 громкости
            if (currentVolume > 10) {
                return;
            }
            if (currentVolume < 0) {
                return;
            }
            this.currentVolume = currentVolume;
        }

        public int getCurrentVolume () {
            // дай текущую громкость
            return currentVolume;
        }
    }