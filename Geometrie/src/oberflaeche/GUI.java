package oberflaeche;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField eingabe0;
	private JTextField eingabe1;
	private JTextField ausgabe0;
	private JTextField ausgabe1;
	private Double input1 = 0.0;
	private Double input2 = 0.0;
	private Choice choice;
	GeoFig geo = null;
	
	
void calc(){
	String inputx = "";
	String inputy = "";
	for(int i = 0; i < eingabe0.getText().length(); i++){
		if(eingabe0.getText().charAt(i)-48 >= 0 && eingabe0.getText().charAt(i)-48 <= 9 || (eingabe0.getText().charAt(i)) == '.' ){
			inputx += eingabe0.getText().charAt(i);
			}
		}
	for(int k = 0; k < eingabe1.getText().length(); k++){
		if(eingabe1.getText().charAt(k)-48 >= 0 && eingabe1.getText().charAt(k)-48 <= 9 || (eingabe1.getText().charAt(k)) == '.' ){
			inputy += eingabe1.getText().charAt(k);
		}
	}
	if(inputx.equals("")||inputy.equals("")){
		if(inputx.equals(""))input1 = 0.0;
		if(inputy.equals(""))input2 = 0.0;
	}else{
		input1 = Double.parseDouble(inputx);
		input2 = Double.parseDouble(inputy);
	}
	eingabe0.setText(inputx);
	eingabe1.setText(inputy);
		if(choice.getSelectedItem().equals("Rechteck")){
			geo = new Rechteck(input1,input2);	
		}else if(choice.getSelectedItem().equals("Quadrat")){
			geo = new Quadrat(input1,input2);
		}else if(choice.getSelectedItem().equals("Kreis")){
			geo = new Kreis(input1,input2);
		}else if(choice.getSelectedItem().equals("Dreieck")){
			geo = new Dreieck(input1,input2);
		}else System.out.println("Fehler");
			
		if(geo != null){
			geo.flaecheBerechnen();
			geo.umfangBerechnen();
			ausgabe0.setText(String.valueOf(GeoFig.gibumfang()));
			ausgabe1.setText(String.valueOf(GeoFig.gibflaeche()));
			ausgabe0.setCaretPosition(0);
			ausgabe1.setCaretPosition(0);
		}
	}

	

	public GUI() {
		super("Geo Calc");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 132);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel label0 = new JLabel("Laenge");
		label0.setBounds(10, 45, 46, 14);
		contentPane.add(label0);
		
		final JLabel label = new JLabel("Breite");
		label.setBounds(10, 74, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Flaeche");
		label_1.setBounds(134, 45, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Umfang");
		label_2.setBounds(134, 74, 46, 14);
		contentPane.add(label_2);
		
		choice = new Choice();
		choice.setBounds(10, 10, 239, 20);
		choice.add("Rechteck");
		choice.add("Quadrat");
		choice.add("Dreieck");
		choice.add("Kreis");
		contentPane.add(choice);
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(choice.getSelectedItem().equals("Rechteck")){
					contentPane.add(label);
					contentPane.add(eingabe1);
					label0.setText("Laenge");
					label.setText("Breite");
				}else if(choice.getSelectedItem().equals("Quadrat")){
					contentPane.remove(label);
					contentPane.remove(eingabe1);
					label0.setText("Laenge");
				}else if(choice.getSelectedItem().equals("Kreis")){
					contentPane.remove(label);
					contentPane.remove(eingabe1);
					label0.setText("Radius");
				}else if(choice.getSelectedItem().equals("Dreieck")){
					contentPane.add(label);
					contentPane.add(eingabe1);
					label0.setText("Breite");
					label.setText("Hoehe");
				}
				contentPane.revalidate();
				contentPane.repaint();
				calc();
			}
		});

		
		eingabe0 = new JTextField("0.0");
		eingabe0.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				calc();
			}
		});
		eingabe0.setBounds(57, 42, 59, 20);
		contentPane.add(eingabe0);
		eingabe0.setColumns(10);
		eingabe1 = new JTextField("0.0");
		eingabe1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				calc();
			}
		});
		eingabe1.setColumns(10);
		eingabe1.setBounds(57, 71, 59, 20);
		contentPane.add(eingabe1);
		
		ausgabe0 = new JTextField(5);
		ausgabe0.setEditable(false);
		ausgabe0.setColumns(10);
		ausgabe0.setBounds(184, 71, 59, 20);
		ausgabe0.setText(String.valueOf(GeoFig.gibumfang()));
		contentPane.add(ausgabe0);
		
		ausgabe1 = new JTextField(5);
		ausgabe1.setEditable(false);
		ausgabe1.setColumns(10);
		ausgabe1.setBounds(184, 42, 59, 20);
		ausgabe1.setText(String.valueOf(GeoFig.gibflaeche()));
		contentPane.add(ausgabe1);
	}	
}
