import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JButton btnTru;
	private JButton btnNhan;
	private JButton btnChia;
	private JLabel lblKtQuTnh;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(45, 52, 156, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(45, 110, 156, 20);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(211, 48, 400, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(211, 106, 400, 33);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Cộng ở đây
				//Viết lệnh ở 1 thủ tục/hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setBounds(135, 190, 91, 42);
		contentPane.add(btnCong);
		
		btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Trừ ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(255, 190, 91, 42);
		contentPane.add(btnTru);
		
		btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(385, 190, 91, 42);
		contentPane.add(btnNhan);
		
		btnChia = new JButton("CHIA ");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(520, 190, 91, 42);
		contentPane.add(btnChia);
		
		lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(45, 291, 156, 20);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(211, 278, 400, 33);
		contentPane.add(txtKetQua);
	}//Hết hàm tạo
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA+soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText( String.valueOf(tong)  );
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//Chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tính toán
				double hieu = soA-soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText( String.valueOf(hieu)  );
		
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//Chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tính toán
				double tich = soA*soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText( String.valueOf(tich)  );
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//Chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				if (soB != 0) {
				//Tính toán
				double thuong = soA/soB;
				//Đưa ra hiển thị lên điều khiển
				txtKetQua.setText( String.valueOf(thuong)  );
	} else {
		txtKetQua.setText("Không chia được cho 0");
	}
}
}
