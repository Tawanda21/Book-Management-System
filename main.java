import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    @SuppressWarnings("unused")
    private Stage primaryStage;
    private Scene mainScene;
    private Scene addBookScene;
    private Scene processSalesScene;
    private Scene manageInventoryScene;
    private Scene customerManagementScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        VBox root = new VBox();
        root.setPrefSize(600, 381);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(600, 383);

        Button addBookBtn = new Button("Add New Book");
        addBookBtn.setLayoutX(14);
        addBookBtn.setLayoutY(35);
        addBookBtn.setPrefSize(159, 47);

        // Event handler for Add New Book button
        addBookBtn.setOnAction(event -> {
            primaryStage.setScene(addBookScene);
        });

        Button processSalesBtn = new Button("Process Sales");
        processSalesBtn.setLayoutX(14);
        processSalesBtn.setLayoutY(272);
        processSalesBtn.setPrefSize(159, 47);

        // Event handler for Process Sales button
        processSalesBtn.setOnAction(event -> {
            primaryStage.setScene(processSalesScene);
        });

        Button manageInventoryBtn = new Button("Manage Inventory");
        manageInventoryBtn.setLayoutX(418);
        manageInventoryBtn.setLayoutY(35);
        manageInventoryBtn.setPrefSize(159, 47);

        // Event handler for Manage Inventory button
        manageInventoryBtn.setOnAction(event -> {
            primaryStage.setScene(manageInventoryScene);
        });

        Button customerManagementBtn = new Button("Customer Management");
        customerManagementBtn.setLayoutX(212);
        customerManagementBtn.setLayoutY(271);
        customerManagementBtn.setPrefSize(176, 47);

        // Event handler for Customer Management button
        customerManagementBtn.setOnAction(event -> {
            primaryStage.setScene(customerManagementScene);
        });

        Button exitBtn = new Button("Exit");
        exitBtn.setLayoutX(471);
        exitBtn.setLayoutY(271);
        exitBtn.setPrefSize(114, 47);

        // Event handler for Exit button
        exitBtn.setOnAction(event -> {
            primaryStage.close();
        });

        anchorPane.getChildren().addAll(addBookBtn, processSalesBtn, manageInventoryBtn, customerManagementBtn, exitBtn);
        root.getChildren().add(anchorPane);

        mainScene = new Scene(root);
        addBookScene = createAddBookScene();
        processSalesScene = createProcessSalesScene();
        manageInventoryScene = createManageInventoryScene();
        customerManagementScene = createCustomerManagementScene();

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Button Actions");
        primaryStage.show();
    }

    private Scene createAddBookScene() {
        try {
            Parent addBookRoot = FXMLLoader.load(getClass().getResource("Add New Book.fxml"));
            return new Scene(addBookRoot, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception according to your application's needs
        }
    }

    private Scene createProcessSalesScene() {
        try {
            Parent processSalesRoot = FXMLLoader.load(getClass().getResource("Sales.fxml"));
            return new Scene(processSalesRoot, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception according to your application's needs
        }
    }

    private Scene createManageInventoryScene() {
        try {
            Parent manageInventoryRoot = FXMLLoader.load(getClass().getResource("Manage Inventory.fxml"));
            return new Scene(manageInventoryRoot, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception according to your application's needs
        }
    }

    private Scene createCustomerManagementScene() {
        try {
            Parent customerManagementRoot = FXMLLoader.load(getClass().getResource("Customer Management.fxml"));
            return new Scene(customerManagementRoot, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception according to your application's needs
        }
    }

    public static void Main(String[] args) {
        launch(args);
    }
}
