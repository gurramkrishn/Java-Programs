package objectarray;

import java.util.ArrayList;
import java.util.Collections;

public class MainDuplicate
{
        public static void main(String[] args)
        {
            ArrayList<MovieDuplicate> list = new ArrayList<MovieDuplicate>();
            list.add(new MovieDuplicate("Force Awakens", 8.3, 2015));
            list.add(new MovieDuplicate("Star Wars", 8.7, 1977));
            list.add(new MovieDuplicate("Empire Strikes Back", 8.8, 1980));
            list.add(new MovieDuplicate("Return of the Jedi", 8.4, 1983));

            Collections.sort(list);

            System.out.println("Movies after sorting : ");
            for (MovieDuplicate movieduplicate: list)
            {
                System.out.println(movieduplicate.getName() + " " +
                        movieduplicate.getRating() + " " +
                        movieduplicate.getYear());
            }
        }
}
