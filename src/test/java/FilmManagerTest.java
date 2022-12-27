import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентельмены");
        manager.addFilm("Номер один");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот","Вперед","Джентельмены","Номер один"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLost() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентельмены");
        manager.addFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один","Джентельмены","Вперед","Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
