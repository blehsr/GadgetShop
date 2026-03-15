import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class GadgetShop extends Application {
// all the variables (refer back)
    private final TextField nameField = new TextField();
    private final TextField memoryField = new TextField();
    private final TextField moreMemoryField = new TextField();
    private final TextField displayNumberField = new TextField();
    private final TextArea logArea = new TextArea();
    private final ArrayList<Gadget> Gadget = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
// label/fields 
        Label nameLabel = new Label("MP3 name:");
        nameLabel.setLayoutX(20);
        nameLabel.setLayoutY(20);

        nameField.setLayoutX(140);
        nameField.setLayoutY(20);

        Label memoryLabel = new Label("Memory (MB):");
        memoryLabel.setLayoutX(20);
        memoryLabel.setLayoutY(55);

        memoryField.setLayoutX(140);
        memoryField.setLayoutY(55);
        
        Label displayNumberLabel = new Label("Display Number:");
        displayNumberLabel.setLayoutX(20);
        displayNumberLabel.setLayoutY(90);

        displayNumberField.setLayoutX(140);
        displayNumberField.setLayoutY(90);
        
// button settings
        Button addMP3Button = new Button("Add MP3");
        addMP3Button.setLayoutX(140);
        addMP3Button.setLayoutY(130);
        
        Button moreMemoryButton = new Button ("More Memory");
        moreMemoryButton.setLayoutX(140);
        moreMemoryButton.setLayoutY(165);
        

        
        Button displayAllButton = new Button("Display all gadgets");
        displayAllButton.setLayoutX(140);
        displayAllButton.setLayoutY(200);


        Button clearAllFieldsButton = new Button("Clear all fields");
        clearAllFieldsButton.setLayoutX(20);
        clearAllFieldsButton.setLayoutY(200);
        
// log area for all buttons
        logArea.setLayoutX(20);
        logArea.setLayoutY(240);
        logArea.setPrefSize(520,150);
        
// button settings - the actions of them

        addMP3Button.setOnAction(e -> {
                try {
                    MP3 m = new MP3(nameField.getText(),Integer.parseInt(memoryField.getText().trim()));
                    Gadget.add(m);
                    logArea.appendText("You now have this much memory: " + m + System.lineSeparator());
                    m.display();
                } catch (NumberFormatException ex){
                    showError("Input Error", "Check that the memory counts number is correct.");
                }
        });
        moreMemoryButton.setOnAction(e -> {
           int index = Integer.parseInt(displayNumberField.getText().trim()); // gets the indexed number of user input
           MP3 m = (MP3) Gadget.get(index); // this gets the mp3 object from gadget list
           int amount = Integer.parseInt(memoryField.getText().trim());
           m.moreMemory(amount);
        
            logArea.appendText("You now have this much memory: " + m + System.lineSeparator());
            m.display();
        });
        clearAllFieldsButton.setOnAction(e-> {  // clears content from gui
            nameField.clear();
            memoryField.clear();
            displayNumberField.clear();
            logArea.appendText("Cleared all fields." + System.lineSeparator());
        });
        
        displayAllButton.setOnAction(e -> {;
        logArea.appendText("=== Display All Gadgets ===" + System.lineSeparator());
        for (int i = 0; i < Gadget.size(); i++) {
            logArea.appendText("Display Number: " + i + System.lineSeparator());
            Gadget g = Gadget.get(i);
            logArea.appendText(g.toString() + System.lineSeparator());
            logArea.appendText("------------------------" + System.lineSeparator());
                
        }
    });
    
        root.getChildren().addAll(nameLabel, nameField, memoryLabel, memoryField, addMP3Button, displayAllButton, moreMemoryButton,clearAllFieldsButton,logArea, displayNumberLabel, displayNumberField);
        stage.setScene(new Scene(root, 560, 400));
        stage.setTitle("Gadget Shop 1");
        stage.show();
    } // outside of start method
 
// error messages
    private int getDisplayNumber() {
        int displayNumber = -1;
        try {
            int index = Integer.parseInt(displayNumberField.getText().trim());
            if (index >= 0 && index < Gadget.size()) {
                displayNumber = index;
            } else if (Gadget.size() == 0) {
                showError("There are no gadgets.", "Add a gadget first.");
            } else {
                showError("This is an invalid number.", "Enter a value between 0 and" + (Gadget.size() -1));
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
            MP3 m = (MP3) Gadget.get(displayNum);
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