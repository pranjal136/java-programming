/*
 * Implement the Book and Author classes based on the class diagram and description given below.
 * 
- Author :-
* Implement the getter and setter methods appropriately.

- Book :- 
Method Description
- displayAuthorDetails()
* Display the details of the author for the book.
* Implement the getter and setter methods appropriately.

Test your code using the Tester class.
 */

class Author {
    private String name;
    private String emailId;
    private char gender;

    // Constructor
    public Author(String name, String emailId, char gender) {
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

/* # Book Class */
class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    // Constructor
    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // displayAuthorDetails
    public void displayAuthorDetails() {
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email ID: " + author.getEmailId());
        System.out.println("Author Gender: " + author.getGender());
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

/* # Tester Class */
public class Tester {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Book book = new Book("Harry Potter", author, 499.99, 10);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Book Quantity: " + book.getQuantity());

        System.out.println("\nAuthor Details:");
        book.displayAuthorDetails();
    }
}
