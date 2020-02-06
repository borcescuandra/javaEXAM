public class Books {

    private String author;
    private String title;
    double rating;

    public Books(String author, String title, double rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public String toString() {
        return "Author: " + author + System.lineSeparator() +
                "Title: " + title + System.lineSeparator() +
                "Rating: " + rating;
    }




}
