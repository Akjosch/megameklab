/*
 * MegaMekLab - Copyright (C) 2012
 *
 * Original author - jtighe (torren@users.sourceforge.net)
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */

package megameklab.com.ui.Mek.Printing;

import java.awt.*;
import java.awt.geom.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip">SVGRoundTrip</a>.
 */
public class Armor_Head_2_Humanoid {
    /**
     * Paints the transcoded SVG image on the specified graphics context. You
     * can install a custom transformation on the graphics context to scale the
     * image.
     * 
     * @param g 
     *            Graphics context.
     */
    public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;
        
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
        Shape clip_ = g.getClip();
AffineTransform defaultTransform_ = g.getTransform();
//  is CompositeGraphicsNode
float alpha__0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0 = g.getClip();
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
clip = new Area(g.getClip());
clip.intersect(new Area(new Rectangle2D.Double(0.0,0.0,612.0,792.0)));
g.setClip(clip);
// _0 is CompositeGraphicsNode
float alpha__0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0 = g.getClip();
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0 is CompositeGraphicsNode
float alpha__0_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0 is ShapeNode
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(491.475, 87.631);
((GeneralPath)shape).curveTo(492.76102, 87.631, 493.72702, 88.676994, 493.72702, 89.965996);
((GeneralPath)shape).curveTo(493.72702, 91.173, 492.76102, 92.218994, 491.475, 92.218994);
((GeneralPath)shape).curveTo(490.186, 92.218994, 489.21802, 91.173, 489.21802, 89.965996);
((GeneralPath)shape).curveTo(489.218, 88.677, 490.186, 87.631, 491.475, 87.631);
((GeneralPath)shape).lineTo(491.475, 87.631);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.504f,0,0,2.4142f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(491.475, 87.631);
((GeneralPath)shape).curveTo(492.76102, 87.631, 493.72702, 88.676994, 493.72702, 89.965996);
((GeneralPath)shape).curveTo(493.72702, 91.173, 492.76102, 92.218994, 491.475, 92.218994);
((GeneralPath)shape).curveTo(490.186, 92.218994, 489.21802, 91.173, 489.21802, 89.965996);
((GeneralPath)shape).curveTo(489.218, 88.677, 490.186, 87.631, 491.475, 87.631);
((GeneralPath)shape).lineTo(491.475, 87.631);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_0;
g.setTransform(defaultTransform__0_0_0);
g.setClip(clip__0_0_0);
float alpha__0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1 is ShapeNode
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(491.432, 73.144);
((GeneralPath)shape).curveTo(492.72, 73.144, 493.76602, 74.189995, 493.76602, 75.397995);
((GeneralPath)shape).curveTo(493.76602, 76.686, 492.72003, 77.65099, 491.432, 77.65099);
((GeneralPath)shape).curveTo(490.225, 77.65099, 489.17902, 76.686, 489.17902, 75.397995);
((GeneralPath)shape).curveTo(489.179, 74.19, 490.225, 73.144, 491.432, 73.144);
((GeneralPath)shape).lineTo(491.432, 73.144);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.504f,0,0,2.4142f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(491.432, 73.144);
((GeneralPath)shape).curveTo(492.72, 73.144, 493.76602, 74.189995, 493.76602, 75.397995);
((GeneralPath)shape).curveTo(493.76602, 76.686, 492.72003, 77.65099, 491.432, 77.65099);
((GeneralPath)shape).curveTo(490.225, 77.65099, 489.17902, 76.686, 489.17902, 75.397995);
((GeneralPath)shape).curveTo(489.179, 74.19, 490.225, 73.144, 491.432, 73.144);
((GeneralPath)shape).lineTo(491.432, 73.144);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1;
g.setTransform(defaultTransform__0_0_1);
g.setClip(clip__0_0_1);
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
origAlpha = alpha__0;
g.setTransform(defaultTransform__0);
g.setClip(clip__0);
g.setTransform(defaultTransform_);
g.setClip(clip_);

    }

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 489;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 73;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public static int getOrigWidth() {
        return 612;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 792;
    }
}
