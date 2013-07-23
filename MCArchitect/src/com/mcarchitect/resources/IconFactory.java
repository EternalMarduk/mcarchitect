package com.mcarchitect.resources;

import java.net.URL;

import javax.swing.ImageIcon;

public class IconFactory {

    public static ImageIcon TURN_CW = createIcon("turn_cw_32.png", "Turn clock-wise");
    public static ImageIcon TURN_CCW = createIcon("turn_ccw_32.png", "Turn counter clock-wise");

    public static ImageIcon createIcon(String imageName, String description) {
        URL imgUrl = IconFactory.class.getResource("/resources/icons/" + imageName);

        return new ImageIcon(imgUrl, description);
    }

}
