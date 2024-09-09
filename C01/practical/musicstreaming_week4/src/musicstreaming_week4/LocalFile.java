package musicstreaming_week4;

public class LocalFile implements MusicSource{
	private String fileName;

    public LocalFile(String fileName) {
        this.fileName = fileName;
    }
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}
