package java1.ch12스레드;

import java.awt.Toolkit;

public class BeepThread extends Thread{

		@Override
		public void run() {
			Toolkit toolkit =Toolkit.getDefaultToolkit(); // Toolkit : console ui 제공 
			for( int i= 0; i<10; i++) {
			toolkit.beep(); 
			try {Thread.sleep(500);}
			catch (Exception e) {}
			}	
		}
		}

