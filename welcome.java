import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;


public class welcome extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}		
		});
	}
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel ;
	int i;
	/**
	 * Create the frame.
	 */
	 welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 628);
		contentPane = new JPanel();
		i=0;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnNewButton = new JButton("Start");
		
		btnNewButton.addActionListener(	e ->{
			djiksthra frame =new djiksthra();
			
			frame.setVisible(true);
			dispose();
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.setBounds(423, 477, 89, 23);
		contentPane.add(btnNewButton);
		
		
		 lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abbur\\Downloads\\Screenshot 2021-11-16 113542.png"));
		lblNewLabel.setBounds(56, -22, 883, 611);
		contentPane.add(lblNewLabel);
	}
	}

