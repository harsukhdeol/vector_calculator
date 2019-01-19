package calculator;

import java.util.*;
import java.util.List;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.im.InputContext;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class UserInterface extends JFrame {
	protected static final Component UserInterface = null;
	static boolean Geo = false;
	static boolean Cart = false;

	private JPanel contentPane;
	private JTextField txtX1;
	private JTextField txtX2;
	private JTextField txtY2;
	private JTextField txtZ2;
	private JTextField txtY1;
	private JTextField txtZ1;
	private JTextField txtMag1;
	private JTextField txtMag2;
	private JTextField txtXangle1;
	private JTextField txtXangle2;
	private JTextField txtZangle1;
	private JTextField txtZangle2;
	private JTextField txtOperation;

	public static List<Float> V1 = new ArrayList<>();
	public static List<Float> V2 = new ArrayList<>();
	public static List<Float> Geo1 = new ArrayList<>();
	public static List<Float> Geo2 = new ArrayList<>();
	public static int page = 0;
	public static boolean operation = false;
	public static String dimension = "";
	
	public List<String> stuff= new ArrayList<String>();
	
	public boolean btnBclicked=false;
	public boolean btnAclicked=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public UserInterface() {
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 336);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(SystemColor.controlLtHighlight);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblVectorCalculator = new JLabel("Vector Calculator");
		lblVectorCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblVectorCalculator.setForeground(new Color(30, 144, 255));
		lblVectorCalculator.setFont(new Font("Malgun Gothic", Font.PLAIN, 30));
		lblVectorCalculator.setBounds(107, 17, 240, 59);
		contentPane.add(lblVectorCalculator);

		final JLabel lblA = new JLabel("A:");
		lblA.setForeground(Color.GRAY);
		lblA.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblA.setBounds(40, 141, 46, 34);
		contentPane.add(lblA);
		lblA.setVisible(false);

		final JLabel lblB = new JLabel("B:");
		lblB.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblB.setForeground(Color.GRAY);
		lblB.setBounds(40, 193, 46, 35);
		contentPane.add(lblB);
		lblB.setVisible(false);

		txtX1 = new JTextField();
		txtX1.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtX1.setText("0");
		txtX1.setBounds(96, 144, 40, 34);
		contentPane.add(txtX1);
		txtX1.setColumns(10);
		txtX1.setVisible(false);

		txtX2 = new JTextField();
		txtX2.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtX2.setText("0");
		txtX2.setColumns(10);
		txtX2.setBounds(96, 196, 40, 34);
		contentPane.add(txtX2);
		txtX2.setVisible(false);

		txtMag1 = new JTextField();
		txtMag1.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtMag1.setText("0");
		txtMag1.setBounds(96, 144, 72, 34);
		contentPane.add(txtMag1);
		txtMag1.setColumns(10);
		txtMag1.setVisible(false);

		txtMag2 = new JTextField();
		txtMag2.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtMag2.setText("0");
		txtMag2.setBounds(96, 196, 72, 35);
		contentPane.add(txtMag2);
		txtMag2.setColumns(10);
		txtMag2.setVisible(false);

		txtXangle1 = new JTextField();
		txtXangle1.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtXangle1.setText("0");
		txtXangle1.setBounds(200, 143, 46, 37);
		contentPane.add(txtXangle1);
		txtXangle1.setColumns(10);
		txtXangle1.setVisible(false);

		txtXangle2 = new JTextField();
		txtXangle2.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtXangle2.setText("0");
		txtXangle2.setBounds(200, 196, 46, 34);
		contentPane.add(txtXangle2);
		txtXangle2.setColumns(20);
		txtXangle2.setVisible(false);

		txtZangle1 = new JTextField();
		txtZangle1.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtZangle1.setText("0");
		txtZangle1.setBounds(282, 143, 46, 37);
		contentPane.add(txtZangle1);
		txtZangle1.setColumns(10);
		txtZangle1.setVisible(false);

		txtZangle2 = new JTextField();
		txtZangle2.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtZangle2.setText("0");
		txtZangle2.setBounds(282, 194, 46, 38);
		contentPane.add(txtZangle2);
		txtZangle2.setColumns(10);
		txtZangle2.setVisible(false);

		txtY2 = new JTextField();
		txtY2.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		txtY2.setText("0");
		txtY2.setBounds(200, 199, 41, 32);
		contentPane.add(txtY2);
		txtY2.setColumns(10);
		txtY2.setVisible(false);

		txtZ2 = new JTextField();
		txtZ2.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtZ2.setText("0");
		txtZ2.setBounds(282, 196, 46, 34);
		contentPane.add(txtZ2);
		txtZ2.setColumns(10);
		txtZ2.setVisible(false);

		txtY1 = new JTextField();
		txtY1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		txtY1.setText("0");
		txtY1.setBounds(200, 146, 40, 34);
		contentPane.add(txtY1);
		txtY1.setColumns(10);
		txtY1.setVisible(false);

		txtZ1 = new JTextField();
		txtZ1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		txtZ1.setText("0");
		txtZ1.setBounds(282, 146, 46, 34);
		contentPane.add(txtZ1);
		txtZ1.setColumns(10);
		txtZ1.setVisible(false);
	   
        
		final JButton btnGeo = new JButton("Geometric");
		btnGeo.setForeground(new Color(255, 255, 255));
		btnGeo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGeo.setBackground(new Color(30, 144, 255));
		btnGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart = false;
				Geo = true;

			}
		});
		btnGeo.setBounds(286, 227, 111, 64);
		contentPane.add(btnGeo);
		btnGeo.setBorderPainted(false);


		final JButton btnCart = new JButton("Cartesian");
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCart.setForeground(new Color(255, 255, 255));
		btnCart.setBackground(new Color(30, 144, 255));
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart = true;
				Geo = false;

			}
		});
		btnCart.setBounds(286, 151, 111, 59);
		contentPane.add(btnCart);
		btnCart.setBorderPainted(false);

		final JLabel lblInputTheVectors = new JLabel("Indicate dimensions of vectors:");
		lblInputTheVectors.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInputTheVectors.setForeground(new Color(105, 105, 105));
		lblInputTheVectors.setBounds(33, 108, 396, 35);
		contentPane.add(lblInputTheVectors);
	

		final JComboBox cmbDimensions = new JComboBox();
		cmbDimensions.setForeground(new Color(255, 255, 255));
		cmbDimensions.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		cmbDimensions.setBackground(new Color(70, 130, 180));
		cmbDimensions.setModel(new DefaultComboBoxModel(new String[] {
				 "1D", "2D", "3D" }));
		cmbDimensions.setBounds(50, 154, 195, 45);
		contentPane.add(cmbDimensions);
		dimension = (String) cmbDimensions.getSelectedItem();
		final JButton btnA = new JButton("A");
		btnA.setBackground(new Color(0, 191, 255));
		btnA.setForeground(new Color(255, 255, 255));
		btnA.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAclicked= true;
				
				txtOperation.setText((String) txtOperation.getText() + "A ");
				if (btnBclicked== true){
					if (Geo==true){
						stuff.clear();
						stuff.add(dimension);
					
					Geo2.add(Float.parseFloat(txtMag1.getText()));
					Geo2.add(Float.parseFloat(txtXangle1.getText()));
					Geo2.add(Float.parseFloat(txtZangle1.getText()));
					
					
					}
					else if (Cart==true){
					V2.add(Float.parseFloat((txtX1.getText())));
					V2.add(Float.parseFloat((txtY1.getText())));
					V2.add(Float.parseFloat((txtZ1.getText())));
				
					}
				}else{
					if (Cart==true){
				
					V1.add(Float.parseFloat((txtX1.getText())));
					V1.add(Float.parseFloat((txtY1.getText())));
					V1.add(Float.parseFloat((txtZ1.getText())));
				
					}else if (Geo==true){
			
			Geo1.add(Float.parseFloat(txtMag1.getText()));
			Geo1.add(Float.parseFloat(txtXangle1.getText()));
			Geo1.add(Float.parseFloat(txtZangle1.getText()));
		System.out.println("ew");
					}
					
				}
				operation= true;

				//stuff.add((float)5);
			}
		});
		btnA.setBounds(40, 281, 46, 35);
		contentPane.add(btnA);
		btnA.setVisible(false);
		btnA.setBorderPainted(false);

		final JButton btnB = new JButton("B");
		btnB.setBackground(new Color(30, 144, 255));
		btnB.setForeground(new Color(255, 255, 255));
		btnB.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Brg0) {
				btnBclicked=true;
				txtOperation.setText((String) txtOperation.getText() + "B ");
				if (btnAclicked== true){
					if (Geo ==true){
					Geo2.add(Float.parseFloat(txtMag2.getText()));
					Geo2.add(Float.parseFloat(txtXangle2.getText()));
					Geo2.add(Float.parseFloat(txtZangle2.getText()));
		
					}else if (Cart==true){
					V2.add(Float.parseFloat((txtX2.getText())));
					V2.add(Float.parseFloat((txtY2.getText())));
					V2.add(Float.parseFloat((txtZ2.getText())));
					}
				}else{
					if (Cart== true){
					V1.add(Float.parseFloat((txtX2.getText())));
					V1.add(Float.parseFloat((txtY2.getText())));
					V1.add(Float.parseFloat((txtZ2.getText())));
					}else if (Geo==true){
					Geo1.add(Float.parseFloat(txtMag2.getText()));
					Geo1.add(Float.parseFloat(txtXangle2.getText()));
					Geo1.add(Float.parseFloat(txtZangle2.getText()));
					}
				}
operation= true;

			}
		});
		btnB.setBounds(96, 281, 46, 35);
		contentPane.add(btnB);
		btnB.setVisible(false);
		btnB.setBorderPainted(false);

		txtOperation = new JTextField();
		txtOperation.setFont(new Font("Cambria", Font.PLAIN, 18));
		txtOperation.setText("0");
		txtOperation.setBounds(106, 241, 201, 34);
		contentPane.add(txtOperation);
		txtOperation.setColumns(10);
		txtOperation.setVisible(false);

		// Calculation Buttons

		final JButton btnDot = new JButton("Dot");
		btnDot.setBackground(new Color(30, 144, 255));
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText(txtOperation.getText() + "· ");

			}
		});
		btnDot.setBounds(150, 281, 57, 35);
		contentPane.add(btnDot);
		btnDot.setVisible(false);
		btnDot.setBorderPainted(false);

		final JButton btnCross = new JButton("Cross");
		btnCross.setBackground(new Color(70, 130, 180));
		btnCross.setForeground(new Color(255, 255, 255));
		btnCross.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnCross.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText(txtOperation.getText() + "× ");

			}
		});
		btnCross.setBounds(325, 327, 72, 35);
		contentPane.add(btnCross);
		btnCross.setVisible(false);
		btnCross.setBorderPainted(false);
		
		final JButton btnMagnitude = new JButton("Magnitude");
		btnMagnitude.setBackground(new Color(100, 149, 237));
		btnMagnitude.setForeground(new Color(255, 255, 255));
		btnMagnitude.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnMagnitude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText(txtOperation.getText() + "Mag ");

			}
		});
		btnMagnitude.setBounds(40, 327, 101, 35);
		contentPane.add(btnMagnitude);
		btnMagnitude.setVisible(false);
		btnMagnitude.setBorderPainted(false);

		final JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(30, 144, 255));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtOperation.setText(txtOperation.getText() + "+ ");

			}
		});
		btnAdd.setBounds(253, 327, 63, 35);
		contentPane.add(btnAdd);
		btnAdd.setVisible(false);
		btnAdd.setBorderPainted(false);

		final JButton btnSubtract = new JButton("Subtract");
		btnSubtract.setBackground(new Color(0, 191, 255));
		btnSubtract.setForeground(new Color(255, 255, 255));
		btnSubtract.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText() + "- ");

			}
		});
		btnSubtract.setBounds(150, 327, 93, 35);
		contentPane.add(btnSubtract);
		btnSubtract.setVisible(false);
		btnSubtract.setBorderPainted(false);

		final JButton btnunitVector = new JButton("unitVector");
		btnunitVector.setBackground(new Color(70, 130, 180));
		btnunitVector.setForeground(new Color(255, 255, 255));
		btnunitVector.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnunitVector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText() + "^ ");

			}
		});
		btnunitVector.setBounds(217, 419, 180, 35);
		contentPane.add(btnunitVector);
		btnunitVector.setVisible(false);
		btnunitVector.setBorderPainted(false);

		final JButton btnXangle = new JButton("Angle from + x axis");
		btnXangle.setBackground(new Color(70, 130, 180));
		btnXangle.setForeground(new Color(255, 255, 255));
		btnXangle.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnXangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText()
						+ "Xangle ");

			}
		});
		btnXangle.setBounds(40, 373, 167, 35);
		contentPane.add(btnXangle);
		btnXangle.setVisible(false);
		btnXangle.setBorderPainted(false);
		
		final JButton btnZangle = new JButton("Angle from + z axis");
		btnZangle.setBackground(new Color(0, 191, 255));
		btnZangle.setForeground(new Color(255, 255, 255));
		btnZangle.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnZangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText()
						+ "Zangle ");

			}
		});
		btnZangle.setBounds(40, 419, 167, 35);
		contentPane.add(btnZangle);
		btnZangle.setVisible(false);
		btnZangle.setBorderPainted(false);

		final JButton btnmultiplyScalar = new JButton("multiplyScalar");
		btnmultiplyScalar.setBackground(new Color(100, 149, 237));
		btnmultiplyScalar.setForeground(new Color(255, 255, 255));
		btnmultiplyScalar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnmultiplyScalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText() + "X ");

			}
		});
		btnmultiplyScalar.setBounds(217, 373, 180, 35);
		contentPane.add(btnmultiplyScalar);
		btnmultiplyScalar.setVisible(false);
		btnmultiplyScalar.setBorderPainted(false);

		final JButton btnGeoToCart = new JButton("ToCart");
		btnGeoToCart.setBackground(new Color(100, 149, 237));
		btnGeoToCart.setForeground(new Color(255, 255, 255));
		btnGeoToCart.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnGeoToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText()
						+ "ToCart ");

			}
		});
		btnGeoToCart.setBounds(304, 281, 93, 35);
		contentPane.add(btnGeoToCart);
		btnGeoToCart.setVisible(false);
		btnGeoToCart.setBorderPainted(false);

		final JButton btnCartToGeo = new JButton("ToGeo");
		btnCartToGeo.setBackground(new Color(0, 191, 255));
		btnCartToGeo.setForeground(new Color(255, 255, 255));
		btnCartToGeo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnCartToGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOperation.setText((String) txtOperation.getText() + "ToGeo ");

			}
		});
		btnCartToGeo.setBounds(217, 281, 81, 35);
		contentPane.add(btnCartToGeo);
		btnCartToGeo.setVisible(false);
		btnCartToGeo.setBorderPainted(false);

		final JButton btnBack = new JButton("< Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(135, 206, 235));

		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (page == 1) {
					btnGeo.setVisible(true);
					btnCart.setVisible(true);
					Cart = false;
					Geo = false;
					lblInputTheVectors.setVisible(false);
					cmbDimensions.setVisible(true);
					cmbDimensions.setSelectedIndex(0);
					btnBack.setEnabled(false);
					lblA.setVisible(false);
					lblB.setVisible(false);
					txtMag1.setVisible(false);
					txtMag2.setVisible(false);
					txtXangle1.setVisible(false);
					txtXangle2.setVisible(false);
					txtZangle1.setVisible(false);
					txtZangle2.setVisible(false);
					txtY2.setVisible(false);
					txtY1.setVisible(false);
					txtZ2.setVisible(false);
					txtZ1.setVisible(false);
					txtX1.setVisible(false);
					txtX2.setVisible(false);
				} else if (page == 2) {
					txtOperation.setVisible(false);
					btnA.setVisible(false);
					btnB.setVisible(false);
					btnDot.setVisible(false);
					btnCross.setVisible(false);
					btnunitVector.setVisible(false);
					btnAdd.setVisible(false);
					btnSubtract.setVisible(false);
					btnMagnitude.setVisible(false);
					btnXangle.setVisible(false);
					btnZangle.setVisible(false);
					btnCartToGeo.setVisible(false);
					btnGeoToCart.setVisible(false);
					btnmultiplyScalar.setVisible(false);
				}
				page--;
			}
		});
		btnBack.setBounds(17, 77, 89, 23);
		contentPane.add(btnBack);
		btnBack.setBorderPainted(false);
/**
 * 
 */
		JButton btnNext = new JButton("Next >");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNext.setBackground(new Color(135, 206, 235));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dimension = (String) cmbDimensions.getSelectedItem();
				page++;
				if (page == 1) {
					btnGeo.setVisible(false);
					btnCart.setVisible(false);
					lblInputTheVectors.setVisible(true);
					btnBack.setEnabled(true);
					cmbDimensions.setVisible(false);
					lblA.setVisible(true);
					lblB.setVisible(true);
					if (Cart == true) {
						lblInputTheVectors.setText("Input The Vectors [x]:");
						txtX1.setVisible(true);
						txtX2.setVisible(true);

						// String dimension = (String)
						// cmbDimensions.getSelectedItem();
						if (dimension == "2D") {
							
							lblInputTheVectors
									.setText("Input The Vectors [x,y]:");
							txtY2.setVisible(true);
							txtY1.setVisible(true);
						} else if (dimension == "3D") {
							lblInputTheVectors
									.setText("Input The Vectors [x,y,z]:");
							txtY2.setVisible(true);
							txtY1.setVisible(true);
							txtZ2.setVisible(true);
							txtZ1.setVisible(true);
						}

					} else if (Geo == true) {
						lblInputTheVectors
								.setText("Input The Vectors [magnitude]:");
						txtMag1.setVisible(true);
						txtMag2.setVisible(true);

						if (dimension == "2D") {
							lblInputTheVectors
									.setText("Input The Vectors [magnitude, angle from + x axis]:");
							txtXangle1.setVisible(true);
							txtXangle2.setVisible(true);
						} else if (dimension == "3D") {
							lblInputTheVectors
									.setText("Input The Vectors [magnitude, angle from + x axis ,angle of elevation]:");
							txtXangle1.setVisible(true);
							txtXangle2.setVisible(true);
							txtZangle1.setVisible(true);
							txtZangle2.setVisible(true);
						}
					}
				} else if (page == 2) {
					setBounds(100, 100, 447, 511);
				
					txtOperation.setText("");
					lblInputTheVectors.setText("Input the desired Calculation");
					btnGeo.setVisible(false);
					btnCart.setVisible(false);
					cmbDimensions.setVisible(false);

					txtOperation.setVisible(true);
					btnA.setVisible(true);
					btnB.setVisible(true);
					btnDot.setVisible(true);
					btnCross.setVisible(true);
					btnunitVector.setVisible(true);
					btnAdd.setVisible(true);
					btnSubtract.setVisible(true);
					btnMagnitude.setVisible(true);
					btnXangle.setVisible(true);
					btnZangle.setVisible(true);
					btnCartToGeo.setVisible(true);
					btnGeoToCart.setVisible(true);
					btnmultiplyScalar.setVisible(true);
					
					
					//stuff.add((float) 5);

				} else if (page == 3) {
					setBounds(100, 100, 447, 336);
					btnA.setVisible(false);
					btnB.setVisible(false);
					btnDot.setVisible(false);
					btnCross.setVisible(false);
					btnunitVector.setVisible(false);
					btnAdd.setVisible(false);
					btnSubtract.setVisible(false);
					btnMagnitude.setVisible(false);
					btnXangle.setVisible(false);
					btnZangle.setVisible(false);
					btnCartToGeo.setVisible(false);
					btnGeoToCart.setVisible(false);
					btnmultiplyScalar.setVisible(false);
					List<Float> Answer = new ArrayList<>();
					
					if (Geo1.isEmpty()==false){
					V1 = Calculations.GeoToCart(Geo1);
  					V2 = Calculations.GeoToCart(Geo2);
  					
					}
					
					System.out.println(V1);
					String[] calculation = txtOperation.getText().split(" ");
					for (int i = 0; i < calculation.length; i++) {
						/*if (operation == true){
							btnA.setEnabled(false);
							btnB.setEnabled(false);
						}else{
							btnDot.setEnabled(false);
							btnCross.setEnabled(false);
							btnunitVector.setEnabled(false);
							btnAdd.setEnabled(false);
							btnSubtract.setEnabled(false);
							btnMagnitude.setEnabled(false);
							btnXangle.setEnabled(false);
							btnZangle.setEnabled(false);
							btnCartToGeo.setEnabled(false);
							btnGeoToCart.setEnabled(false);
						}*/
						// calculation = txtOperation.getText().split(" ");
						// List<Float> firstVector= calculation[i];//
						// Arrays.asList(Float.parseFloat(txtOperation.getText()));
						switch (calculation[i]) {
//					
						case ("+"):
							
							
							//txtOperation.setText( Arrays.toString(Calculations.GeoToCart(Geo1).toArray()));
							/*List<Float> firstVector = new ArrayList<>();
							String[] thing = ((calculation[i - 1].replaceAll(
									"[", "").replaceAll("]", "").split(",")));
							for (int j = 0; i < thing.length; i++) {
								firstVector.add(Float.parseFloat(thing[j]));
							}
							List<Float> secondVector = new ArrayList<>();
							String[] Otherthing = ((calculation[i + 1]
									.replaceAll("[", "").replaceAll("]", "")
									.split(",")));
							for (int k = 0; i < thing.length; i++) {
								secondVector.add(Float
										.parseFloat(Otherthing[k]));
							}*/
							
							Answer = Calculations.addition(V1,V2);
							
							break;
						
						  case ("Mag"): Answer = Calculations.magnitude(V1);
						  break;
						  
						  case ("-"): Answer =
								  
									  Calculations.subtraction(V1,V2); 
						  break; 
						  case ("X"):
							  
							  Answer = Calculations.multiply(V1, Float.parseFloat(calculation[i+1]));
							
						  break;
						  case ("Xangle"):
							  Answer =Calculations.Xangle(V1);
						  break;
						  case("Zangle"):
							  Answer =Calculations.Zangle(V1); 
						  break;
						  case("ToCart"): 
							  Answer = (V1);
						  break; 
						  case("ToGeo"): 
							  Answer =Calculations.CartToGeo(V1);
						  lblInputTheVectors.setText("[magnitude, angle from + x axis, angle of elevation]");
						  break; 
						  case("·"):
							  
							  Answer = Calculations.dotProduct(V1,V2); 
						  break; 
						  case ("×"):
							 
								  Answer =Calculations.crossProduct(V1, V2); 
							  
							 
						  break; 
						  case ("^"):
							  Answer = Calculations.unitVector(V1);
						  break; }
						}
					txtOperation.setText(Arrays.toString(Answer.toArray()));
						/*
						 * String operation = txtOperation.getText();
						 * txtOperation
						 * .setText(operation+" = "+Arrays.toString(vAnswer));
						 * txtOperation
						 * .setText(operation+" = "+Float.toString(sAnswer));
						 */
										
				}else if (page==4){
					System.exit(0);
				}

			}
		});
		btnNext.setBounds(335, 77, 89, 23);
		contentPane.add(btnNext);
		btnNext.setBorderPainted(false);

	JButton btnHelp= new JButton("Help");
	btnHelp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane newPane = new JOptionPane();
			JOptionPane.showMessageDialog(UserInterface, "Choose your input format, insert your vector properties, and choose a calculation.");		
		}
	});
	btnHelp.setBounds(5, 11, 89, 31);
	contentPane.add(btnHelp);


}

}




