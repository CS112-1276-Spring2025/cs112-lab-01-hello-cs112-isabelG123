public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112");
        Main.printMessage();
        System.out.println(Main.addTwoNumber(5, 20));

        Song song1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 5.55);
        Song song2 = new Song();
        // Display song info
        song1.displaySongInfo();

        // Update song title and display updated info
        song1.setTitle("Under Pressure");
        song1.displaySongInfo();
        song2.displaySongInfo();

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