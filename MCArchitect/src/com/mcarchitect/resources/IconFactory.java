package com.mcarchitect.resources;

import java.net.URL;

import javax.swing.ImageIcon;

public class IconFactory {

    public static ImageIcon OPEN_16 = createIcon("open_16.png", "Open");
    public static ImageIcon OPEN_32 = createIcon("open_32.png", "Open");

    public static ImageIcon TURN_CW_32 = createIcon("turn_cw_32.png", "Turn clock-wise");
    public static ImageIcon TURN_CCW_32 = createIcon("turn_ccw_32.png", "Turn counter clock-wise");

    public static ImageIcon ZOOM_IN_32 = createIcon("zoom_in_32.png", "Zoom In");
    public static ImageIcon ZOOM_OUT_32 = createIcon("zoom_out_32.png", "Zoom Out");

    public static ImageIcon createIcon(String imageName, String description) {
        URL imgUrl = IconFactory.class.getResource("/resources/icons/" + imageName);

        return new ImageIcon(imgUrl, description);
    }

}
