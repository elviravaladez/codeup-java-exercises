package movies;

public class Movie {
    private String name, category;

    //Constructor
    public Movie(String name, String category) {
        setMovieName(name);
        setCategory(category);
    }
    //Getters and Setters
    public String getMovieName() {
        return name;
    }
    public void setMovieName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
