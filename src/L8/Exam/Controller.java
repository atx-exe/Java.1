package L8.Exam;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {
    public Label jlbMenu;
    public GridPane gpMap;
    public Button bt00;
    public Button bt01;
    public Button bt02;
    public Button bt10;
    public Button bt11;
    public Button bt12;
    public Button bt20;
    public Button bt21;
    public Button bt22;

    public void onActPvP(ActionEvent actionEvent) {
        jlbMenu.setText("Set PvP");
        new Game(Player.Human, Player.Human);
    }

    public void onActPvPC(ActionEvent actionEvent) {
        jlbMenu.setText("Set PvPC");
        new Game(Player.Human, Player.PC);
    }

    public void onActPCvPC(ActionEvent actionEvent) {
        jlbMenu.setText("Set PCvPC");
        new Game(Player.PC, Player.PC);
    }

    public void bt00(ActionEvent actionEvent) {
        bt00.setText("X");
        bt00.setDisable(true);
    }

    public void bt01(ActionEvent actionEvent) {
        bt01.setText("X");
        bt01.setDisable(true);
    }
    public void bt02(ActionEvent actionEvent) {
        bt02.setText("X");
        bt02.setDisable(true);
    }
    public void bt10(ActionEvent actionEvent) {
        bt10.setText("X");
        bt10.setDisable(true);
    }
    public void bt11(ActionEvent actionEvent) {
        bt11.setText("X");
        bt11.setDisable(true);
    }
    public void bt12(ActionEvent actionEvent) {
        bt12.setText("X");
        bt12.setDisable(true);
    }
    public void bt20(ActionEvent actionEvent) {
        bt20.setText("X");
        bt20.setDisable(true);
    }
    public void bt21(ActionEvent actionEvent) {
        bt21.setText("X");
        bt21.setDisable(true);
    }
    public void bt22(ActionEvent actionEvent) {
        bt22.setText("X");
        bt22.setDisable(true);
    }
}
