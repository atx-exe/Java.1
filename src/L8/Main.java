package L8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
        primaryStage.setTitle("XO Game");
        primaryStage.setResizable(false);
        primaryStage.setHeight(400);
        primaryStage.setWidth(300);
        primaryStage.setScene(new Scene(game));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
