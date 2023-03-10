package task3.Shelf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("Kill the mockingbird",567);
//        book.print();
//
//        Magazine magazine = new Magazine("Eva",134);
//        magazine.print();

        ArrayList<Printable> shelf = new ArrayList<>();

        shelf.add(new Book("Kill the mockingbird",567));
        shelf.add(new Magazine("Eva",134));
    }
}
