package com.musicplayer;

public class RadioStationPlayerAdapter implements MusicPlayer{
	private RadioStationPlayer radioStationPlayer;
    public RadioStationPlayerAdapter() {
        radioStationPlayer = new RadioStationPlayer();
    }
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("radio")) {
            radioStationPlayer.playRadioStation(fileName);
        } else {
            System.out.println("Invalid format for radio station.");
        }
    }
}
