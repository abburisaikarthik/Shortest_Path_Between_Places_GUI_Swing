import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.*;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class djiksthra extends JFrame {

	private JPanel clock;
	private JLabel clock_label;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					djiksthra frame = new djiksthra();
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
	public void clock() {
		Thread clock =new Thread()
				{
			public void run() {
			
		while(true) {
		Calendar cal=new GregorianCalendar();
		
		int second=cal.get(Calendar.SECOND);
		int minute=cal.get(Calendar.MINUTE);
		int hour=cal.get(Calendar.HOUR);

		clock_label.setText("Time: "+hour+":"+minute+":"+second);}
			}};
			clock.start();
	}
	public djiksthra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 335);
		clock = new JPanel();
		clock.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(clock);
		clock.setLayout(null);
		
		 clock_label = new JLabel("clock");
		clock_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		clock_label.setBounds(254, 40, 170, 35);
		clock.add(clock_label);
		
		JLabel lblNewLabel = new JLabel("DSA PROJECT");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(146, 11, 139, 24);
		clock.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setBounds(129, 101, 124, 24);
		clock.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setBounds(129, 145, 124, 24);
		clock.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From   : ");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(25, 101, 94, 24);
		clock.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("To       :");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(25, 140, 76, 24);
		clock.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String from =textField.getText();
				String to =textField_1.getText();
				
				

				OutPut frame=new OutPut();
				frame.setVisible(true);
				dispose();
				from=from.toUpperCase();
				to=to.toUpperCase();
				to=to.replaceAll(" ", "");
				from=from.replaceAll(" ", "");
//				System.out.println(to);
//				System.out.println(from);
				frame.out(to, from);

			}
		});
		btnNewButton.setBounds(153, 249, 89, 23);
		clock.add(btnNewButton);
		clock();
	}
}
