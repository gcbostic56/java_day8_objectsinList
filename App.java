import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) throws Exception {
        
        System.out.println("Animal Menu for the Doggos or Not...");
        System.out.println("Entering nothing will stop the loopy.");
        
        ArrayList<Animal> list = new ArrayList<>();
        Animal Steve = new Animal("Steve");
        Animal bigFacts = new Animal(true);
        Animal empty = new Animal();
        Collections.addAll(list, Steve, bigFacts, empty);

        while(true) {
            boolean TrueOrNot = false;
            System.out.println("Please enter an animal name:");
            String animalName = scanner.nextLine();
            
           
            if (animalName.equalsIgnoreCase("")) {
                System.out.println("You entered an empty string and the program is over.");
                break;
            }
            
            System.out.println("Please enter yes or no if "+animalName+ " is a dog:");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("yes")) {
                TrueOrNot = true;
            }
            list.add(new Animal(animalName, TrueOrNot));
            System.out.println(list);
            continue;
        }
        for (Animal animal: list) {
            System.out.println(animal);
    }
    ArrayList<TvShow> showList = new ArrayList<>();
    TvShow BobsBurgers = new TvShow("Bob's Burgers");
    TvShow FamilyGuy = new TvShow("Family Guy", 500);
    TvShow Stinky = new TvShow(400);
    TvShow GoT = new TvShow("Game of Thrones", "drama");
    TvShow newEmpty = new TvShow();
    Collections.addAll(showList, BobsBurgers, FamilyGuy, Stinky, GoT, newEmpty);
    System.out.println("Let's find out some tv show information");
    while(true) {
        System.out.println("Name of the show:");
        String showName = scanner.nextLine();
        if (showName.equalsIgnoreCase("")) {
            System.out.println("You entered nothing and the program will close.");
            break;
        }
        System.out.println("Number of episodes:");
        int episodeNumbers = scanner.nextInt();
        System.out.println("What is the genre?");
        scanner.nextLine();
        String genre = scanner.nextLine();
        showList.add(new TvShow(showName, episodeNumbers, genre));
        System.out.println(showList);
        continue;
    }
    for (TvShow tvshow: showList) {
        System.out.println(tvshow);
    }
        System.out.println("Let's play with some books.");
        ArrayList<Book> bookList = new ArrayList<>();
        Book StormOfSwords = new Book("Storm of Swords");
        Book Holes = new Book(400, 1982);
        Book DiaryOfJane = new Book("Diary of Jane", 500);
        Book noBook = new Book();
        Book bookYear = new Book(1973);
        Collections.addAll(bookList, StormOfSwords, Holes, DiaryOfJane, noBook, bookYear);
    while(true) {
        System.out.println("Enter a book name or enter an empty string to break program.");
        String bookName = scanner.nextLine();
        if (bookName.equalsIgnoreCase("")) {
            System.out.println("You done did the thing. Program over. Happy reading.");
            break;
        }
        System.out.println(bookName+ " is a good book. How many pages is it, again?");
        int pages = scanner.nextInt();
        System.out.println("What year was it published?");
        int year = scanner.nextInt();
        scanner.nextLine();
        bookList.add(new Book(bookName, pages, year));
        System.out.println(bookList);
    }
        System.out.println("What would you like to print out? For everything, enter everything. For book titles, enter name.");
        String answer = scanner.nextLine();
        for (Book book: bookList) {

        System.out.println(book.toString(answer));
        }
    }
    }

