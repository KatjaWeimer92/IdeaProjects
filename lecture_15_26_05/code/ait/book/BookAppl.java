package ait.book;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book book = new Book(1234567890123L, "Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997);
        book.display();
        Book book1 = new Book(6754321890123L, "The Lord of the Rings", "J.R.R. Tolkien", 1954);
        book1.display();
        Book book2 = new Book(9086753421456L, "The Hunger Games", 2008);
        book2.display();


    }
}
