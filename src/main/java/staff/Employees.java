package staff;

public class Employees {
    public int id;
    public String name;
    public static int lastId = 0;

    public Employees(String name) {
        lastId = lastId + 1;
        this.id = lastId;
        this.name = name;
    }
}
