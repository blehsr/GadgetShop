public class Smartphone extends Gadget {
    private int callingCredit;
    
    public Smartphone(String model, double price, int weight, String size, int callingCredit) { 
        super(model, price, weight, size); 
        this.callingCredit = callingCredit;
    }
    
    public int getCallingCredit() { return callingCredit; } // calling credit is in mins
    
    public void addCredit(int amount) {
        if (amount > 0) {
            callingCredit += amount;
            System.out.println("Added " + amount + " minutes credit. Total credit: " + callingCredit);
        } else {
            System.out.println("Error: Please enter a positive amount of credit.");
        }
    }
    public void makeCall(String phoneNumber, int duration) {
        // check that the call is positive
        if (duration <= 0) {
            System.out.println("Error: Call duration must be positive.");
            return;
        }
        // checks if user has enough credit
        if (callingCredit >= duration) {
            callingCredit -= duration; // helps reduce credit
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            System.out.println("Remaining credit: " + callingCredit + " minutes.");
        } else {
            System.out.println("Error: Insufficient credit to make the call.");
            System.out.println("You need " + duration + " minutes but only have " + callingCredit + " minutes.");
        }
    }
    
     @Override
    public void display() {
        super.display();
        System.out.println("Calling Credit: " + callingCredit + " minutes");
    }
    
    @Override
    public String toString() {
        return "Smartphone{model='" + getModel() + "', price=£" + getPrice() + 
               ", weight=" + getWeight() + "g, size='" + getSize() + 
               "', credit=" + callingCredit + " minutes}";
    }
}
