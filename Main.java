public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112");
        Main.printMessage();
        System.out.println(Main.addTwoNumber(5, 20));

        Song song1 = new Song("DtMf", "Bad Bunny", "Hip-Hop/Rap", 3.57);
        Song song2 = new Song();
        // Display song info
        song1.displaySongInfo();

        // Update song title and display updated info
        song1.displaySongInfo();
        song2.displaySongInfo();

        System.out.println("HELLO");

    }

    public static void printMessage()
    {
        System.out.println("Hello my name is Isabel.");
    }

    public static int addTwoNumber(int num1 , int num2)
    {
        return num1 + num2;
    }
    


}