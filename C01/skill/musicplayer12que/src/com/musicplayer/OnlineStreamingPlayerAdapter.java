package com.musicplayer;

public class OnlineStreamingPlayerAdapter implements MusicPlayer{
	private OnlineStreamingPlayer onlineStreamingPlayer;
    public OnlineStreamingPlayerAdapter() {
        onlineStreamingPlayer = new OnlineStreamingPlayer();
    }
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("stream")) {
            onlineStreamingPlayer.playOnlineStream(fileName);
        } 
        else {
            System.out.println("Invalid format for online streaming.");
        }
    }
}
