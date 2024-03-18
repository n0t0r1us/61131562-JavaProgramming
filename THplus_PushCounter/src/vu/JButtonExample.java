package vu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonExample extends JFrame implements ActionListener {
    private JButton pushButton;
    private JLabel countLabel;
    private int count = 0;

    public JButtonExample() {
        setTitle("JButton Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JButton và đặt ActionListener
        pushButton = new JButton("Push Me!");
        pushButton.addActionListener(this);

        // Tạo JLabel để hiển thị số lần được nhấn
        countLabel = new JLabel("Count: 0");

        // Thêm các thành phần vào JFrame
        setLayout(new FlowLayout());
        add(pushButton);
        add(countLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pushButton) {
            // Tăng biến đếm và cập nhật nhãn
            count++;
            countLabel.setText("Count: " + count);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JButtonExample().setVisible(true);
            }
        });
    }
}
