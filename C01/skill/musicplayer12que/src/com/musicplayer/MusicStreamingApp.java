package com.musicplayer;

public class MusicStreamingApp {
	public static void main(String[] args) {
        MusicPlayer localPlayer = MusicPlayerFactory.getMusicPlayer("local");
        localPlayer.play("local", "my_local_song.mp3");

        MusicPlayer streamPlayer = MusicPlayerFactory.getMusicPlayer("stream");
        streamPlayer.play("stream", "http://example.com/song");

        MusicPlayer radioPlayer = MusicPlayerFactory.getMusicPlayer("radio");
        radioPlayer.play("radio", "Jazz FM");
    }
}
