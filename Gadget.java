public class Gadget {
    
// this is for the text fields (basic aspects of the gadget)
    private final String model;
    private final double price;
    private final int weight;
    private final String size;
    
    
    public Gadget(String model, double price, int weight, String size) { this.model = model; this.price = price; this.weight = weight; this.size = size; }
    public String getModel() { return model; }
    public double getPrice() {return price;}
    public int getWeight() {return weight;}
    public String getSize() {return size;}
    
    
    
    
    @Override 
    public String toString() { return "Gadget{model='" + model +",, price = £" + price + ",weight=" + weight + "g, size=" + size + " }"; }
    public void display() { System.out.println("model=" + model); System.out.println("Price: £" + price); System.out.println("Weight:" + weight +"g"); System.out.println("Size:" + size);}                                
}