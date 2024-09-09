package musicstreaming_week4;

public class VolumeControlDecorator extends MusicSourceDecorator{
	public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume.");
    }
}
