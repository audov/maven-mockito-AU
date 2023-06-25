public class PosterManager {

    private int filmsDispQty = 5;

    public void setFilmsQty(int newFilmsDispQty) {
        if (newFilmsDispQty < 1) {
            return;
        }
        if (newFilmsDispQty > 7) {
            return;
        }
        filmsDispQty = newFilmsDispQty;
    }

    public int getFilmsQty() {

        return filmsDispQty;
    }

    private String[] films = new String[0]; //Изначально, сразу после создания, менеджер не должен содержать фильмов.

    public void add(String filmName) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        this.films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() { // длина массива
       int filmsQty;
        if (films.length < filmsDispQty) {
            filmsQty = films.length;
        } else {
            filmsQty = filmsDispQty;
        }
            String[] reversed = new String[filmsQty];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}