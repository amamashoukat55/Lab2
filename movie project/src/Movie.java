import javax.print.DocFlavor;
import java.util.Objects;

public class Movie {
    String title;
    int year;
    int rating;

    public Movie(int rating, int year, String title) {
        this.rating = rating;
        this.year = year;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year" + year +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return year== movie.year&& Objects.equals(title, movie.title) && Objects.equals(rating, movie.rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating=rating;
    }
}




