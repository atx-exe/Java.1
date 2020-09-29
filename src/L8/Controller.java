package L8;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label jlbMenu;

    public void onActPvP(ActionEvent actionEvent) {
        jlbMenu.setText("Set PvP");
    }

    public void onActPvPC(ActionEvent actionEvent) {
        jlbMenu.setText("Set PvPC");
    }

    public void onActPCvPC(ActionEvent actionEvent) {
        jlbMenu.setText("Set PCvPC");
    }
}
