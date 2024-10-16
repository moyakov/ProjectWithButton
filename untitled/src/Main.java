import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextFieldExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());


        JTextField textField = new JTextField(20);


        JButton hideButton = new JButton("Скрыть");
        JButton showButton = new JButton("Показать");
        JButton clearButton = new JButton("Очистить");


        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(false);
            }
        });


        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setVisible(true);
            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });


        frame.add(textField);
        frame.add(hideButton);
        frame.add(showButton);
        frame.add(clearButton);


        frame.setVisible(true);
    }
}
