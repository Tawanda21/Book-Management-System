import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class manageinventory extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPrefSize(601, 399);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(590, 398);

        TableView<Object> tableView = new TableView<>();
        tableView.setLayoutX(-1);
        tableView.setLayoutY(-1);
        tableView.setPrefSize(601.6, 398.4);

        TableColumn<Object, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setPrefWidth(168);

        TableColumn<Object, String> authorColumn = new TableColumn<>("Author");
        authorColumn.setPrefWidth(158.4);

        TableColumn<Object, String> genreColumn = new TableColumn<>("Genre");
        genreColumn.setPrefWidth(89.6);

        TableColumn<Object, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setPrefWidth(100.8);

        TableColumn<Object, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setPrefWidth(86.4);

        anchorPane.getChildren().add(tableView);
        root.getChildren().add(anchorPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Book Table");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

