package sketchpad;

import buttons.*;
import tools.*;

public class SketchPad {
  private final Screen screen = new Screen();
  private final MouseInfo mouseInfo = new MouseInfo();
  private final PaintingTool paint = new PaintingTool();
  private int lastMouseX;
  private int lastMouseY;

  public void initialLaunch() {
    screen.setBackgroundColor(Color.YELLOW);
    paint.setFillColor(Color.RED);
    paint.drawCircle(0, 0, 50);
    paint.setFillColor(Color.RED);
    paint.drawCircle(0, 400, 50);
    paint.setFillColor(Color.RED);
    paint.drawCircle(600, 0, 50);
    paint.setFillColor(Color.RED);
    paint.drawCircle(600, 400, 50);
    paint.setFillColor(Color.WHITE);
    paint.drawRect(40, 35, 520, 330);

  }

  public void update() {
    paint.setLineColor(Generator.randomInt(256),
        Generator.randomInt(256),
        Generator.randomInt(256));
    paint.drawLine(mouseInfo.getX(),
        mouseInfo.getY(),
        lastMouseX,
        lastMouseY);
    lastMouseX = mouseInfo.getX();
    lastMouseY = mouseInfo.getY();
    screen.getHeight();

  }
}
