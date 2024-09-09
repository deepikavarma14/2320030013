package musicstreaming_week4;

public class OnlineStream implements MusicSource{
	 private String url;

	    public OnlineStream(String url) {
	        this.url = url;
	    }
	    public void play() {
	        System.out.println("Streaming music from: " + url);
	    }
}
