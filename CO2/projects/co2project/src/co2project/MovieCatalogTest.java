package co2project;
import java.util.Scanner;
public class MovieCatalogTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        MovieCatalog catalog = new MovieCatalog();
        System.out.println("Enter the number of movies you want to add:");
        int numberOfMovies = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfMovies; i++) {
            System.out.println("Enter movie title:");
            String title = scanner.nextLine();
            System.out.println("Enter release year:");
            int releaseYear = scanner.nextInt();
            System.out.println("Enter rating (out of 10):");
            double rating = scanner.nextDouble();
            scanner.nextLine(); 
            Movie movie = new Movie(title, releaseYear, rating);
            catalog.addMovie(movie);
        }
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display movies sorted by title");
            System.out.println("2. Display movies sorted by rating");
            System.out.println("3. Display movies sorted by release year");
            System.out.println("4. Clone a movie");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("Movies sorted by title:");
                    catalog.sortMovies(null);
                    catalog.displayCatalog();
                    break;

                case 2:
                    System.out.println("Movies sorted by rating:");
                    catalog.sortMovies(new RatingComparator());
                    catalog.displayCatalog();
                    break;

                case 3:
                    System.out.println("Movies sorted by release year:");
                    catalog.sortMovies(new ReleaseYearComparator());
                    catalog.displayCatalog();
                    break;

                case 4:
                    System.out.println("Enter the title of the movie to clone:");
                    String cloneTitle = scanner.nextLine();
                    Movie movieToClone = catalog.findMovieByTitle(cloneTitle);

                    if (movieToClone != null) {
                        Movie clonedMovie = movieToClone.clone();
                        catalog.addMovie(clonedMovie);
                        System.out.println("Movie cloned successfully. Here is the updated catalog:");
                        catalog.displayCatalog();
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}