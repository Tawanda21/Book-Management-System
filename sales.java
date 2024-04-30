import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class sales extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPrefSize(600, 295);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(600, 428);

        Label titleLabel = new Label("Book Title");
        titleLabel.setLayoutX(4);
        titleLabel.setLayoutY(7);
        titleLabel.setPrefSize(150, 34);
        titleLabel.setPadding(new Insets(20, 10, 10, 10));

        Label authorLabel = new Label("Author");
        authorLabel.setLayoutX(4);
        authorLabel.setLayoutY(63);
        authorLabel.setPrefSize(150, 34);
        authorLabel.setPadding(new Insets(20, 10, 10, 10));

        Label quantityLabel = new Label("Quantity");
        quantityLabel.setLayoutX(4);
        quantityLabel.setLayoutY(112);
        quantityLabel.setPrefSize(94, 34);
        quantityLabel.setPadding(new Insets(20, 10, 10, 10));

        Label priceLabel = new Label("Price");
        priceLabel.setLayoutX(14);
        priceLabel.setLayoutY(165);
        priceLabel.setPrefSize(94, 34);
        priceLabel.setPadding(new Insets(20, 10, 10, 10));

        Label subtotalLabel = new Label("Subtotal");
        subtotalLabel.setLayoutX(14);
        subtotalLabel.setLayoutY(213);
        subtotalLabel.setPrefSize(119, 34);
        subtotalLabel.setPadding(new Insets(20, 10, 10, 10));

        TextField titleField = new TextField();
        titleField.setLayoutX(154);
        titleField.setLayoutY(7);
        titleField.setPrefSize(215, 48);
        titleField.setPadding(new Insets(20, 10, 10, 10));

        TextField authorField = new TextField();
        authorField.setLayoutX(154);
        authorField.setLayoutY(63);
        authorField.setPrefSize(215, 30);
        authorField.setPadding(new Insets(20, 10, 10, 10));

        TextField quantityField = new TextField();
        quantityField.setLayoutX(154);
        quantityField.setLayoutY(112);
        quantityField.setPrefSize(127, 20);
        quantityField.setPadding(new Insets(20, 10, 10, 10));

        TextField priceField = new TextField();
        priceField.setLayoutX(154);
        priceField.setLayoutY(164);
        priceField.setPrefSize(87, 38);
        priceField.setPadding(new Insets(20, 10, 10, 10));

        TextField subtotalField = new TextField();
        subtotalField.setLayoutX(154);
        subtotalField.setLayoutY(212);
        subtotalField.setPrefSize(127, 38);
        subtotalField.setPadding(new Insets(20, 10, 10, 10));

        Button totalButton = new Button("Total");
        totalButton.setLayoutX(446);
        totalButton.setLayoutY(207);
        totalButton.setPrefSize(139, 48);
        totalButton.setPadding(new Insets(5));
        totalButton.setFont(Font.font("Roboto", 24));

        // Event handler for Total button
        totalButton.setOnAction(event -> {
            try {
                int quantity = Integer.parseInt(quantityField.getText());
                double price = Double.parseDouble(priceField.getText());
                double subtotal = quantity * price;
                subtotalField.setText(String.format("%.2f", subtotal));
            } catch (NumberFormatException e) {
                subtotalField.setText("Invalid input");
            }
        });

        anchorPane.getChildren().addAll(titleLabel, authorLabel, quantityLabel, priceLabel, subtotalLabel,
                titleField, authorField, quantityField, priceField, subtotalField, totalButton);
        root.getChildren().add(anchorPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Book Order Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
