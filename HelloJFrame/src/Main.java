import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame(); //Tạo 1 obj của class
		f.setTitle("Vi du JFrame"); //Tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); //Kích thước cửa sổ
		//Quy đỉnh loại bố cục (Layout)
		f.setLayout(new FlowLayout());
		//Tạo 1 nút bấm
		JButton btnOK = new JButton("Click me!");
		//Tạo tai nghe
		BoLangNgheOK ok = new BoLangNgheOK();
		btnOK.addActionListener(ok);
		JButton btnK = new JButton("Click me bitch!");
		//gắn lên form
		f.add(btnOK);
		
		f.add(btnK);// overwrite
		// Hiện form
		f.show(); //Hiện cửa sổ
	}
	//Tạo bộ lắng nghe (hữu danh) và xử lý cho nút OK
	private static class BoLangNgheOK implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// mã xử lý khi user click chuột ở đây
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó");
			dialog.setSize(220,120);
			dialog.show();
		}
		
	}

}
