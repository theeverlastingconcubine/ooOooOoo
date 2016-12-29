import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class DrawingComponent extends JComponent {

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		for (int i = 0; i < Test.vectors.length; i++) {
			Line2D.Double line = new Line2D.Double(300, 300, Test.vectors[i].xcoord(), Test.vectors[i].ycoord());
			g2.draw(line);
		}

	}

}
