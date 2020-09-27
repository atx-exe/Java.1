package L8.Lesson.P2;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.*;

public class Controller {
    public TextArea mainTextArea;

    public void clickOnExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void clickNew(ActionEvent actionEvent) {
        mainTextArea.clear();
    }

    public void clickLoad(ActionEvent actionEvent) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("1.txt"))) {
            String s;
            mainTextArea.clear();
            while ((s = br.readLine()) != null) {
                mainTextArea.appendText(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickSave(ActionEvent actionEvent) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("2.txt"))) {
            bw.write(mainTextArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
