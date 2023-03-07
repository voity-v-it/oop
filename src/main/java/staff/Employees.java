package staff;

public class Employees {
    private int id;
    public String name;
    private static int lastId = 0;

    public Employees(String name) {
        lastId = lastId + 1;
        this.id = lastId;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
