import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class addbook extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPrefSize(600, 400);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(600, 404);

        TextField titleField = new TextField();
        titleField.setPromptText("Book Title");
        titleField.setLayoutX(14);
        titleField.setLayoutY(41);
        titleField.setPrefSize(572, 55);
        titleField.setPadding(new Insets(20, 100, 0, 10));

        TextField authorField = new TextField();
        authorField.setPromptText("Book Author");
        authorField.setLayoutX(14);
        authorField.setLayoutY(181);
        authorField.setPrefSize(572, 55);
        authorField.setPadding(new Insets(20, 100, 0, 10));

        TextField idField = new TextField();
        idField.setPromptText("Book ID");
        idField.setLayoutX(14);
        idField.setLayoutY(109);
        idField.setPrefSize(572, 55);
        idField.setPadding(new Insets(20, 100, 0, 10));

        TextField publisherField = new TextField();
        publisherField.setPromptText("Publisher");
        publisherField.setLayoutX(14);
        publisherField.setLayoutY(246);
        publisherField.setPrefSize(572, 55);
        publisherField.setPadding(new Insets(20, 100, 0, 10));

        Button addButton = new Button("Add Book");
        addButton.setLayoutX(14);
        addButton.setLayoutY(323);
        addButton.setPrefSize(154, 55);

        // Event handler for the Add Book button
        addButton.setOnAction(event -> {
            String title = titleField.getText();
            String author = authorField.getText();
            String id = idField.getText();
            String publisher = publisherField.getText();

            // Here you can add the book to your data structure or perform any desired action
            System.out.println("Added Book: " + title + " by " + author + ", ID: " + id + ", Publisher: " + publisher);
        });

        Button cancelButton = new Button("Cancel");
        cancelButton.setLayoutX(451);
        cancelButton.setLayoutY(323);
        cancelButton.setPrefSize(127, 55);

        // Event handler for the Cancel button
        cancelButton.setOnAction(event -> {
            // Here you can close the application or perform any other desired action
            primaryStage.close();
        });

        anchorPane.getChildren().addAll(titleField, authorField, idField, publisherField, addButton, cancelButton);
        root.getChildren().add(anchorPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Book Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
