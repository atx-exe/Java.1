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

    public void btMap(ActionEvent actionEvent) {
        bt00.setText(bt00.getId());
//        bt01.setBackground(Color.AQUA);
        bt01.setText(bt01.getId());
    }
}
