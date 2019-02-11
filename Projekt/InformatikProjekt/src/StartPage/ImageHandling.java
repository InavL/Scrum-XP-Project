/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author atb19
 */
public class ImageHandling {
    
    public ImageHandling() {
        
         int id = LoggedUser.getID();
         
    }
    
    public static void showImage(String IMG_PATH, JLabel imageLabel, JPanel bottomPanel, int x, int y) {
        
        try {
            
            BufferedImage img = ImageIO.read(new File(IMG_PATH));
            
            BufferedImage thumbnail = Thumbnails.of(img)
                    .size(x, y)
                    .asBufferedImage();
            
            ImageIcon icon = new ImageIcon(thumbnail);
            imageLabel.setIcon(icon);
            bottomPanel.repaint();
            bottomPanel.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        String bid = id.trim();
//
//        ImageHandling.showImage("src\\images\\" + bid + "\\funkar.png", txtImage, jPanel1, 450, 470);
//        taBlogFeed.setText(rL);

    }
}
