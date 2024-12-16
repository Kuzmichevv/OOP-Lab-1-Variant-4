package Lab1_variant4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private List<Screening> screenings;

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.screenings = new ArrayList<>();
    }

    // Метод для додавання показів
    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    // Метод для виведення повної інформації
    public void printFullInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director.getName() + " " + director.getSurname());
        System.out.println("Birthdate: " + director.getBirthdate());
        System.out.println("Screenings:");
        for (Screening screening : screenings) {
            System.out.println(" - " + screening.getScreeningName() + ", Profit: " + screening.getProfit() + ", Date: " + screening.getScreeningDate());
        }
    }

    // Метод для виведення скороченої інформації
    public void printShortInfo() {
        double totalProfit = 0;
        for (Screening screening : screenings) {
            totalProfit += screening.getProfit();
        }
        double averageProfit = screenings.size() > 0 ? totalProfit / screenings.size() : 0;
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director.getName() + " " + director.getSurname());
        System.out.println("Average Profit: " + averageProfit);
        System.out.println("Number of Screenings: " + screenings.size());
    }

    // Getter і Setter методи
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}

