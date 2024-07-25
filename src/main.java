import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animals = new ArrayList<>();
        while (true) {
            System.out.print("Please enter a name:");
            String animalName = scanner.nextLine();
            if (animalName.equals("done")) {
                break;
            }
            System.out.print("Is it a dog? Yes or no:");
            String animalType = scanner.nextLine();
            boolean isDog;
            if (animalType.equalsIgnoreCase("yes")) {
                isDog = true;
            }
            else {
                isDog = false;
            }
            animals.add(new Animal(animalName, isDog));
        }
        for (Animal animal: animals) {
            System.out.println(animal);
        }

        ArrayList<TvShow> shows = new ArrayList<>();
        while (true) {
            System.out.print("Name of the show:");
            System.out.println("");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("How many episodes?");
            System.out.println("");
            int numEpisodes = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character from nextInt otherwise this bugs out and skips letting the user input the genre
            System.out.print("What is the genre?");
            System.out.println("");
            String genre = scanner.nextLine();

        shows.add(new TvShow(name, numEpisodes, genre));
    }
        for (TvShow show: shows) {
        System.out.println(show);
    }

        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title of the book:");
            System.out.println("");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("How many pages?");
            System.out.println("");
            int pages = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character from nextInt otherwise this bugs out and skips letting the user input the genre
            System.out.print("What year was it published?");
            System.out.println("");
            int pubYear = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character from nextInt otherwise this bugs out and skips letting the user input the genre

            books.add(new Book(title, pages, pubYear));
        }
        while (true) {
            System.out.print("What information will be printed? ");
            String whatToPrint = scanner.nextLine();
            if (whatToPrint.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            } else if (whatToPrint.equalsIgnoreCase("name")) {
                for (Book book : books) {
                    System.out.println(book.getTitle());
                }
                break;
            } else {
                System.out.println("Should I print everything or just the names?");
            }
        }

        scanner.close();
    }
}
