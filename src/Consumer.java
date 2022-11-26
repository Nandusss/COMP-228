/*
 * Nandagopan Dilip
 * Student #: 301166925
 */
public class Consumer {
    private String id;
    private String name;

    public Consumer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    //getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
