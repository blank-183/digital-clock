package digitalclock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;

public class Main {

	private JFrame frmDigitalClock;
	JTextField hourTextField;
	JTextField minuteTextField;
	JTextField secondTextField;
	JTextField dateTextField;
	JTextField dayTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmDigitalClock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		new Clock(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDigitalClock = new JFrame();
		frmDigitalClock.setTitle("Digital Clock");
		frmDigitalClock.setIconImage(Toolkit.getDefaultToolkit().getImage("clock.png"));
		frmDigitalClock.getContentPane().setBackground(new Color(0, 0, 0));
		frmDigitalClock.setResizable(false);
		frmDigitalClock.setBounds(100, 100, 443, 217);
		frmDigitalClock.setUndecorated(true);
		frmDigitalClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDigitalClock.getContentPane().setLayout(null);
		
		hourTextField = new JTextField();
		hourTextField.setBackground(new Color(0, 0, 0));
		hourTextField.setForeground(new Color(0, 208, 0));
		hourTextField.setFont(new Font("Tahoma", Font.BOLD, 68));
		hourTextField.setHorizontalAlignment(SwingConstants.CENTER);
		hourTextField.setEditable(false);
		hourTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		hourTextField.setBounds(38, 84, 96, 85);
		frmDigitalClock.getContentPane().add(hourTextField);
		hourTextField.setColumns(10);
		
		minuteTextField = new JTextField();
		minuteTextField.setBackground(new Color(0, 0, 0));
		minuteTextField.setForeground(new Color(0, 208, 0));
		minuteTextField.setFont(new Font("Tahoma", Font.BOLD, 68));
		minuteTextField.setHorizontalAlignment(SwingConstants.CENTER);
		minuteTextField.setEditable(false);
		minuteTextField.setColumns(10);
		minuteTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		minuteTextField.setBounds(172, 84, 96, 85);
		frmDigitalClock.getContentPane().add(minuteTextField);
		
		secondTextField = new JTextField();
		secondTextField.setBackground(new Color(0, 0, 0));
		secondTextField.setForeground(new Color(0, 208, 0));
		secondTextField.setFont(new Font("Tahoma", Font.BOLD, 68));
		secondTextField.setHorizontalAlignment(SwingConstants.CENTER);
		secondTextField.setEditable(false);
		secondTextField.setColumns(10);
		secondTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		secondTextField.setBounds(306, 84, 96, 85);
		frmDigitalClock.getContentPane().add(secondTextField);
		
		JLabel colonLabel1 = new JLabel(":");
		colonLabel1.setForeground(new Color(0, 208, 0));
		colonLabel1.setFont(new Font("Tahoma", Font.BOLD, 70));
		colonLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		colonLabel1.setBounds(133, 85, 33, 82);
		frmDigitalClock.getContentPane().add(colonLabel1);
		
		JLabel colonLabel2 = new JLabel(":");
		colonLabel2.setForeground(new Color(0, 208, 0));
		colonLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		colonLabel2.setFont(new Font("Tahoma", Font.BOLD, 70));
		colonLabel2.setBounds(262, 84, 33, 85);
		frmDigitalClock.getContentPane().add(colonLabel2);
		
		dateTextField = new JTextField();
		dateTextField.setEditable(false);
		dateTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
		dateTextField.setHorizontalAlignment(SwingConstants.LEFT);
		dateTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		dateTextField.setBackground(new Color(0, 0, 0));
		dateTextField.setForeground(new Color(0, 208, 0));
		dateTextField.setBounds(38, 49, 227, 25);
		frmDigitalClock.getContentPane().add(dateTextField);
		dateTextField.setColumns(10);
		
		dayTextField = new JTextField();
		dayTextField.setEditable(false);
		dayTextField.setHorizontalAlignment(SwingConstants.LEFT);
		dayTextField.setBackground(new Color(0, 0, 0));
		dayTextField.setFont(new Font("Courier New", Font.PLAIN, 20));
		dayTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		dayTextField.setForeground(new Color(0, 208, 0));
		dayTextField.setBounds(290, 48, 112, 26);
		frmDigitalClock.getContentPane().add(dayTextField);
		dayTextField.setColumns(10);
	}
}
