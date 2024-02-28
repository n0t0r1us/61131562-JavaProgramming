package vu.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;



	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số A: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 43, 107, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số B: ");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(41, 74, 107, 20);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số C: ");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(41, 105, 107, 20);
		contentPane.add(lblNhpSC);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(139, 43, 303, 22);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(139, 76, 303, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(139, 105, 303, 20);
		contentPane.add(txtC);
		
		JLabel lblKtQu = new JLabel("Kết quả: ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(41, 169, 88, 30);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(139, 169, 303, 35);
		contentPane.add(txtKQ);
		
		JButton btnNewButton = new JButton("GIẢI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamGiaiPT();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(201, 251, 97, 42);
		contentPane.add(btnNewButton);
	}
	void HamGiaiPT() {
		try {
			double a=Double.parseDouble(txtA.getText());
			double b=Double.parseDouble(txtB.getText());
			double c=Double.parseDouble(txtC.getText());
			double delta=b*b-4*a*c;
			double x1,x2;
			//tính nghiệm
			if(delta>0)
			{
				x1=(double)((-b+Math.sqrt(delta))/(2*a));
				x2=(double)((-b+Math.sqrt(delta))/(2*a));
				txtKQ.setText("x1= " + x1 + " và x2= "+ x2 );
			}
			else if (delta==0) {
				x1=(-b/(2*a));
				txtKQ.setText("x1=x2"+x1);
			}
			else {
				txtKQ.setText("Phương trình vô nghiệm");
			}
		} catch (Exception e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Input không hợp lệ");
		}
	}

}
