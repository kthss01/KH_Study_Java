package ncs.test7;

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

public class ScoreFrame extends JFrame {

	private JTextField javaScore, sqlScore;
	private JTextField total, average;
	private JButton calcBtn;

	public ScoreFrame() {
		setTitle("문제 7");

		setBounds(300, 300, 500, 500);
		getContentPane().setLayout(new BorderLayout());

		// 위에 라벨 처리
		JLabel lblText = new JLabel("점수를 입력하세요");
		lblText.setFont(new Font("맑은 고딕", Font.PLAIN, 42));
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblText, BorderLayout.NORTH);

		// 가운데 패널 처리
		JPanel panel = new JPanel();
		panel.setLayout(null); // null Layout 설정
		panel.setPreferredSize(new Dimension(500, 400));
		getContentPane().add(panel, BorderLayout.CENTER);

		// 버튼 및 라벨, 텍스트 필드의 크기 조정 변수
		int x = 30;
		int y = 30;
		int width = 40;
		int height = 30;

		// 자바
		JLabel lblJava = new JLabel("자바: ");
		javaScore = new JTextField();

		lblJava.setBounds(x, y, width, height);

		x = x + lblJava.getWidth();
		width = 150;

		javaScore.setBounds(x, y, width, height);

		// javaScore 클릭 처리
		javaScore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				javaScore.setText(""); // 클릭시 지워줌
			}
		});

		panel.add(lblJava);
		panel.add(javaScore);

		// sql
		JLabel lblSql = new JLabel("SQL: ");
		sqlScore = new JTextField();

		// sqlScore 클릭 처리
		sqlScore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sqlScore.setText("");
			}
		});

		x = x + javaScore.getWidth() + 50;

		lblSql.setBounds(x, y, width, height);

		x = x + lblJava.getWidth();
		width = javaScore.getWidth();

		sqlScore.setBounds(x, y, width, height);

		panel.add(lblSql);
		panel.add(sqlScore);

		// 계산하기 버튼
		calcBtn = new JButton("계산하기");
		calcBtn.addActionListener(new ActionListener() {

			// 버튼 눌렀을 시 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				int java = Integer.parseInt(javaScore.getText());
				int sql = Integer.parseInt(sqlScore.getText());

				int sum = java + sql;
				int avg = sum / 2;

				total.setText(String.valueOf(sum));
				average.setText(String.valueOf(avg));
			}
		});

		x = 200;
		y = 150;
		width = 100;
		height = 30;

		calcBtn.setBounds(x, y, width, height);

		panel.add(calcBtn);

		// 총점
		JLabel lblTotal = new JLabel("총점: ");
		total = new JTextField();

		x = lblJava.getX();
		y = calcBtn.getY() + (calcBtn.getY() + calcBtn.getHeight() - (lblJava.getY() + lblJava.getHeight()));
//		System.out.println("y : " + y); // test
		width = lblJava.getWidth();
		height = lblJava.getHeight();

		lblTotal.setBounds(x, y, width, height);

		x = x + lblJava.getWidth();
		width = 150;

		total.setBounds(x, y, width, height);

		panel.add(lblTotal);
		panel.add(total);

		// 평균
		JLabel lblAvg = new JLabel("평균: ");
		average = new JTextField();

		x = x + javaScore.getWidth() + 50;

		lblAvg.setBounds(x, y, width, height);

		x = x + lblJava.getWidth();
		width = javaScore.getWidth();

		average.setBounds(x, y, width, height);

		panel.add(lblAvg);
		panel.add(average);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
