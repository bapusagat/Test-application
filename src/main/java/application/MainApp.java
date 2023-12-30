package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    static Scanner sc=new Scanner(System.in);
    static FilmService service=new FilmServiceImpl();

    public static void main(String[] args) {

        System.out.println("SELECT OPTION");
        System.out.println("1. ENTER DETAILS OF FILM");
        System.out.println("2. UPDATE FILM YEAR");
        System.out.println("3. Display Average Rating Films");

        int ch= sc.nextInt();

        switch (ch){
            case 1:
                insertDetails();
                break;
            case 2:
                updateYear();
                break;
            case 3:
                displayDetails();
                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
        main(args);
    }

    private static void displayDetails() {
        List<FilmInfo> filmList=new ArrayList<>();


        filmList=service.displayDetails();

        for (FilmInfo f:filmList){
            System.out.println(f.getFilmName()+"    "+"    ");
        }

    }

    private static void updateYear() {
        sc.nextLine();
        System.out.println("Enter Film Name");
        String fName=sc.nextLine();

        System.out.println("Enter Year To Update");
        int year=sc.nextInt();

        service.updateYear(fName,year);
    }



    private static void insertDetails() {
        sc.nextLine();
        System.out.println("Enter Film Name");
        String fName=sc.nextLine();

        System.out.println("Enter Film Year");
        int year= sc.nextInt();

        System.out.println("Enter Film Language");
        String lang= sc.next();

        System.out.println("Enter Rating");
        float rating= sc.nextFloat();

        FilmInfo film=new FilmInfo(fName,year,lang,rating);

       int n= service.insertDetails(film);

        System.out.println(n +" Record Inserted");

    }


}
