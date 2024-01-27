import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class OutPut extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutPut frame = new OutPut();
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
	public OutPut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 89, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 165, 414, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Arrival Time :");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 64, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Shortest Path :");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 140, 117, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	void out(String from,String to) {
		graph g=new graph(from,to);
		String time=g.distance;
		if(time.equals("false")) {
			 textField.setEditable(false);
			  textField_1.setEditable(false);
			 textField.setText("unavailable");
		      textField_1.setText("");
		}
		else {
			Calendar cal=new GregorianCalendar();
			int minute=cal.get(Calendar.MINUTE);
			int hour=cal.get(Calendar.HOUR);

			int x=minute+Integer.parseInt(time);
			String clock;
			if(x>59) {
				int rem=x/60;
				x=x-60*rem;
				hour=(hour+rem)%12;
				clock=hour+":"+x;
			}
			else {
				clock=hour+":"+x;
			}
		String spt=clock;
		  textField.setEditable(false);
		  textField_1.setEditable(false);
		  textField.setText(spt);
	      textField_1.setText(g.str);}
		  
	  }
}
