package poolapp;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GUInterface implements ActionListener{
	boolean is1Swapped;
	boolean is2Swapped;
	boolean is3Swapped;
	
	Panel panel;
	Button b1;
	Button b2;
	Button b3;
	Label l;
	
	public GUInterface() {
		
		this.is1Swapped = is1Swapped;
		is1Swapped = false;
		this.is2Swapped = is2Swapped;
		is2Swapped = false;
		this.is3Swapped = is3Swapped;
		is3Swapped = false;
		
		Frame f = new Frame();
		
		panel = new Panel();
		panel.setBounds(20, 20, 160, 160);
		panel.setBackground(Color.gray);
		
		b1 = new Button("1");
		b1.setBounds(40, 40, 40, 40);
		b1.setBackground(Color.yellow);
		
		b2 = new Button("2");
		b2.setBounds(80, 40, 40, 40);
		b2.setBackground(Color.yellow);
		
		b3 = new Button("3");
		b3.setBounds(120, 40, 40, 40);
		b3.setBackground(Color.yellow);
		
		l = new Label();
		l.setBounds(20, 180, 160, 40);
		l.setBackground(Color.green);
		
		panel.add(b1); panel.add(b2); panel.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.add(panel);
		f.add(l);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource() == b1) {
			Swap swap = new Swap(1);		    
			if (is1Swapped == false) {	
				try {
					swap.swap(1);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = true");
				chin1Check();
			} else if (is1Swapped == true) {	
				try {
					swap.contraSwap(1);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = false");
				chin1Check();
	    	}
		}
		if (e.getSource() == b2) {
			Swap swap = new Swap(2);		    
			if (is2Swapped == false) {	
				try {
					swap.swap(2);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = true");
				chin2Check();
			} else if (is2Swapped == true) {	
				try {
					swap.contraSwap(2);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = false");
				chin2Check();
	    	}
		}
		if (e.getSource() == b3) {
			Swap swap = new Swap(3);		    
			if (is3Swapped == false) {	
				try {
					swap.swap(3);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = true");
				chin3Check();
			} else if (is3Swapped == true) {	
				try {
					swap.contraSwap(3);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				};
				l.setText("iss = false");
				chin3Check();
	    	}
		}
	}
	
	public void chin1Check() {
		if (is1Swapped == false) {
			is1Swapped = true; 
		} else if (is1Swapped == true) {
			is1Swapped = false;
		}
	}
	public void chin2Check() {
		if (is2Swapped == false) {
			is2Swapped = true; 
		} else if (is2Swapped == true) {
			is2Swapped = false;
		}
	}
	public void chin3Check() {
		if (is3Swapped == false) {
			is3Swapped = true; 
		} else if (is3Swapped == true) {
			is3Swapped = false;
		}
	}
}
