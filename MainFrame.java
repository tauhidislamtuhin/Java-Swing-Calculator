import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		double t =0;
		double t1 = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 175, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDisplay = new JLabel("");
		lblDisplay.setOpaque(true);
		lblDisplay.setBounds(new Rectangle(10, 10, 5, 5));
		lblDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDisplay.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblDisplay.setBackground(new Color(255, 255, 255));
		lblDisplay.setBounds(22, 11, 385, 52);
		contentPane.add(lblDisplay);
		
		JButton btnpersent = new JButton("%");
		btnpersent.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnpersent.setBounds(22, 110, 89, 52);
		contentPane.add(btnpersent);
		
		JButton btnCE = new JButton("C");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCE.setBounds(121, 110, 89, 52);
		contentPane.add(btnCE);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(220, 110, 89, 52);
		contentPane.add(btnX);
		
		JButton btnSum = new JButton("+");
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSum.setBounds(318, 110, 89, 52);
		contentPane.add(btnSum);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSub.setBounds(318, 190, 89, 52);
		contentPane.add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setBounds(220, 190, 89, 52);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setBounds(121, 190, 89, 52);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(22, 190, 89, 52);
		contentPane.add(btn7);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMult.setBounds(318, 273, 89, 52);
		contentPane.add(btnMult);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setBounds(220, 273, 89, 52);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setBounds(121, 273, 89, 52);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setBounds(22, 273, 89, 52);
		contentPane.add(btn4);
		
		JButton btndiv = new JButton("/");
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btndiv.setBounds(318, 361, 89, 52);
		contentPane.add(btndiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setBounds(220, 361, 89, 52);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      lblDisplay.setText(lblDisplay.getText()+2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setBounds(121, 361, 89, 52);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setBounds(22, 361, 89, 52);
		contentPane.add(btn1);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEqual.setBounds(219, 431, 188, 52);
		contentPane.add(btnEqual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+0);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn0.setBounds(22, 431, 89, 52);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(lblDisplay.getText()+".");
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDot.setBounds(121, 431, 89, 52);
		contentPane.add(btnDot);
	}
}
