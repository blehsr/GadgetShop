public class MP3 extends Gadget {
    private int memory;
    public MP3(String model, int memory, double price, int weight, String size) { 
        super(model, price, weight, size); 
        this.memory=memory;
    }
    // comment here to allow me to make changes to git rep
    public int getMemory() { return memory; }
    
    public void moreMemory(int amount) {
        if (amount > 0) {
            memory += amount;
            System.out.println("Added" + amount + "MB memory. Total memory:" + memory + "MB");
        } else { System.out.println("Error: Please enter a positive amount of memory.");
        }
    }
        

    @Override public String toString() { return "MP3 version{model='" + getModel() + "' | price=£'"+ getPrice() + "| weight =" + getWeight() + "| g, size =" + getSize() + "| memory =" + memory + "MB}"; }
    
    @Override public void display() { 
        System.out.println("MP3");
        super.display();
        System.out.println("memory=" + memory + "MB");
    }
}