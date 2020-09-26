package L8.Lesson.p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindows extends JFrame {
    public MyWindows() {
        setTitle("MyWindow");                                       //Заголовококна
        setBounds(600, 300, 400, 500);          //Расположение и размер окна
        setLocationRelativeTo(null);                                //Расположить по центру экрана
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Выгрузить из памяти при закрытии окна
        setResizable(true);                                        //Запрещение растягивать форму

        setLayout(new FlowLayout());
        JTextField jTextField = new JTextField(20);
        add(jTextField);
        JButton jbSend = new JButton("Send");
        add(jbSend);

        jbSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jTextField.getText());
                jTextField.setText(null);
            }
        });

        setVisible(true);                                           //Сделать видимым (так как по умолчанию его не видно)
    }
}
