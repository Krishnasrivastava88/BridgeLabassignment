class LibraryBook {
    String title;
    String author;
    double price;
    boolean available = true;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}


