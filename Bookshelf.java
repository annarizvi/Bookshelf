package Lab11;

import java.util.ArrayList;

public class Bookshelf {

    private int size;
    private final ArrayList<Book>books;

    //default constructor
         public Bookshelf() {
             size = 2;
             books = new ArrayList<>(size);
         }

         //parametrized constructor
         public Bookshelf(int aSize ) {
             size = aSize;
             this.books = new ArrayList<>(size);
         }
            //no setters

            //getter methods
                 public int getSize() {
                 return size;
            }

            public ArrayList<Book>getBooks() {
             return books;
        }

        //add given book to shelf
        public void addBook(Book aBook) {
             books.add(aBook); //adding object aBook to array list
    }
        //remove book from shelf
        public void removeBook(Book aBook) {
             books.remove(0);
        }

        //empty shelf
        public void emptyBookshelf() {
             books.clear();
        }





}
