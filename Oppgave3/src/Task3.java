/*
 * Skriv et O(n) program som spør bruker etter en sekvens med heltall (0 indikerer slutt på input). 
 * Programmet skal finne lengste subsekvens med samme tall. 
 * Her er et eksempel på kjøring: Gi inn en sekvens av tall, avslutt med 0: 2 4 4 8 8 8 8 2 4 4 0
 * Lengste sekvens med samme tall starter på indeks 3 med 4 verdier av tallet 8.
 */

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Task3 extends Frame {
	private static Label label;
	private static TextField txtField;
	private ArrayList<Integer> arr = new ArrayList<Integer>();

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Task3 k = new Task3();
	}

	public Task3() {
		super("Type in a list of integers, mark the end of it with 0");
		Panel panel = new Panel();
		label = new Label();
		txtField = new TextField(20);
		txtField.addKeyListener(new MyKeyListener());

		add(label, BorderLayout.NORTH);
		panel.add(txtField, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);
		addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent we) {
								System.exit(0);
							}
						  });
		setSize(500, 100);
		setVisible(true);
	}

	// Find which number value has the longest continuous line, and prints the
	// result
	public void findLength() {
		int length = 0;
		int code = 0;
		int codeTemp = 0;
		int lengthTemp = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (codeTemp == arr.get(i)) {
				lengthTemp++;
				if (lengthTemp > length) {
					code = codeTemp;
					length = lengthTemp;
				}
			} else {
				codeTemp = arr.get(i);
				lengthTemp = 0;
			}
		}

		code = codeToNumb(code);
		System.out.println("Integer: " + code);
		System.out.println("Length: " + length);
		System.exit(0);
	}

	// Convert from keyCode to correct numeric value
	public int codeToNumb(int _code) {
		if (_code == 49)
			return 1;
		else if (_code == 50)
			return 2;
		else if (_code == 51)
			return 3;
		else if (_code == 52)
			return 4;
		else if (_code == 53)
			return 5;
		else if (_code == 54)
			return 6;
		else if (_code == 55)
			return 7;
		else if (_code == 56)
			return 8;
		else if (_code == 57)
			return 9;
		else
			return 0;
	}

	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent k) {
			int keyCode = k.getKeyCode();
			if (keyCode == 48)
				findLength();
			else if (48 < keyCode && keyCode < 58)
				arr.add(keyCode);
			label.setText(arr.toString());
		}
	}

}
