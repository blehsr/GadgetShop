public class Smartphone extends Gadget {
    //
    public Smartphone(String model, double price, int weight, String size) { super(model, price, weight, size); }
    @Override public String toString() { return "Smartphone brand{model='" + getModel() + "price = £" + getPrice() + ",weight=" + getWeight() + "g, size =" + getSize(); }
}