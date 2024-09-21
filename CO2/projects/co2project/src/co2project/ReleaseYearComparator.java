package co2project;
import java.util.Comparator;
public class ReleaseYearComparator implements Comparator<Movie>{
	 public int compare(Movie m1, Movie m2) {
	        return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
	    }
}