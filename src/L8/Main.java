package L8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
        Parent info = FXMLLoader.load(getClass().getResource("info.fxml"));
        primaryStage.setTitle("XO Game");
        primaryStage.setResizable(false);
        primaryStage.setHeight(400);
        primaryStage.setWidth(300);
        primaryStage.setScene(new Scene(menu));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
