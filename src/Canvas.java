import javax.swing.JPanel;
import java.awt.*;

public class Canvas extends JPanel {

    private int[][] grid;
    private int pixelSize;

    public Canvas(int[][] grid, int pixelSize) {
        this.grid = grid;
        this.pixelSize = pixelSize;
    }

    @Override
    public Dimension getPreferredSize() {
        int width  = grid[0].length * pixelSize; // columns
        int height = grid.length * pixelSize;    // rows
        return new Dimension(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Color color = mapColor(grid[row][col]);

                Pixel p = new Pixel(
                        col * pixelSize,
                        row * pixelSize,
                        pixelSize,
                        color
                );
                p.draw(g2);
            }
        }
    }

    private Color mapColor(int value) {
        switch (value) {
            case 1: return Color.BLACK;
            case 2: return Color.RED;
            case 3: return Color.BLUE;
            case 4: return Color.GREEN;
            default: return Color.WHITE;
        }
    }
}
