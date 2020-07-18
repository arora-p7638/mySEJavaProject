package parv_7638_SEproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TimeKeeper {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtPswd;
	private JButton btnLogin;
	private static TimeKeeper window;
	private JLabel lblPass;
	 int flagg=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new TimeKeeper();
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
	public TimeKeeper() {
		setUpComponents();
		eventHandling();
	}
public void setUpComponents()
{
	frame = new JFrame();
	frame.setBounds(500, 500, 730, 615);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	txtID = new JTextField();
	txtID.setBounds(376, 234, 175, 20);
	frame.getContentPane().add(txtID);
	txtID.setColumns(10);
	
	txtPswd = new JTextField();
	txtPswd.setBounds(376, 292, 175, 20);
	frame.getContentPane().add(txtPswd);
	txtPswd.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("Employee ID");
	lblNewLabel.setBounds(240, 237, 86, 14);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Password");
	lblNewLabel_1.setBounds(240, 298, 46, 14);
	frame.getContentPane().add(lblNewLabel_1);
	
	btnLogin = new JButton("Login");
	
	btnLogin.setBounds(332, 382, 89, 23);
	frame.getContentPane().add(btnLogin);
	
	JLabel lblNewLabel_2 = new JLabel("Time Keeper");
	lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
	lblNewLabel_2.setBounds(282, 68, 230, 67);
	frame.getContentPane().add(lblNewLabel_2);
	lblPass = new JLabel("Invalid Password. Please try again!");
	lblPass.setEnabled(false);
	lblPass.setForeground(Color.RED);
	lblPass.setBounds(282, 351, 230, 20);
	frame.getContentPane().add(lblPass);
	
	//frame.getContentPane().add(lblPass);
	}
public void eventHandling()
{
	btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String checkID=txtID.getText();
			String checkPassword=txtPswd.getText();
			 //send for either manager or worker 
			if((checkID.equals(Employee.managerID) && checkPassword.equals(Employee.managerPassword)) || (checkID.equals(Employee.employeeID) && checkPassword.equals(Employee.employeePassword)))
			{
			if(checkID.equals(Employee.managerID))
				{flagg=1;
				Manager a=new Manager(); //gets instantiated for other access rights and functionalities to be added in
				}
			else
			{
				Worker a=new Worker(); //gets instantiated for other functions to be added
			}
			frame.dispose();
			Welcome a=new Welcome();
			a.WelcomeScreen(flagg);
			}
			else
				lblPass.setEnabled(true);
		
		}
	});
	}

}
