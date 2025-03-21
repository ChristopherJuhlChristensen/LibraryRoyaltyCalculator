import models.*;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author olgaRavn = new Author("Olga Ravn");

        PrintedBook printedBook = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook audioBook = new AudioBook("Celestine", "SKØN", 140, 192);

        olgaRavn.addTitle(printedBook);
        olgaRavn.addTitle(audioBook);

        System.out.println(olgaRavn.getName() + ": " + olgaRavn.calculateTotalPay() + " kr");
    }
}
