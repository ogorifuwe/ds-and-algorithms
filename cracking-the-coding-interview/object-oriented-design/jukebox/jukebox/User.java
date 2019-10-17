package jukebox;

public class User {

    private String name;
    private long id;

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setId(String id) { this.id = id; }
    public long getId() { return id; }

    private static User addUser(String name, long id) {
        return new User(name, id);
    }
}
