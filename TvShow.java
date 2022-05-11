public class TvShow {
    private String name;
    private int episodes;
    private String genre;
    
    public TvShow(String ShowName, int episodeNumbers, String ShowGenre) {
        this.name = ShowName;
        this.episodes = episodeNumbers;
        this.genre = ShowGenre;
    }
    public String getShowName() {
        return name;
    }
    public int getEpisodes() {
        return episodes;
    }
    public String getGenre() {
        return genre;
    }
    @Override
        public String toString() {
        getShowName();
        getEpisodes();
        getGenre();
        return "The name of the show is " + name + " and the total number of episodes is " + episodes + ".\nThe genere of the tv show is " + genre + ".";
    }
}
