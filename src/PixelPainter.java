import javax.swing.JFrame;

public class PixelPainter {

    public static void main(String[] args) {
        int[][] picture = {
                {0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0},
                {0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0},
                {0,0,0,0,2,2,2,1,2,2,1,2,2,2,2,0,0,0,0,0},
                {0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0},
                {0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0},
                {0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0},
                {0,0,2,2,2,2,1,2,2,2,2,2,1,2,2,2,2,0,0,0},
                {0,0,0,2,2,2,2,1,2,2,2,1,2,2,2,2,0,0,0,0},
                {0,0,0,0,2,2,2,2,1,1,1,2,2,2,2,0,0,0,0,0},
                {0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };

        int pixelSize = 32;

        JFrame window = new JFrame("Pixel Art");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas canvas = new Canvas(picture, pixelSize);
        window.add(canvas);

        window.pack();          // sizes frame to match canvas preferred size
        window.setLocationByPlatform(true);
        window.setVisible(true);
    }
}
