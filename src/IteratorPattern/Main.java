package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Song 1", "Classical"));
        playlist.addSong(new Song("Song 2", "Rock"));
        playlist.addSong(new Song("Song 3", "Jazz"));
        playlist.addSong(new Song("Song 4", "METAAAAAL"));
        playlist.addSong(new Song("Song 5", "Rock"));

        System.out.println("Sequential order:");
        Iterator sequentialIterator = playlist.createSequentialIterator();
        while (sequentialIterator.hasNext())
            System.out.println(sequentialIterator.next());

        System.out.println("\nShuffle order:");
        Iterator shuffleIterator = playlist.createShuffleIterator();
        while (shuffleIterator.hasNext())
            System.out.println(shuffleIterator.next());

        System.out.println("\nFilter by genre (Rock):");
        Iterator genreFilterIterator = playlist.createGenreFilterIterator("Rock");
        while (genreFilterIterator.hasNext())
            System.out.println(genreFilterIterator.next());
    }
}

