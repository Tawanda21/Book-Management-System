import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class customermanagement extends Application {

    private TextInputControl addressField;
    private TextInputControl phoneField;
    private TextInputControl emailField;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPrefSize(499, 400);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(513, 400);

        Label nameLabel = new Label("Customer Name");
        nameLabel.setPrefSize(138, 48);
        nameLabel.setLayoutY(14);
        nameLabel.setPadding(new Insets(10));

        Label emailLabel = new Label("Email");
        emailLabel.setPrefSize(138, 48);
        emailLabel.setLayoutY(91);
        emailLabel.setPadding(new Insets(10));

        Label phoneLabel = new Label("Phone Number");
        phoneLabel.setPrefSize(138, 48);
        phoneLabel.setLayoutY(176);
        phoneLabel.setPadding(new Insets(10));

        Label addressLabel = new Label("Address");
        addressLabel.setPrefSize(138, 48);
        addressLabel.setLayoutY(259);
        addressLabel.setPadding(new Insets(10));

        Button addBtn = new Button("Add Customer");
        addBtn.setPrefSize(119, 48);
        addBtn.setLayoutX(7);
        addBtn.setLayoutY(336);

        // Event handler for Add Customer button
        addBtn.setOnAction(event -> {
            // Perform the add customer functionality here
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            System.out.println("Adding customer: " + name + ", " + email + ", " + phone + ", " + address);
            // Add your logic for adding the customer to the database or performing other actions
        });

        Button editBtn = new Button("Edit Customer");
        editBtn.setPrefSize(119, 48);
        editBtn.setLayoutX(138);
        editBtn.setLayoutY(336);

        // Event handler for Edit Customer button
        editBtn.setOnAction(event -> {
            // Perform the edit customer functionality here
            System.out.println("Editing customer");
            // Add your logic for editing the customer details
        });

        Button deleteBtn = new Button("Delete Customer");
        deleteBtn.setPrefSize(119, 48);
        deleteBtn.setLayoutX(270);
        deleteBtn.setLayoutY(336);

        // Event handler for Delete Customer button
        deleteBtn.setOnAction(event -> {
            // Perform the delete customer functionality here
            System.out.println("Deleting customer");
            // Add your logic for deleting the customer from the database or performing other actions
        });

        Button clearBtn = new Button("Clear Fields");
        clearBtn.setPrefSize(82, 48);
        clearBtn.setLayoutX(406);
        clearBtn.setLayoutY(336);

        // Event handler for Clear Fields button
        clearBtn.setOnAction(event -> {
            // Clear all the text fields
            nameField.clear();
            emailField.clear();
            phoneField.clear();
            addressField.clear();
        });

        TextField nameField = new TextField();
        nameField.setPrefSize(216, 48);
        nameField.setLayoutX(138);
        nameField.setLayoutY(14);
        nameField.setPadding(new Insets(10));

        TextField emailField = new TextField();
        emailField.setPrefSize(216, 48);
        emailField.setLayoutX(138);
        emailField.setLayoutY(92);
        emailField.setPadding(new Insets(10));

        TextField phoneField = new TextField();
        phoneField.setPrefSize(216, 48);
        phoneField.setLayoutX(138);
        phoneField.setLayoutY(176);
        phoneField.setPadding(new Insets(10));

        TextField addressField = new TextField();
        addressField.setPrefSize(216, 48);
        addressField.setLayoutX(138);
        addressField.setLayoutY(259);
        addressField.setPadding(new Insets(10));

        anchorPane.getChildren().addAll(nameLabel, emailLabel, phoneLabel, addressLabel,
                addBtn, editBtn, deleteBtn, clearBtn, nameField, emailField, phoneField, addressField);
        root.getChildren().add(anchorPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Customer Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
