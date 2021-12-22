package main;

import java.awt.Graphics;

public class MyThread extends Thread {
    
	Graphics g;
	MyList ml;
	
	public MyThread(MyList ml) {
		this.ml = ml;
	}

	public void run() {
		 for (long i=0;i<Long.MAX_VALUE;i++) {
			 try {
					this.sleep(1000);
				} catch (InterruptedException e) {}
				ml.mdb.remplirTab(ml.model);

		 } 
	}
	
	
	
}
