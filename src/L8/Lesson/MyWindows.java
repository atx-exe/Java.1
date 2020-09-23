package L8.Lesson;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindows extends JFrame {
    public MyWindows() {
        setTitle("MyWindow");                                       //Заголовококна
        setBounds(600, 300, 400, 500);          //Расположение и размер окна
        setLocationRelativeTo(null);                                //Расположить по центру экрана
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Выгрузить из памяти при закрытии окна
        setResizable(false);                                        //Запрещение растягивать форму

        setLayout(new GridLayout(1, 2)); //Layout с сеткой из 2х столбцов
        JPanel jpLeft = new JPanel(); //Создание панели для в левой (первой) ячейки
        add(jpLeft); //Добавление ее в левую (первую) ячейку
        jpLeft.setBackground(Color.LIGHT_GRAY); //Установка цвета
        jpLeft.setBorder(new LineBorder(Color.black, 2)); //Установка Цвета и размера border
        jpLeft.setLayout(new BoxLayout(jpLeft, BoxLayout.Y_AXIS)); //Устанавливаем BoxLayout, привязываем к jpLeft, выбираем вертикальный

        JButton jbt1 = new JButton("Button #1");   //Создадим кнопку
        jpLeft.add(jbt1);                               //Поместим на левую панель
        JButton jbt2 = new JButton("Button #2");
        jpLeft.add(jbt2);
        JButton jbt3 = new JButton("Button #3");
        jpLeft.add(jbt3);

        JPanel jpRight = new JPanel(); //Создание панели для в правой (второй) ячейки
        add(jpRight); //Добавление ее в правую (вторую) ячейку
        jpRight.setLayout(new CardLayout());

        PaintPanel jpRed = new PaintPanel();
        jpRed.setBackground(Color.RED);

        JPanel jpGreen = new JPanel();
        jpGreen.setBackground(Color.GREEN);

        JPanel jpBlue = new JPanel();
        jpBlue.setBackground(Color.BLUE);

        jpRight.add(jpRed, "RED");
        jpRight.add(jpGreen, "GREEN");
        jpRight.add(jpBlue,"BLUE");

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpRight.getLayout()).show(jpRight, "RED");
                System.out.println("Show jpRED Panel");
            }
        });

        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpRight.getLayout()).show(jpRight, "GREEN");
                System.out.println("Show jpGREEN Panel");
            }
        });

        jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)jpRight.getLayout()).show(jpRight,"BLUE");
                System.out.println("Show jpBLUE Panel");
            }
        });

//        //Компановщик BorderLayout - По сторонам света
//        JButton center = new JButton("Button on CENTER");
//        add(center, BorderLayout.CENTER);
//        JButton north = new JButton("Button on NORTH");
//        add(north, BorderLayout.NORTH);
//        JButton south = new JButton("Button on SOUTH");
//        add(south, BorderLayout.SOUTH);
//        JButton east = new JButton("Button on EAST");
//        add(east, BorderLayout.EAST);
//        JButton west = new JButton("Button on WEST");
//        add(west, BorderLayout.WEST);
//        west.setPreferredSize(new Dimension(100,100)); //Желаемый размер

//        //Компановщик FlowLayout - Подряд
//        setLayout(new FlowLayout());
//        JButton button1 = new JButton("Button 1");
//        add(button1);
//        JButton button2 = new JButton("Button 2");
//        add(button2);
//        JButton button3 = new JButton("Button 3");
//        add(button3);
//        JButton button4 = new JButton("Button 4");
//        add(button4);
//        JButton button5 = new JButton("Button 5");
//        add(button5);

//        //Компановщик GridBagLayout - Сетка с разными ячейками, можно занимать по несколько ячеек
//        setLayout(new GridBagLayout());
//        JButton button1 = new JButton("Button 1");
//        add(button1,0,0);
//        JButton button2 = new JButton("Button 2");
//        add(button2,1,2);
//        JButton button3 = new JButton("Button 3");
//        add(button3,2,3);
//        JButton button4 = new JButton("Button 4");
//        add(button4,2,4);
//        JButton button5 = new JButton("Button 5");
//        add(button5,3,5);

//        //Компановщик BoxLayout - По вертикали или горизонтали
//        setLayout(new BoxLayout());
//        JButton button1 = new JButton("Button 1");
//        add(button1);
//        JButton button2 = new JButton("Button 2");
//        add(button2);
//        JButton button3 = new JButton("Button 3");
//        add(button3);
//        JButton button4 = new JButton("Button 4");
//        add(button4);
//        JButton button5 = new JButton("Button 5");
//        add(button5);

//        //Компановщик SpringLayout - Относительный
//        setLayout(new SpringLayout());
//        JButton button1 = new JButton("Button 1");
//        add(button1);
//        JButton button2 = new JButton("Button 2");
//        add(button2);
//        JButton button3 = new JButton("Button 3");
//        add(button3);
//        JButton button4 = new JButton("Button 4");
//        add(button4);
//        JButton button5 = new JButton("Button 5");
//        add(button5);

//        //Компановщик CardLayout - Вкладки
//        setLayout(new CardLayout());
//        JButton button1 = new JButton("Button 1");
//        add(button1);
//        JButton button2 = new JButton("Button 2");
//        add(button2);
//        JButton button3 = new JButton("Button 3");
//        add(button3);
//        JButton button4 = new JButton("Button 4");
//        add(button4);
//        JButton button5 = new JButton("Button 5");
//        add(button5);

//        //null - без компановщика
//        setLayout(null);
//        JButton button1 = new JButton("Button 1");
//        button1.setBounds(10,10,200,40);
//        add(button1);
//        JButton button2 = new JButton("Button 2");
//        button2.setBounds(10,60,200,40);
//        add(button2);
//        JButton button3 = new JButton("Button 3");
//        button3.setBounds(20,110,190,40);
//        add(button3);
//        JButton button4 = new JButton("Button 4");
//        button4.setBounds(10,160,80,40);
//        add(button4);
//        JButton button5 = new JButton("Button 5");
//        button5.setBounds(110,160,80,40);
//        add(button5);

        setVisible(true);                                           //Сделать видимым (так как по умолчанию его не видно)
    }
}
