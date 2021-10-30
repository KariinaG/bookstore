package bookstore;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private LocalDate publishingYear;
    private int pages;
    private String publisher;
    private String description;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, LocalDate publishingYear, int pages, String publisher, String description, String isbn) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.publisher = publisher;
        this.description = description;
        this.isbn = isbn;

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
