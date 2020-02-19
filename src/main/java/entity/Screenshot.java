package entity;

import Interface.IImage;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Screenshot implements IImage {

    private BufferedImage image;
    private int matrixImage[][];


    private void CreateMatrixImage(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        this.matrixImage = new int[width][height];
        for (int y = 0; y< height; y++)
        {
            this.matrixImage[y] = this.image.getRGB(0,y,width,1,null,0,width);
        }
    }

    public Screenshot() {
        try {
            this.image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            CreateMatrixImage(this.image);
        } catch (SecurityException e) {
        } catch (AWTException e) {
        }
        this.image = null;
    }

    public Screenshot(Rectangle rectangle) {
        try {
            this.image = new Robot().createScreenCapture(rectangle);
            CreateMatrixImage(this.image);
        } catch (SecurityException e) {
        } catch (AWTException e) {
        }
        this.image = null;

    }
    @Override
    public BufferedImage getImage() {
        return image;
    }

    @Override
    public int[][] getMatrixImage() {
        return matrixImage;
    }
}
