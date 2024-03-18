package vu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptions extends JFrame implements ItemListener {
    private JCheckBox boldCheckBox, italicCheckBox;
    private JLabel textLabel;

    public StyleOptions() {
        setTitle("Checkbox Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo các JCheckBox
        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");

        // Đặt ItemListener cho các JCheckBox
        boldCheckBox.addItemListener(this);
        italicCheckBox.addItemListener(this);

        // Tạo JLabel để hiển thị văn bản
        textLabel = new JLabel("Say it with style!");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // Thêm các thành phần vào JFrame
        setLayout(new FlowLayout());
        add(boldCheckBox);
        add(italicCheckBox);
        add(textLabel);
    }

    public void itemStateChanged(ItemEvent e) {
        int style = Font.PLAIN;

        if (boldCheckBox.isSelected()) {
            style |= Font.BOLD;
        }
        if (italicCheckBox.isSelected()) {
            style |= Font.ITALIC;
        }

        // Cập nhật phong cách của văn bản
        textLabel.setFont(new Font("Arial", style, 14));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StyleOptions().setVisible(true);
            }
        });
    }
}

