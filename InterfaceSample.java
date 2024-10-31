package practice;
interface MyInterface{
    void print();
}

class Book implements MyInterface {
    public void print() {

        System.out.println("Printing book");
    }
}

class Magazine implements MyInterface {
    public void print() {

        System.out.println("Printing magazine");
    }
}

public class InterfaceSample {
    public static void main(String[] args) {
        MyInterface book = new Book();
       MyInterface magazine = new Magazine();

        book.print();
        magazine.print();
    }
}
