package parv_7638_SEproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {
public static int flagg=0;
	private JFrame frame;
	private JButton btnStartShift;
	private JButton btnEndShift;
	private JButton btnStartLunch;
	private JButton btnEndLunch;
	private JButton btnLogout;
	private JButton btnSeeWorkers;

	/**
	 * Launch the main application.
	 */
	public static void WelcomeScreen(int a) {
		flagg=a;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		setUpComponents();
		eventHandling();
	}
	public void setUpComponents()
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(234, 31, 160, 60);
		frame.getContentPane().add(lblNewLabel);
		
		btnStartShift = new JButton("Start Shift");
		btnStartShift.setBounds(83, 153, 128, 23);
		frame.getContentPane().add(btnStartShift);
		
		btnEndShift = new JButton("End Shift");
		btnEndShift.setBounds(373, 153, 128, 23);
		frame.getContentPane().add(btnEndShift);
		
		btnStartLunch = new JButton("Start Shift");
		btnStartLunch.setBounds(83, 227, 128, 23);
		frame.getContentPane().add(btnStartLunch);
		
		btnEndLunch = new JButton("End Shift");
		btnEndLunch.setBounds(373, 227, 128, 23);
		frame.getContentPane().add(btnEndLunch);
		
		btnLogout = new JButton("Logout");
		
		btnLogout.setBounds(373, 337, 89, 23);
		frame.getContentPane().add(btnLogout);
		
		btnSeeWorkers = new JButton("Worker Details");
		btnSeeWorkers.setEnabled(false);
		btnSeeWorkers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeeWorkers.setBounds(83, 337, 160, 23);
		frame.getContentPane().add(btnSeeWorkers);
		if(flagg==1)
		{
			btnSeeWorkers.setEnabled(true);
		}

	}
	public void eventHandling()
	{
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
}
