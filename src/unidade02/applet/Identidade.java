package unidade02.applet;

import javax.swing.JApplet;

public class Identidade extends JApplet {
	
	@Override
	public void init() {
		int I[][] = new int[3][3];
		for (int j = 0; j < I.length; j++) {
			for (int j2 = 0; j2 < I.length; j2++) {
				if (j == j2)
					I[j][j2] = 1;
				else
					I[j][j2] = 0;
				System.out.print(I[j][j2]);				
			}
			System.out.println("\n=====================");
		}
	}

}
