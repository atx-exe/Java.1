package L8.Lesson.p2;

import javax.swing.*;

public class MyForm extends JFrame{
    private JRadioButton radioButton1;
    private JTree tree1;
    private JList list1;
    private JRadioButton radioButton2;
    private JSlider slider1;
    private JScrollBar scrollBar1;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JTextPane textPane3;

    public MyForm() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Выгрузить из памяти при закрытии окна


        setVisible(true);                                           //Сделать видимым (так как по умолчанию его не видно)
    }
}
