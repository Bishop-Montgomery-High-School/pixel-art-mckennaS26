import java.awt.Color;
import java.awt.Graphics2D;

public class Pixel {
    private int x;
    private int y;
    private int size;
    private Color color;

    public Pixel(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillRect(x, y, size, size);
    }
}
