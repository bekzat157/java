class Library {

    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book b = lib.new Book("Java Basics");

        b.show();
    }
}
