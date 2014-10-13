package MainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class GUI {

	private JFrame frame;
	private JTextField Init_Invest;
	private JTextField Years;
	private JTextField Year_Int_Rt;
	private JTextField FV;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel InitialPanel = new JPanel();
		frame.getContentPane().add(InitialPanel, "name_1413166833727220000");
		InitialPanel.setLayout(null);
		InitialPanel.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Initial Investment");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel.setBounds(50, 55, 154, 16);
		InitialPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Years");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel_1.setBounds(50, 83, 154, 16);
		InitialPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Yearly Interest Rate");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel_2.setBounds(50, 111, 154, 16);
		InitialPanel.add(lblNewLabel_2);
		
		Init_Invest = new JTextField();
		Init_Invest.setBounds(216, 50, 134, 28);
		InitialPanel.add(Init_Invest);
		Init_Invest.setColumns(10);
		
		Years = new JTextField();
		Years.setBounds(216, 78, 134, 28);
		InitialPanel.add(Years);
		Years.setColumns(10);
		
		Year_Int_Rt = new JTextField();
		Year_Int_Rt.setBounds(216, 106, 134, 28);
		InitialPanel.add(Year_Int_Rt);
		Year_Int_Rt.setColumns(10);
		
		final JPanel FVPanel = new JPanel();
		frame.getContentPane().add(FVPanel, "name_1413166836300323000");
		FVPanel.setLayout(null);
		FVPanel.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Future Value");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel_3.setBounds(60, 122, 130, 16);
		FVPanel.add(lblNewLabel_3);
		
		FV = new JTextField();
		FV.setBounds(202, 116, 134, 28);
		FVPanel.add(FV);
		FV.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FVPanel.setVisible(true);
				InitialPanel.setVisible(false);
				
				double pv = Double.parseDouble(Init_Invest.getText());
				double time = Double.parseDouble(Years.getText());
				double interest = Double.parseDouble(Year_Int_Rt.getText());
				
				double NewAmount;
				
				FVCalculation calc = new FVCalculation();
				
				NewAmount = calc.FutureValue(pv, interest, time);
				DecimalFormat df = new DecimalFormat("0.00"); 
				FV.setText("$" + df.format(NewAmount));
				
			}
		});
		btnCalculate.setBounds(233, 146, 117, 29);
		InitialPanel.add(btnCalculate);
		

	}

}
