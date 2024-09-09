package musicstreaming_week4;

public class MusicPlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSource localFile = new LocalFile("path/to/local/file.mp3");
        MusicSource localFileWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localFile));
        localFileWithFeatures.play();
        MusicSource onlineStream = new OnlineStream("https://example.com/stream");
        MusicSource onlineStreamWithEqualizer = new EqualizerDecorator(onlineStream);
        onlineStreamWithEqualizer.play();
        MusicSource radioStation = new RadioStation("Radio One");
        radioStation.play();
        ThirdPartyMusicService thirdPartyMusicService = new ThirdPartyMusicService();
        MusicSource thirdPartyMusicAdapter = new ThirdPartyMusicAdapter(thirdPartyMusicService);
        thirdPartyMusicAdapter.play();      
	}

}
