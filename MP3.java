public class MP3 extends Gadget {
    private int memory;
    public MP3(String name, int memory) { 
        super(name); 
        this.memory=memory;
    }
    
    public void moreMemory(int amount) {
    }

    @Override public String toString() { return "MP3 version{name='" + getName() + "' | egg='"+memory+"'}"; }
    @Override public void display() { 
        System.out.println("MP3");
        super.display();
        System.out.println("memory=" + memory);
    }
}