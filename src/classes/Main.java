package classes;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Черный хлеб", 483,
                "Бежевый", 1978, "Мигулай Ильбек");
        book1.setCountOfPages(482);
        book1.setColor("Серый");
        System.out.println(book1.getColor());
        book1.setColor("Бежевый");
        System.out.println(book1.toString());
    }
}
