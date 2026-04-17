public class MP3 extends Gadget {
    // for storing how much memory the mp3 has 
    
    private int memory;
    
    // overall constructors for mp3
    public MP3(String model,double price, int weight, String size, int memory) { 
        super(model, price, weight, size); 
        this.memory=memory; // set the memory value
    }
    
    // returns current memory amount 
    public int getMemory() { return memory; }
    
    public void moreMemory(int amount) {
        if (amount > 0) {
            memory += amount; // add to existing memory
            System.out.println("Added" + amount + "MB memory. Total memory:" + memory + "MB");
        } else { System.out.println("Error: Please enter a positive amount of memory.");
        } // user gets a warning if they don't enter correct num.
    }
    
    // uses up memory space
    public void downloadMusic(int downloadSize) {
        if (downloadSize <= 0) {
            System.out.println("Error: Download size must be positive.");
            return;
        }
        
        if (memory >= downloadSize) {
            memory -= downloadSize; // can't download nothing or negative size
            System.out.println("Downloaded music of size " + downloadSize + "MB.");
            System.out.println("Remaining memory: " + memory + "MB.");
        } else {
            System.out.println("Error: Insufficient memory to download.");
            System.out.println("You need " + downloadSize + "MB but only have " + memory + "MB available.");
        }
    } 
    public void deleteMusic(int deleteSize) {
        if (deleteSize <= 0) {
            System.out.println("Error: Delete size must be positive.");
            return;
        }
        
        memory += deleteSize;
        System.out.println("Deleted music of size " + deleteSize + "MB.");
        System.out.println("Available memory: " + memory + "MB.");
    }

    @Override 
    public String toString() { 
        return "MP3{model='" + getModel() + "', price=£" + getPrice() + 
               ", weight=" + getWeight() + "g, size='" + getSize() + 
               "', memory=" + memory + "MB}"; 
    }
    
    
    // mp3 details printed so console sees
    @Override 
    public void display() { 
        System.out.println("MP3 Player");
        super.display();
        System.out.println("Memory=" + memory + "MB");
    }
}
    
 