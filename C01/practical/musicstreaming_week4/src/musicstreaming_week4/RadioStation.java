package musicstreaming_week4;

public class RadioStation implements MusicSource{
	private String stationName;

    public RadioStation(String stationName) {
        this.stationName = stationName;
    }
    public void play() {
        System.out.println("Playing radio station: " + stationName);
    }
}
