import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A1 extends JFrame {

		private JLabel label;
		private JButton button1;
		private JButton button2;
		private JTextField text;
		
	public A1(){
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());

		label = new JLabel("Bitte Text eingeben");
		add(label, BorderLayout.WEST);
		
		text = new JTextField(10);
		add(text, BorderLayout.CENTER);
		
		
		//Panel hinzufügen für die Buttons
		JPanel panel = new JPanel();
		
		button1 = new JButton("ok");
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Geklappt");
				
			}
			
		});
		button2 = new JButton("cancel");
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
				
		});

		panel.add(button1);
		panel.add(button2);

		add(panel, BorderLayout.SOUTH);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setTitle("A1");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new A1();
	}
}
