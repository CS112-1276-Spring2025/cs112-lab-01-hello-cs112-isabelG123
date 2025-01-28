public class song {
        
    // Declare private variables for song properties
        private String title;
        private String artist;
        private String genre;
        private double duration;
    
        // Constructor to initialize the song object
        public Song(String title, String artist, String genre, double duration) {
            this.title = title;
            this.artist = artist;
            this.genre = genre;
            this.duration = duration;
        }
    
        // Getter for title
        public String getTitle() {
            return title;
        }
    
        // Setter for title
        public void setTitle(String title) {
            this.title = title;
        }
    
        // Getter for artist
        public String getArtist() {
            return artist;
        }
    
        // Setter for artist
        public void setArtist(String artist) {
            this.artist = artist;
        }
    
        // Getter for genre
        public String getGenre() {
            return genre;
        }
    
        // Setter for genre
        public void setGenre(String genre) {
            this.genre = genre;
        }
    
        // Getter for duration
        public double getDuration() {
            return duration;
        }
    
        // Setter for duration
        public void setDuration(double duration) {
            this.duration = duration;
        }
    
        // Method to display song details
        public void displaySongInfo() {
            System.out.println("Song Title: " + title);
            System.out.println("Artist: " + artist);
            System.out.println("Genre: " + genre);
            System.out.println("Duration: " + duration + " minutes");
        }
    
}
