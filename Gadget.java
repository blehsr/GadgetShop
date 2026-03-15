public class Gadget {
    private final String name;
    public Gadget(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return "Gadget{name='" + name +"'}"; }
    public void display() { System.out.println("name=" + name);}
}