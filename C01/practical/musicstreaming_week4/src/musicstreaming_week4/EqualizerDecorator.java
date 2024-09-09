package musicstreaming_week4;

public class EqualizerDecorator extends MusicSourceDecorator{
	public EqualizerDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }
    public void play() {
        super.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Applying equalizer settings.");
    }
}
