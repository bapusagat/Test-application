package application;

public class FilmInfo {

    private int filmId;
    private String filmName;
    private int filmYear;
    private String filmLang;
    private float filmRating;

    public FilmInfo(String filmName, int filmYear, String filmLang, float filmRating) {
        this.filmName = filmName;
        this.filmYear = filmYear;
        this.filmLang = filmLang;
        this.filmRating = filmRating;
    }

    public FilmInfo(int filmId, String filmName, int filmYear, String filmLang, float filmRating) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmYear = filmYear;
        this.filmLang = filmLang;
        this.filmRating = filmRating;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }

    public String getFilmLang() {
        return filmLang;
    }

    public void setFilmLang(String filmLang) {
        this.filmLang = filmLang;
    }

    public float getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(float filmRating) {
        this.filmRating = filmRating;
    }
}
