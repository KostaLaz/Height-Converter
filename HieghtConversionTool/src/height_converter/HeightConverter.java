package height_converter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class HeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConverter frame = new HeightConverter();
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
	public HeightConverter() {
		setTitle("Height Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(105, 105, 105));
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlbFeet = new JLabel("Feet");
		jlbFeet.setForeground(new Color(105, 105, 105));
		jlbFeet.setFont(new Font("Verdana", Font.BOLD, 13));
		jlbFeet.setBounds(96, 60, 77, 20);
		contentPane.add(jlbFeet);
		
		textField = new JTextField();
		textField.setBounds(251, 58, 86, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel jlbInch = new JLabel("Inches");
		jlbInch.setForeground(new Color(105, 105, 105));
		jlbInch.setFont(new Font("Verdana", Font.BOLD, 13));
		jlbInch.setBounds(96, 101, 77, 14);
		contentPane.add(jlbInch);
		
		textField_1 = new JTextField();
		textField_1.setBounds(251, 96, 86, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConvert = new JButton("Convert to");
		btnConvert.setForeground(new Color(105, 105, 105));
		btnConvert.setBackground(new Color(169, 169, 169));
		btnConvert.setFont(new Font("Verdana", Font.BOLD, 16));
		btnConvert.setBounds(109, 142, 204, 23);
		contentPane.add(btnConvert);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 176, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(105, 105, 105));
		btnClear.setFont(new Font("Verdana", Font.BOLD, 13));
		btnClear.setBounds(56, 210, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(105, 105, 105));
		btnExit.setFont(new Font("Verdana", Font.BOLD, 13));
		btnExit.setBounds(267, 210, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Centimetars");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setBounds(56, 176, 117, 17);
		contentPane.add(lblNewLabel);
	}
}
