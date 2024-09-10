package com.musicplayer;

public class LocalFilePlayerAdapter implements MusicPlayer{
	private LocalFilePlayer localFilePlayer;
    public LocalFilePlayerAdapter() {
        localFilePlayer = new LocalFilePlayer();
    }
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("local")) {
            localFilePlayer.playLocalFile(fileName);
        } else {
            System.out.println("Invalid format for local file player.");
        }
    }
}
