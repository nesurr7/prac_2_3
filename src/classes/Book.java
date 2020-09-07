package classes;

public class Book {
    //Свойства
    int countOfPages;//кол-во страниц
    String color;
    int publicationDate;//Дата публикации
    String author;//Автор
    String nameOfBook;

    //Конструкторы
    public Book(String nameOfBook, int countOfPages, String color, int publicationDate, String author) {
        this.countOfPages = countOfPages;
        this.color = color;
        this.publicationDate = publicationDate;
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public Book() {
    }

    //Методы геттеры
    public int getCountOfPages() {
        return countOfPages;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String getColor() {
        return color;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    //Методы сеттеры
    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    @Override
    public String toString() {
        return "Информация о книге:\n" +
                "Название:" + nameOfBook + "\n" +
                "Автор:" + author + "\n" +
                "Дата публикации:" + publicationDate + "\n" +
                "Количество страниц:" + countOfPages + "\n" +
                "Цвет книги:" + color + "\n";
    }
}
