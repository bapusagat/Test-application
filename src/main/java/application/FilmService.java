package application;

import java.util.List;

public interface FilmService {
    int insertDetails(FilmInfo film);

    void updateYear(String fName, int year);

    List<FilmInfo> displayDetails();
}
