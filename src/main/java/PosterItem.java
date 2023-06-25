import java.util.Arrays;

public class PosterItem {

    public String[] itemName;


/*public PosterItem(String itemName) {

    this.itemName = itemName;
}*/

    public static void main(String[] args) {
        //PosterManager manager = new PosterManager();
        String[] filmName = { // Все фильмы должны храниться внутри массива в поле самого менеджера
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Человек-неведимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        System.out.println(Arrays.toString(filmName));
    }
}

