package entity;

import Interface.IImage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Screenshot implements IImage {

    BufferedImage image;
    ArrayList matrixImage;

    @Override
    public void CreateMatrixImage(BufferedImage image) {

    }

    public Screenshot() {
        try {
            this.image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (SecurityException e) {
        } catch (AWTException e) {
        }
        this.image = null;
    }

    public Screenshot(Rectangle rectangle) {
        try {
            this.image = new Robot().createScreenCapture(rectangle);
        } catch (SecurityException e) {
        } catch (AWTException e) {
        }
        this.image = null;

    }
}
