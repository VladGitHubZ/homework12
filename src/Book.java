public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public String toString() {
        return title + " " + author +  " " + ", published in "+publicationYear ;
    }

    public boolean equals(Object o) {
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                (title == book.title || (title != null && title.equals(book.title))) &&
                (author == book.author || (author != null && author.equals(book.author)));
    }
    public int hashCode() {
        int result = 1;
        result = 27 * result + (title != null ? title.hashCode() : 0);
        result = 27 * result + (author != null ? author.hashCode() : 0);
        result = 27 * result + publicationYear;
        return result;
    }
}
