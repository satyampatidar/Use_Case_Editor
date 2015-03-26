import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Project1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project1 window = new Project1();
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
	public Project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblUseCaseName = new JLabel("Use Case Name");
		lblUseCaseName.setBounds(0, 0, 108, 14);
		panel_4.add(lblUseCaseName);
		
		JLabel lblWithdrawFund = new JLabel("Withdraw Fund");
		lblWithdrawFund.setBounds(136, 0, 135, 14);
		panel_4.add(lblWithdrawFund);
		
		JLabel UCid = new JLabel("UCid");
		UCid.setBounds(277, 0, 46, 14);
		panel_4.add(UCid);
		
		JLabel lblUcVersion = new JLabel("Version 1.1");
		lblUcVersion.setBounds(433, 0, 79, 14);
		panel_4.add(lblUcVersion);
		
		JLabel lblMainSystemName = new JLabel("Main system Name");
		lblMainSystemName.setBounds(0, 25, 118, 14);
		panel_4.add(lblMainSystemName);
		
		JLabel lblUc = new JLabel("UC1");
		lblUc.setBounds(377, 0, 46, 14);
		panel_4.add(lblUc);
		
		JFormattedTextField frmtdtxtfldAtm = new JFormattedTextField();
		frmtdtxtfldAtm.setText("ATM");
		frmtdtxtfldAtm.setBounds(136, 22, 135, 20);
		panel_4.add(frmtdtxtfldAtm);
		
		JFormattedTextField frmtdtxtfldParentUseCase = new JFormattedTextField();
		frmtdtxtfldParentUseCase.setText("Parent Use Case Name");
		frmtdtxtfldParentUseCase.setBounds(277, 22, 146, 20);
		panel_4.add(frmtdtxtfldParentUseCase);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(433, 22, 79, 20);
		panel_4.add(formattedTextField);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(0, 50, 108, 14);
		panel_4.add(lblDescription);
		
		JLabel lblConstraints = new JLabel("Constraints");
		lblConstraints.setBounds(0, 75, 118, 14);
		panel_4.add(lblConstraints);
		
		textField = new JTextField();
		textField.setBounds(136, 53, 376, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 72, 376, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 105, 554, 8);
		panel_4.add(separator);
		
		JLabel lblActors = new JLabel("Actors");
		lblActors.setBounds(249, 113, 46, 14);
		panel_4.add(lblActors);
		
		JLabel lblNewLabel = new JLabel("Sr. No.");
		lblNewLabel.setBounds(0, 144, 46, 14);
		panel_4.add(lblNewLabel);
		
		JLabel lblActorType = new JLabel("Actor Type");
		lblActorType.setBounds(76, 144, 84, 14);
		panel_4.add(lblActorType);
		
		JLabel lblActorName = new JLabel("Actor name");
		lblActorName.setBounds(170, 144, 146, 14);
		panel_4.add(lblActorName);
		
		JLabel lblParentActorName = new JLabel("Parent actor Name");
		lblParentActorName.setBounds(326, 144, 186, 14);
		panel_4.add(lblParentActorName);
		
		JLabel label = new JLabel("1.");
		label.setBounds(0, 169, 46, 14);
		panel_4.add(label);
		
		JFormattedTextField frmtdtxtfldPrimary = new JFormattedTextField();
		frmtdtxtfldPrimary.setText("Primary");
		frmtdtxtfldPrimary.setBounds(76, 166, 84, 20);
		panel_4.add(frmtdtxtfldPrimary);
		
		JFormattedTextField frmtdtxtfldAtmCoustomer = new JFormattedTextField();
		frmtdtxtfldAtmCoustomer.setText("ATM Customer");
		frmtdtxtfldAtmCoustomer.setBounds(170, 166, 146, 20);
		panel_4.add(frmtdtxtfldAtmCoustomer);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(326, 166, 186, 20);
		panel_4.add(formattedTextField_1);
		
		JLabel lblPreCondition = new JLabel("Pre Condition");
		lblPreCondition.setBounds(0, 194, 71, 14);
		panel_4.add(lblPreCondition);
		
		JFormattedTextField frmtdtxtfldAtmCustomerHas = new JFormattedTextField();
		frmtdtxtfldAtmCustomerHas.setText("ATM customer has inserted an ATM card in the card reader");
		frmtdtxtfldAtmCustomerHas.setBounds(76, 191, 436, 20);
		panel_4.add(frmtdtxtfldAtmCustomerHas);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Project2 nw = new Project2();
				nw.Screen2();
			}
		});
		btnSubmit.setBounds(234, 219, 89, 23);
		panel_4.add(btnSubmit);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(-12, 0, 576, 273);
		panel_4.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
	}
}
