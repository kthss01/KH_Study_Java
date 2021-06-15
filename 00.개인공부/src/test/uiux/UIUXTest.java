package test.uiux;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UIUXTest extends JFrame {

	
	
	public UIUXTest() {
		setTitle("문제 7");
		setLayout(new BorderLayout());
		setBounds(0, 0, 500, 500);
		
		JLabel label = new JLabel("점수를 입력하세요");
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 48));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(500, 400));
		add(panel, BorderLayout.CENTER);
		
		JLabel lblJava = new JLabel("자바: ");
		JTextField txtJava = new JTextField();
		lblJava.setBounds(30, 30, 50, 30);
		txtJava.setBounds(70, 30, 130, 30);
		panel.add(lblJava);
		panel.add(txtJava);
		txtJava.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtJava.setText("");
			}
		});
	
		JLabel lblSQL = new JLabel("SQL: ");
		JTextField txtSQL = new JTextField();
		lblSQL.setBounds(250, 30, 50, 30);
		txtSQL.setBounds(300, 30, 130, 30);
		panel.add(lblSQL);
		panel.add(txtSQL);
		txtSQL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtJava.setText("");
			}
		});
		
		JButton btnCompute = new JButton("계산하기");
		btnCompute.setBounds(200, 175, 100, 50);
		panel.add(btnCompute);
		
		JLabel lblSum = new JLabel("총점: ");
		JTextField txtSum = new JTextField();
		lblSum.setBounds(30, 315, 50, 30);
		txtSum.setBounds(70, 315, 130, 30);
		panel.add(lblSum);
		panel.add(txtSum);
		
		JLabel lblAvg = new JLabel("평균: ");
		JTextField txtAvg = new JTextField();
		lblAvg.setBounds(250, 315, 50, 30);
		txtAvg.setBounds(300, 315, 130, 30);
		panel.add(lblAvg);
		panel.add(txtAvg);
		
		btnCompute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int javaScore = Integer.parseInt(txtJava.getText());
				int sqlScore = Integer.parseInt(txtSQL.getText());
				
				int sum = javaScore + sqlScore;
				double avg = sum / 2;
				
				txtSum.setText(String.valueOf(sum));
				txtAvg.setText(String.format("%.1f", avg));
			}
			
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		UIUXTest test = new UIUXTest();
		
	}
	
}
