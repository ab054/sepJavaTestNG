public class Movie {

    String name;
    String director;
    float rating;
    private boolean released;

    public Movie(String name, String director, float rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public void realese(){
        released = true;
    }

    boolean isReleased(){
        return released;
    }

    public void watch(){
        System.out.println("Watching " + name + " by " + director + " with rating:" + rating);
    }
}
