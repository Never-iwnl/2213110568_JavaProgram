import java.awt.EventQueue;

import java.text.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textNumber1;
	private JTextField textNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(435, 0, -430, 261);
		contentPane.add(panel);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(89, 11, 91, 31);
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(89, 42, 91, 31);
		contentPane.add(lblNumber2);

		textNumber1 = new JTextField();
		textNumber1.setBounds(202, 16, 119, 20);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);

		textNumber2 = new JTextField();
		textNumber2.setColumns(10);
		textNumber2.setBounds(202, 47, 119, 20);
		contentPane.add(textNumber2);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(181, 163, 48, 34);
		contentPane.add(lblResult);

		final JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(202, 78, 61, 22);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(89, 84, 46, 14);
		contentPane.add(lblOperator);

		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setBounds(202, 118, 109, 23);
		contentPane.add(onedigit);

		final JRadioButton twodigit = new JRadioButton("2 Digit");
		twodigit.setBounds(202, 144, 109, 23);
		contentPane.add(twodigit);

		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);

		final JButton btnOK = new JButton("Ok");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(textNumber1.getText());
					num2 = Double.parseDouble(textNumber2.getText());
					//sum = num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+")) {
						sum = num1+num2;
					}
					if(operator.equals("-")) {
						sum = num1-num2;
					}
					if(operator.equals("*")) {
						sum = num1*num2;
					}
					if(operator.equals("/")) {
						sum = num1/num2;
					}
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(onedigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0");
					}
					if(twodigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0.");
					}
					lblResult.setText(frmNumber.format(sum));
				}
			}
		});
		btnOK.setBounds(89, 199, 89, 23);
		contentPane.add(btnOK);

		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(232, 199, 89, 23);
		contentPane.add(btnCancel);

		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setBounds(89, 122, 91, 14);
		contentPane.add(lblDigit);





	}
}