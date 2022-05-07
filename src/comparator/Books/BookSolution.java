package comparator.Books;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BookSolution {
    public static void main(String[] args) {
        Book b1 = new Book("Пушкин","Евгений Онегин", 7.8, 20);
        Book b2 = new Book("Пушкин","Пиковая дама", 12.5, 15);
        Book b3 = new Book("Булаков","Мастер и Маргарита", 19.8, 14);

        Book[] books = {b1,b2,b3};
        Arrays.sort(books, new BookComparatorByRating());
        print(books);

        List<Book> bookList = new LinkedList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

       // System.out.println(bookList.size());
      //  System.out.println(bookList);
    }
    public static void print(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
