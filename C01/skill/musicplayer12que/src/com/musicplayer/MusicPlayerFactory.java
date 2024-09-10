package com.musicplayer;

public class MusicPlayerFactory {
	public static MusicPlayer getMusicPlayer(String audioType) {
        if (audioType.equalsIgnoreCase("local")) {
            return new LocalFilePlayerAdapter();
        } else if (audioType.equalsIgnoreCase("stream")) {
            return new OnlineStreamingPlayerAdapter();
        } else if (audioType.equalsIgnoreCase("radio")) {
            return new RadioStationPlayerAdapter();
        }
        return null;
    }
}
