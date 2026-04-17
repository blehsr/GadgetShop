import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

// github test
public class GadgetShop extends Application {
// all the variables for both gadgets (refer back)
    
    private final TextField displayNumberField = new TextField();
    private final TextArea logArea = new TextArea();
    private final ArrayList<Gadget> gadgets = new ArrayList<>();
    private final TextField modelField = new TextField();
    private final TextField priceField = new TextField();
    private final TextField weightField = new TextField();
    private final TextField sizeField = new TextField();

// smartphone specific

    private final TextField creditField = new TextField();
    private final TextField phoneNumberField = new TextField();
    private final TextField durationField = new TextField();
    
    
// mp3 specific

    private final TextField memoryField = new TextField();
    private final TextField downloadSizeField = new TextField();
    private final TextField moreMemoryField = new TextField();
    
    
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
// label/fields 

        
        // menu buttons at the top
        Button smartphoneMenuBtn = new Button("Smartphone Menu");
        smartphoneMenuBtn.setLayoutX(20);
        smartphoneMenuBtn.setLayoutY(20);
        
        Button mp3MenuBtn = new Button("MP3 Menu");
        mp3MenuBtn.setLayoutX(160);
        mp3MenuBtn.setLayoutY(20);
        
        // fields both gadgets will be using
        Label modelLabel = new Label("Model:");
        modelLabel.setLayoutX(20);
        modelLabel.setLayoutY(60);
        modelField.setLayoutX(140);
        modelField.setLayoutY(60);
        
        Label priceLabel = new Label("Price (£):");
        priceLabel.setLayoutX(20);
        priceLabel.setLayoutY(95);
        priceField.setLayoutX(140);
        priceField.setLayoutY(95);
        
        Label weightLabel = new Label("Weight (g):");
        weightLabel.setLayoutX(20);
        weightLabel.setLayoutY(130);
        weightField.setLayoutX(140);
        weightField.setLayoutY(130);
        
        Label sizeLabel = new Label("Size:");
        sizeLabel.setLayoutX(20);
        sizeLabel.setLayoutY(165);
        sizeField.setLayoutX(140);
        sizeField.setLayoutY(165);
        
        // only for the smartphone
        Label creditLabel = new Label("Credit (mins):");
        creditLabel.setLayoutX(20);
        creditLabel.setLayoutY(200);
        creditField.setLayoutX(140);
        creditField.setLayoutY(200);
        
        Button addSmartphoneBtn = new Button("Add Smartphone");
        addSmartphoneBtn.setLayoutX(20);
        addSmartphoneBtn.setLayoutY(240);
        
        // only for the mp3
        Label memoryLabel = new Label("Memory (MB):");
        memoryLabel.setLayoutX(20);
        memoryLabel.setLayoutY(200);
        memoryField.setLayoutX(140);
        memoryField.setLayoutY(200);
        
        Button addMP3Btn = new Button("Add MP3");
        addMP3Btn.setLayoutX(20);
        addMP3Btn.setLayoutY(240);
        
        // this where the user will make a call
        Label callLabel = new Label("MAKE A CALL");
        callLabel.setLayoutX(20);
        callLabel.setLayoutY(290);
        
        Label displayLabel = new Label("Display Number:");
        displayLabel.setLayoutX(20);
        displayLabel.setLayoutY(325);
        displayNumberField.setLayoutX(140);
        displayNumberField.setLayoutY(325);
        
        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setLayoutX(20);
        phoneLabel.setLayoutY(360);
        phoneNumberField.setLayoutX(140);
        phoneNumberField.setLayoutY(360);

        Button addCreditBtn = new Button("Add Credit");
        addCreditBtn.setLayoutX(20);
        addCreditBtn.setLayoutY(480);
        
        Label durationLabel = new Label("Duration (mins):");
        durationLabel.setLayoutX(20);
        durationLabel.setLayoutY(395);
        durationField.setLayoutX(140);
        durationField.setLayoutY(395);
        
        Button makeCallBtn = new Button("MAKE A CALL");
        makeCallBtn.setLayoutX(20);
        makeCallBtn.setLayoutY(435);
        
        // where the user will be able to download new music
        Label downloadLabel = new Label("DOWNLOAD MUSIC");
        downloadLabel.setLayoutX(20);
        downloadLabel.setLayoutY(290);
        
        Label downloadSizeLabel = new Label("Download Size (MB):");
        downloadSizeLabel.setLayoutX(20);
        downloadSizeLabel.setLayoutY(325);
        downloadSizeField.setLayoutX(140);
        downloadSizeField.setLayoutY(325);
        
        Button downloadBtn = new Button("DOWNLOAD MUSIC");
        downloadBtn.setLayoutX(20);
        downloadBtn.setLayoutY(370);
        
        // user can add memory
        Button addMemoryBtn = new Button("Add Memory");
        addMemoryBtn.setLayoutX(170);
        addMemoryBtn.setLayoutY(370);
        
        // any of the other buttons
        Button displayAllBtn = new Button("Display All");
        displayAllBtn.setLayoutX(20);
        displayAllBtn.setLayoutY(490);
        
        Button clearBtn = new Button("Clear Fields");
        clearBtn.setLayoutX(140);
        clearBtn.setLayoutY(490);
        
        Button exitBtn = new Button("Exit");
        exitBtn.setLayoutX(260);
        exitBtn.setLayoutY(490);
        
        // log area
        logArea.setLayoutX(20);
        logArea.setLayoutY(560);
        logArea.setPrefSize(460, 120);
        
        // this helps start with smartphone menu visible
        creditLabel.setVisible(true);
        creditField.setVisible(true);
        addSmartphoneBtn.setVisible(true);
        memoryLabel.setVisible(false);
        memoryField.setVisible(false);
        addMP3Btn.setVisible(false);
        
        callLabel.setVisible(true);
        phoneLabel.setVisible(true);
        phoneNumberField.setVisible(true);
        durationLabel.setVisible(true);
        durationField.setVisible(true);
        makeCallBtn.setVisible(true);
       
        
        downloadLabel.setVisible(false);
        downloadSizeLabel.setVisible(false);
        downloadSizeField.setVisible(false);
        downloadBtn.setVisible(false);
        moreMemoryField.setVisible(false);
        addMemoryBtn.setVisible(false);

        // menu button actions
        smartphoneMenuBtn.setOnAction(e -> {
            creditLabel.setVisible(true);
            creditField.setVisible(true);
            addSmartphoneBtn.setVisible(true);
            memoryLabel.setVisible(false);
            memoryField.setVisible(false);
            addMP3Btn.setVisible(false);
            
            downloadLabel.setVisible(false);
            downloadSizeLabel.setVisible(false);
            downloadSizeField.setVisible(false);
            downloadBtn.setVisible(false);
            addMemoryBtn.setVisible(false);
            moreMemoryField.setVisible(false);
            
            callLabel.setVisible(true);
            displayLabel.setVisible(true);
            displayNumberField.setVisible(true);
            phoneLabel.setVisible(true);
            phoneNumberField.setVisible(true);
            durationLabel.setVisible(true);
            durationField.setVisible(true);
            makeCallBtn.setVisible(true);
            
            logArea.appendText("Switched to Smartphone Menu\n");
        });
            

        mp3MenuBtn.setOnAction(e -> {

            memoryLabel.setVisible(true);
            memoryField.setVisible(true);
            addMP3Btn.setVisible(true);
            creditLabel.setVisible(false);
            creditField.setVisible(false);
            addSmartphoneBtn.setVisible(false);
            
            callLabel.setVisible(false);
            displayLabel.setVisible(false);
            displayNumberField.setVisible(false);
            phoneLabel.setVisible(false);
            phoneNumberField.setVisible(false);
            durationLabel.setVisible(false);
            durationField.setVisible(false);
            makeCallBtn.setVisible(false);
            addCreditBtn.setVisible(false);
            
            downloadLabel.setVisible(true);
            downloadSizeLabel.setVisible(true);
            downloadSizeField.setVisible(true);
            downloadBtn.setVisible(true);
            moreMemoryField.setVisible(true);
            addMemoryBtn.setVisible(true);
            
            
            logArea.appendText("Switched to MP3 Menu\n");
        });
        

        // button actions
        addSmartphoneBtn.setOnAction(e -> addSmartphone());
        addMP3Btn.setOnAction(e -> addMP3());
        makeCallBtn.setOnAction(e -> makeCall());
        downloadBtn.setOnAction(e -> downloadMusic());
        addMemoryBtn.setOnAction(e -> addMoreMemory());
        displayAllBtn.setOnAction(e -> displayAll());
        clearBtn.setOnAction(e -> clearAll());
        exitBtn.setOnAction(e -> System.exit(0));
        
        // adds everything to root
        root.getChildren().addAll(
            smartphoneMenuBtn, mp3MenuBtn,
            modelLabel, modelField,
            priceLabel, priceField,
            weightLabel, weightField,
            sizeLabel, sizeField,
            creditLabel, creditField, addSmartphoneBtn,
            memoryLabel, memoryField, addMP3Btn,
            callLabel, displayLabel, displayNumberField, phoneLabel, phoneNumberField,
            durationLabel, durationField, makeCallBtn,
            downloadLabel, downloadSizeLabel, downloadSizeField, downloadBtn,
            addMemoryBtn, displayAllBtn, clearBtn, exitBtn,
            logArea
        );
        
        stage.setScene(new Scene(root, 520, 680));
        stage.setTitle("Gadget Shop");
        stage.show();
    }
     // outside of start method
 
// error messages
    private int getDisplayNumber() {
        int displayNumber = -1;
        try {
            int index = Integer.parseInt(displayNumberField.getText().trim());
            if (index >= 0 && index < gadgets.size()) {
                displayNumber = index;
            } else if (gadgets.size() == 0) {
                showError("There are no gadgets.", "Add a gadget first.");
            } else {
                showError("This is an invalid number.", "Enter a value between 0 and" + (gadgets.size() -1));
            }
        } catch (NumberFormatException ex) {
            showError("Invalid Number", "Display number must be an integer.");
        }
        return displayNumber;
    }
    private void handleMoreMemory() {
        int displayNum = getDisplayNumber();
        if (displayNum == -1) return;
        try {
            MP3 m = (MP3) gadgets.get(displayNum);
            m.moreMemory(getMoreMemory());
            logArea.appendText("More memory executed on index" + displayNum);
        } catch (ClassCastException ex) {
            showError("Type Error", "The selected gadget is not an MP3");
        } catch (NumberFormatException ex) {
            showError("Input Error", "Number in more memory field must be an integer.");
            
        } catch(Exception ex){
            showError("Error", "Could not add memory to the gadget:"+ ex.getMessage());
        }
    }
    
    private int getMoreMemory() {
        try {
            return Integer.parseInt(memoryField.getText().trim());
        } catch (NumberFormatException e) {
            showError("Input Error", "Enter a valid number for the memory.");
            return -1;
        }
        
    }
    
    private void downloadMusic() {
    try {
        int index = Integer.parseInt(displayNumberField.getText());
        if (index >= 0 && index < gadgets.size()) {
            MP3 mp3 = (MP3) gadgets.get(index);
            int size = Integer.parseInt(downloadSizeField.getText());
            mp3.downloadMusic(size);
            logArea.appendText("Downloaded " + size + "MB\n");
        } else {
            showError("Invalid Number", "Enter 0-" + (gadgets.size()-1));
        }
    } catch (ClassCastException e) {
        showError("Error", "Not an MP3 player");
    } catch (Exception e) {
        showError("Error", "Check your inputs");
    }
}
    
        private void addSmartphone() {
        try {
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String size = sizeField.getText();
            int credit = Integer.parseInt(creditField.getText());
            
            Smartphone s = new Smartphone(model, price, weight, size, credit);
            gadgets.add(s);
            logArea.appendText("Added Smartphone: " + model + "\n");
            // clearAll();
        } catch (Exception e) {
            showError("Input Error", "Check your inputs");
        }
    }
    
    private void addMP3() {
        try {
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            int size = Integer.parseInt(sizeField.getText());
            String memory = memoryField.getText();
            
            MP3 m = new MP3(model, price, weight, size, memory);
            gadgets.add(m);
            logArea.appendText("Added MP3: " + model + "\n");
            // clearAll();
        } catch (Exception e) {
            showError("Input Error", "Check your inputs");
        }
    }
    
    private void makeCall() {
        try {
            int index = Integer.parseInt(displayNumberField.getText());
            if (index >= 0 && index < gadgets.size()) {
                Smartphone phone = (Smartphone) gadgets.get(index);
                phone.makeCall(phoneNumberField.getText(), Integer.parseInt(durationField.getText()));
                logArea.appendText("Made call to " + phoneNumberField.getText() + "\n");
            } else {
                showError("Invalid Number", "Enter 0-" + (gadgets.size()-1));
            }
        } catch (ClassCastException e) {
            showError("Error", "Not a smartphone");
        } catch (Exception e) {
            showError("Error", "Check inputs");
        }
    }
    
    private void addMoreMemory() {
        try {
            int index = Integer.parseInt(displayNumberField.getText());
            if (index >= 0 && index < gadgets.size()) {
                MP3 mp3 = (MP3) gadgets.get(index);
                int amount = Integer.parseInt(moreMemoryField.getText());
                mp3.moreMemory(amount);
                logArea.appendText("Added " + amount + "MB memory\n");
            } else {
                showError("Invalid Number", "Enter 0-" + (gadgets.size()-1));
            }
        } catch (ClassCastException e) {
            showError("Error", "Not an MP3");
        } catch (Exception e) {
            showError("Error", "Check inputs");
        }
    }
    
private void displayAll() {
    if (gadgets.isEmpty()) {
        logArea.appendText("No gadgets to display\n");
        return;
    }
    logArea.appendText("\n=== ALL GADGETS ===\n");
    for (int i = 0; i < gadgets.size(); i++) {
        Gadget g = gadgets.get(i);
        logArea.appendText("Display Number: " + i + "\n");
        logArea.appendText("Model: " + g.getModel() + "\n");
        logArea.appendText("Price: £" + g.getPrice() + "\n");
        logArea.appendText("Weight: " + g.getWeight() + "g\n");
        logArea.appendText("Size: " + g.getSize() + "\n");
        
        if (g instanceof Smartphone) {
            Smartphone s = (Smartphone) g;
            logArea.appendText("Calling Credit: " + s.getCallingCredit() + " minutes\n");
        } else if (g instanceof MP3) {
            MP3 m = (MP3) g;
            logArea.appendText("Memory: " + m.getMemory() + "MB\n");
        }
        logArea.appendText("------------------------\n");
    }
}
    
    private void clearAll() {
        modelField.clear();
        priceField.clear();
        weightField.clear();
        sizeField.clear();
        creditField.clear();
        memoryField.clear();
        phoneNumberField.clear();
        durationField.clear();
        downloadSizeField.clear();
        moreMemoryField.clear();
        displayNumberField.clear();
        logArea.appendText("Cleared all fields\n");
    }

    // method for error
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}