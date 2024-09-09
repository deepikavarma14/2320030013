package musicstreaming_week4;

public class ThirdPartyMusicAdapter implements MusicSource{
	 private ThirdPartyMusicService thirdPartyMusicService;

	    public ThirdPartyMusicAdapter(ThirdPartyMusicService thirdPartyMusicService) {
	        this.thirdPartyMusicService = thirdPartyMusicService;
	    }
	    public void play() {
	        thirdPartyMusicService.playMusicFromService();
	    }
}
