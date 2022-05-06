package Lab11;

public class Lab11 {

    public static void main(String args[]) {

        //create 3 objects of Book class
        Book obj1 = new Book();
        Book obj2 = new Book();
        Book obj3 = new Book();

        System.out.println("obj1.toString");
        System.out.println("obj2.toString");
        System.out.println("obj3.toString");

        //create 1 Bookshelf object
        Bookshelf obj = new Bookshelf();
        System.out.println("" + obj1 + "" + obj2 + "" + obj3);

    }


}
