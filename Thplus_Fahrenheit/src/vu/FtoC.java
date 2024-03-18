package vu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FtoC extends JFrame implements ActionListener {
    private JTextField fahrenheitField;
    private JLabel celsiusLabel;

    public FtoC() {
        setTitle("Fahrenheit to Celsius Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JTextField để nhập độ Fahrenheit
        fahrenheitField = new JTextField(10);

        // Tạo JLabel để hiển thị kết quả độ Celsius
        celsiusLabel = new JLabel("Celsius: ");

        // Tạo JButton để thực hiện chuyển đổi
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        // Thêm các thành phần vào JFrame
        setLayout(new FlowLayout());
        add(new JLabel("Fahrenheit: "));
        add(fahrenheitField);
        add(convertButton);
        add(celsiusLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Convert")) {
            // Lấy giá trị từ JTextField
            String input = fahrenheitField.getText();
            try {
                // Chuyển đổi từ độ Fahrenheit sang độ Celsius
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                // Hiển thị kết quả
                celsiusLabel.setText("Celsius: " + String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                // Xử lý nếu người dùng nhập không phải là số
                celsiusLabel.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FtoC().setVisible(true);
            }
        });
    }
}

