package strutturali.bridge.start;

import java.awt.Color;
import java.awt.Graphics;

public class BlueTriangle extends Triangle {

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		super.draw(graphics);
	}
}
