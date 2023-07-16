import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTestFindeLast {
    @Test
    public void movieTestFindeNull() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestFindeOne() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestLastMax() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4","Film 3","Film 2","Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestLastOverMax() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 7","Film 6","Film 5", "Film 4","Film 3","Film 2","Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
