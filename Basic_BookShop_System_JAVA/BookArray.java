import java.util.*;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // setters
    public void SetEmail(String email) {
        this.email = email;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }

    // gettters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // stters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book Name   : " + name + "\n" +
                "Author Name : " + author.getName() + "\n" +
                "E-mail      : " + author.getEmail() + "\n" +
                "Gender      : " + author.getGender() + "\n" +
                "Price       : " + price;
        // "Quantity: " + quantity;
    }
}

class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Author a1[] = new Author[] {
                new Author("Kathy Sierra", "kathysierra@gmail.com", 'M'),
                new Author("Walter Savitch", "waltersavitch@gmail.com", 'M'),
                new Author("Herbert Schildt", "herbertschildt@yahoo.com", 'M'),
                new Author("Cay S. Horstmann", "cayhorstmann@live.com", 'F'),
                new Author("Kathy Sierra", "kathysierra@gmail.com", 'M'),
                new Author("Craig Walls", "craigwalls@yahoo.com", 'M'),
                new Author("MG Martin", "martin@gmail.com", 'M'),
                new Author("Y. Daniel Liang", "danielliang@live.com", 'M'),
                new Author("Nathan Clark", "nathanclark@gmail.com", 'F')
        };

        Book b1[] = new Book[] {
                new Book("Head First Java", a1[0], 5360.00, 5),
                new Book("Java: An Introduction to Problem Solving", a1[1], 4300.00, 0),
                new Book("Java : A Beginner's Guide", a1[2], 3874.00, 8),
                new Book("Core Java", a1[3], 3874.00, 5),
                new Book("Core Java SE 9", a1[3], 5170.00, 10),
                new Book("OCA/OCP Java SE 7", a1[4], 4330.00, 0),
                new Book("Sparing in Action", a1[5], 5440.00, 6),
                new Book("Java: Basic for Beginners", a1[6], 980.00, 4),
                new Book("Intro to Java Programming", a1[7], 2500.00, 3),
                new Book("Java: Programming Basics", a1[8], 500.00, 7)

        };

        String nameOfBook;
        int q;
        System.out.print("-----Books available from the library-----\n\n");

        System.out.print(
                "*_Head First Java \n*_Java: An Introduction to Problem Solving\n*_Java : A Beginner's Guide\n*_Core Java\n*_Core Java SE 9\n*_OCA/OCP Java SE 7\n*_Sparing in Action\n*_Java: Basic for Beginners\n*_Intro to Java Programming\n*_Java: Programming Basics\n");

        System.out.print("\nEnter the Name of the Book you want : ");
        nameOfBook = sc.nextLine();

        boolean bookFound = false; // Track if the book is found

        for (int i = 0; i < 10; i++) {
            if (b1[i].getName().contains(nameOfBook)) {
                System.out.print("Enter the Quantity : ");
                q = sc.nextInt();

                if (q <= b1[i].getQuantity()) {
                    System.out.println("Available..!\n");
                    System.out.println("**------Book Details-----**\n");
                    System.out.println(b1[i].toString());
                    bookFound = true;
                    break; // Exit the loop if the book is found and available
                } else {
                    System.out.println("Not enough stock available.");
                    bookFound = true;
                    break; // Exit the loop if the book is found but not available
                }
            }
        }

        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }
}
