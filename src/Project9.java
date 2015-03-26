import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Project9 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Screen9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project9 window = new Project9();
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
	public Project9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 509, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMainFlow = new JLabel("Main Flow");
		lblMainFlow.setBounds(220, 0, 65, 14);
		panel.add(lblMainFlow);
		
		JLabel lblMainFlowConditionguard = new JLabel("Main Flow Condition/Guard");
		lblMainFlowConditionguard.setBounds(0, 40, 128, 21);
		panel.add(lblMainFlowConditionguard);
		
		JLabel lblMainFlowId = new JLabel("Main Flow ID");
		lblMainFlowId.setBounds(151, 43, 71, 14);
		panel.add(lblMainFlowId);
		
		JLabel lblSteps = new JLabel("Steps");
		lblSteps.setBounds(320, 43, 46, 14);
		panel.add(lblSteps);
		
		JLabel lblM = new JLabel("M8");
		lblM.setBounds(161, 68, 46, 14);
		panel.add(lblM);
		
		JFormattedTextField frmtdtxtfldIncludeUseCase = new JFormattedTextField();
		frmtdtxtfldIncludeUseCase.setText("The system validates that the ATM has enough funds.");
		frmtdtxtfldIncludeUseCase.setBounds(220, 68, 279, 20);
		panel.add(frmtdtxtfldIncludeUseCase);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Project10 nw = new Project10();
				nw.Screen10();
			}
		});
		btnSubmit.setBounds(189, 132, 107, 48);
		panel.add(btnSubmit);
	}
}
