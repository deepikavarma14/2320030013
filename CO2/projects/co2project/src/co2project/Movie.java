package co2project;
public class Movie implements Comparable<Movie>, Cloneable{
	private String title;
    private int releaseYear;
    private double rating;
    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public double getRating() {
        return rating;
    }
    @Override
    public int compareTo(Movie other) {
        return this.title.compareTo(other.title); // Compare by title
    }
    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}