package L8.Exam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Stage primaryStage;

    public static void pvpc() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent gameMenu = FXMLLoader.load(getClass().getResource("gameMenu.fxml"));
        primaryStage.setScene(new Scene(gameMenu));

        primaryStage.setTitle("XO Game");
        primaryStage.setResizable(false);
        primaryStage.setHeight(400);
        primaryStage.setWidth(300);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
