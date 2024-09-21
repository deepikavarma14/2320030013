package co2project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
public class MovieCatalog implements Iterable<Movie>{
	private ArrayList<Movie> movies = new ArrayList<>();
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public void sortMovies(Comparator<Movie> comparator) {
        if (comparator == null) {
            Collections.sort(movies); // Use Comparable for default sort
        } else {
            Collections.sort(movies, comparator);
        }
    }
    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
    public void displayCatalog() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public Movie findMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}