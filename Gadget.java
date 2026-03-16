public class Gadget {
    
// this is for the text fields (basic aspects of the gadget)
    private final String model;
    private final double price;
    private final int weight;
    private final String size;
    
    
    public Gadget(String model, double price, int weight, String size) { this.model = model; this.price = price; this.weight = weight; this.size = size; }
    public String getModel() { return model; }
    public double getPrice() {return price;}
    public 
    
    
    
    
    @Override public String toString() { return "Gadget{name='" + model +"'}"; }
    public void display() { System.out.println("name=" + model);}
}