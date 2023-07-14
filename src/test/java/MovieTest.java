import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void movieTestNull() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestOne() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestAll() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек");

        String[] expected = {"Бладшот", "Вперед", "Отель", "Джентельмены", "Человек"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель");

        String[] expected = {"Отель", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestLastMax() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек");

        String[] expected = {"Человек", "Джентельмены", "Отель", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTestLastOverMax() {
        MovieManager manager = new MovieManager(6);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек");
        manager.addMovie("Тролли");

        String[] expected = {"Тролли", "Человек", "Джентельмены", "Отель", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
