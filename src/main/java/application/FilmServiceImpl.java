package application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmServiceImpl implements FilmService{

    private static Connection conn;


    static {
        String url="jdbc:mysql://localhost:3306/filmdb";
        String username="root";
        String password="tiger";

        try {
            conn= DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            System.out.println("Connection Failed");
        }
    }

    @Override
    public int insertDetails(FilmInfo film) {
        int  n=0;
        String insertQuery="INSERT INTO FILM_INFO VALUES(?,?,?,?)";

        try {
            PreparedStatement pstmt= conn.prepareStatement(insertQuery);

            pstmt.setString(1,film.getFilmName());
            pstmt.setInt(2,film.getFilmYear());
            pstmt.setString(3, film.getFilmLang());
            pstmt.setFloat(4,film.getFilmRating());
           n= pstmt.executeUpdate();
        } catch (SQLException e) {

        }
        return n;
    }

    @Override
    public void updateYear(String fName, int year) {
        String updateQuery="Update film_info set film_year=year where film_name=fName";

        try {
            Statement stmt= conn.createStatement();
            stmt.executeQuery(updateQuery);


        } catch (SQLException e) {
            System.out.println("No Record Updated");
        }
    }

    @Override
    public List<FilmInfo> displayDetails() {
        List<FilmInfo> filmList=new ArrayList<>();
        String displayQuery="Select >";

        try {
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(displayQuery);

            while(rs.next()){
//                int id=rs.getInt(1);
                String fName=rs.getString(1);
                int year=rs.getInt(2);
                String filmLang=rs.getString(3);
                int rating=rs.getInt(4);

                FilmInfo film=new FilmInfo(fName,year,filmLang,rating);

                filmList.add(film);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
