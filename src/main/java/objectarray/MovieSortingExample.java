package objectarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieSortingExample
{
     public static void main(String[] args) {
            List<Movie> movies = new ArrayList<>();
            movies.add(new Movie(2005, 8.7, 10000000, 50000000));
            movies.add(new Movie(2010, 9.2, 150000000, 800000000));
            movies.add(new Movie(2000, 7.5, 5000000, 20000000));

            // Sorting by rating and profit
            System.out.println("Movies sorted by rating and profit:");
            Collections.sort(movies, Comparator.comparing(Movie::getRating)
                    .thenComparing(movie -> movie.getCollectionAmount() - movie.getBudget()));
            movies.forEach(System.out::println);

            // Sorting by year released and rating
            System.out.println("\nMovies sorted by year released and rating:");
            Collections.sort(movies, Comparator.comparingInt(Movie::getYearReleased)
                    .thenComparingDouble(Movie::getRating));
            movies.forEach(System.out::println);
        }
    }
