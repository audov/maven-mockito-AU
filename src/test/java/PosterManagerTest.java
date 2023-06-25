import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void addFindAllItems() {
        PosterManager manager = new PosterManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-неведимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastItems() {
        PosterManager manager = new PosterManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-неведимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        manager.findLast();
        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastItemsSet4() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(4);
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-неведимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        manager.findLast();
        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка", "Джентельмены"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastItemsCount3() {
        PosterManager manager = new PosterManager();
        //manager.add("Бладшот");
        //manager.add("Вперёд");
        //manager.add("Отель Белград");
        //manager.add("Джентельмены");
        manager.add("Человек-неведимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        manager.findLast();
        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-неведимка"};//, "Джентельмены", "Отель Белград"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilmsQtyBelowZero() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(-3);
        int actual = manager.getFilmsQty();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFilmsQtyCustom() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(6);
        int actual = manager.getFilmsQty();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFilmsQtyAboveMax() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(8);
        int actual = manager.getFilmsQty();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFilmsQtyEqual0() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(0);
        int actual = manager.getFilmsQty();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFilmsQtyEqual7() {
        PosterManager manager = new PosterManager();
        manager.setFilmsQty(7);
        int actual = manager.getFilmsQty();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }
}