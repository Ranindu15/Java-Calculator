package myCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class Mycal {

	private JFrame frame;
	private JTextField num1;
	private JEditorPane editorPane;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mycal window = new Mycal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mycal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 755, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(null);
				Action.setText("add");
			}
		});
		
		num2 = new JTextField();
		num2.setBorder(null);
		num2.setFont(new Font("Dialog", Font.PLAIN, 30));
		num2.setHorizontalAlignment(SwingConstants.RIGHT);
		num2.setBounds(30, 92, 327, 85);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		num1 = new JTextField();
		num1.setFont(new Font("Dialog", Font.PLAIN, 20));
		num1.setHorizontalAlignment(SwingConstants.RIGHT);
		num1.setBorder(null);
		num1.setBounds(138, 35, 219, 57);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		btnNewButton.setBounds(30, 212, 125, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+1);
			}
		});
		button_3.setFont(new Font("Dialog", Font.BOLD, 25));
		button_3.setBounds(424, 35, 71, 45);
		frame.getContentPane().add(button_3);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(null);
				Action.setText("neg");
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton_1.setBounds(232, 212, 125, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(null);
				Action.setText("mult");
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 30));
		button_1.setBounds(29, 304, 125, 57);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(null);
				Action.setText("div");
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 30));
		button_2.setBounds(232, 304, 125, 57);
		frame.getContentPane().add(button_2);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+2);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 25));
		button.setBounds(543, 35, 71, 45);
		frame.getContentPane().add(button);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+3);
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 25));
		button_4.setBounds(656, 35, 71, 45);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+6);
			}
		});
		button_5.setFont(new Font("Dialog", Font.BOLD, 25));
		button_5.setBounds(656, 118, 71, 45);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+5);
			}
		});
		button_6.setFont(new Font("Dialog", Font.BOLD, 25));
		button_6.setBounds(543, 118, 71, 45);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+4);
			}
		});
		button_7.setFont(new Font("Dialog", Font.BOLD, 25));
		button_7.setBounds(424, 118, 71, 45);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+9);
			}
		});
		button_8.setFont(new Font("Dialog", Font.BOLD, 25));
		button_8.setBounds(656, 201, 71, 45);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+8);
			}
		});
		button_9.setFont(new Font("Dialog", Font.BOLD, 25));
		button_9.setBounds(543, 201, 71, 45);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("7");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+7);
			}
			
		});
		button_10.setFont(new Font("Dialog", Font.BOLD, 25));
		button_10.setBounds(424, 201, 71, 45);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one = Double.parseDouble(num1.getText());
				double two = Double.parseDouble(num2.getText());
				if(Action.getText().equals("add")) {
					num2.setText(String.valueOf(one+two));
				}
				else if(Action.getText().equals("neg")) {
					num2.setText(String.valueOf(one-two));
				}
				else if(Action.getText().equals("mult")) {
					num2.setText(String.valueOf(one*two));
				}
				else if(Action.getText().equals("div")) {
					num2.setText(String.valueOf(one/two));
				}
				
				
				
			}
		});
		button_11.setFont(new Font("Dialog", Font.BOLD, 25));
		button_11.setBounds(656, 291, 71, 45);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(num2.getText()+0);
			}
		});
		button_12.setFont(new Font("Dialog", Font.BOLD, 25));
		button_12.setBounds(543, 291, 71, 45);
		frame.getContentPane().add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(null);
				num2.setText(null);
				Action.setText(null);
				
			}
		});
		btnC.setFont(new Font("Dialog", Font.BOLD, 25));
		btnC.setBounds(424, 291, 71, 45);
		frame.getContentPane().add(btnC);
		
		editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(24, 28, 338, 156);
		frame.getContentPane().add(editorPane);
		
		Action = new JLabel("");
		Action.setBounds(30, 408, 93, 29);
		frame.getContentPane().add(Action);
	}
	private JLabel Action;
}
