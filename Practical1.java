package code;


//Book class
class Book {

 String title;
 String author;
 String isbn;
 double price;
 int stock;

 // Constructor
 Book(String t, String a, String i, double p, int s) {
     title = t;
     author = a;
     isbn = i;
     price = p;
     stock = s;
 }

 // Display book details
 void display() {
     System.out.println("Title  : " + title);
     System.out.println("Author : " + author);
     System.out.println("ISBN   : " + isbn);
     System.out.println("Price  : ₹" + price);
     System.out.println("Stock  : " + stock);
 }

 // Apply discount
 void discount(double percent) {
     price = price - (price * percent / 100);
     System.out.println("Discount of " + percent + "% applied.");
 }

 // Increase stock
 void addStock(int qty) {
     stock = stock + qty;
     System.out.println(qty + " copies added to stock.");
 }

 // Check availability (no ternary)
 void checkAvailability() {
     if (stock > 0) {
         System.out.println("Book is available for purchase.");
     } else {
         System.out.println("Book is NOT available for purchase.");
     }
 }
}

//Main class
public class Practical1 {

 public static void main(String[] args) {

     Book novel = new Book("Popular Novel", "Author A", "111", 500, 5);
     Book textbook = new Book("Textbook", "Author B", "222", 800, 0);

     System.out.println("---- Novel Details ----");
     novel.display();
     novel.discount(10);
     novel.display();
     novel.addStock(5);
     novel.checkAvailability();

     System.out.println();

     System.out.println("---- Textbook Details ----");
     textbook.display();
     textbook.discount(20);
     textbook.display();
     textbook.addStock(10);
     textbook.checkAvailability();
 }
}
