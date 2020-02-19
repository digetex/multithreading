import entity.Screenshot;

import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Screenshot screenshot = new Screenshot();
        int x = 0;
        int y = 0;
        for (int[] anArray : screenshot.getMatrixImage()) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
                x++;
                if(x == 100) {
                    x = 0;
                    break;
                }
            }
            y++;
            if(y==100)
                break;
        }
        System.out.println("==============================================");
        Screenshot screenshot1 = new Screenshot(new Rectangle(100,100));
        for (int[] anArray : screenshot1.getMatrixImage()) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
        }
    }
}
