package calculator;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFreamTest extends JFrame {
	public void CreateJFrame(String title) { // ����һ��CreateJFrame()����
		JFrame jf = new JFrame(title); // ����һ��JFrame����
		Container container = jf.getContentPane(); // ��ȡһ������
		JLabel jl = new JLabel("����һ��JFrame����"); // ����һ��JLabel��ǩ
		// ʹ��ǩ�ϵ����־���
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl); // ����ǩ��ӵ�������
		container.setBackground(Color.white); // ���������ı�����ɫ
		jf.setVisible(true); // ʹ�������
		jf.setSize(200, 150); // ���ô����С
		// ���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) { // ���������е���CreateJFrame()����
		new JFreamTest().CreateJFrame("����һ��JFrame����");
	}
}
