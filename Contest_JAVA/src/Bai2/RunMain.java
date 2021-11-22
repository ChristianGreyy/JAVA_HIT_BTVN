package Bai2;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        int choose;
        do {
            System.out.println("1. Add book");
            System.out.println("2. Edit book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Sort books by name (ascending)");
            System.out.println("5. Sort books by price (descending)");
            System.out.println("6. Show all books");
            System.out.println("7. End");
            System.out.print("Enter your choose: "); choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    AddBook(books);
                    break;
                case 2:
                    EditBook(books);
                    break;
                case 3:
                    DeleteBook(books);
                    break;
                case 4:
                    SortByName(books);
                    break;
                case 5:
                    SortByPrice(books);
                    break;
                case 6:
                    Show(books);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Enter the valid choose");
            }
        } while(choose != 7);
    }

    public static void AddBook(ArrayList<Book> books) {
        Book book = new Book();
        book.input();
        books.add(book);
    }

    public static void EditBook(ArrayList<Book> books) {
        int id;
        System.out.print("Enter the id: ");
        id = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<books.size(); i++) {

            if(books.get(i).getId() == id) {
                Book book = new Book();
                book.input();
                books.set(i, book);
            }
        }
        System.out.println("The book is edited");

    }

    public static void DeleteBook(ArrayList<Book> books) {
        int id;
        System.out.println("Enter the id: "); id = sc.nextInt();
        for(int i=0; i<books.size(); i++) {
            if(books.get(i).getId() == id) {
                books.remove(i);
            }
        }
        System.out.println("The book is deleted");
    }

    public static void SortByName(ArrayList<Book> books) {
        for(int i=0; i<books.size() ; i++) {
            for (int j = i + 1; j < books.size(); j++) {
                String res1 = books.get(i).getName();
                String res2 = books.get(j).getName();
                if(res1.compareTo(res2) > 0) {
                    Collections.swap(books, i, j);
                }

            }
        }
    }

    public static void SortByPrice(ArrayList<Book> books) {
        for(int i=0; i<books.size() ; i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if(books.get(i).getPrice() < books.get(j).getPrice()) {
                    Collections.swap(books, i, j);
                }

            }
        }
        System.out.println("The list book is sorted");
    }

    public static void Show(ArrayList<Book> books) {
        System.out.println("============= LIST BOOK ===============");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "NameBook", "Publisher", "Price", "NumberPage", "NameAuthor");
        for(int i=0; i<books.size(); i++) {
            books.get(i).output();
        }
    }


}
