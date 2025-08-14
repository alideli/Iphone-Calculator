/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI_Custom;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ali
 */
public class RoundButton extends JButton {
    
    public RoundButton() {
    this("");
    }
    
    public RoundButton(String text){
        super(text);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
    }
    @Override
    
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setFont(getFont());
        FontMetrics fm = g2d.getFontMetrics();
        int stringWidth = fm.stringWidth(getText());
        int stringHeight = fm.getAscent();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillOval(0, 0, getWidth(), getHeight());
        g2d.setColor(getForeground());
        g2d.drawString(getText(), (getWidth() - stringWidth) / 2, (getHeight() + stringHeight) / 2 - 2);
        
        Icon icon = getIcon();
        if(icon != null){
            int x = (getWidth() - icon.getIconWidth()) / 2;
            int y = (getHeight() - icon.getIconHeight()) / 2;
            icon.paintIcon(this, g2d, x, y);
        }
        
        g2d.dispose();
//        super.paintComponent(g);
    }
    
//    @Override
//    protected void paintBorder(Graphics g){
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.drawOval(0, 0, getWidth(), getHeight() - 1);
//        
//        g2d.dispose();
//    }
    @Override
    public Dimension getPreferredSize(){
        Dimension size = super.getPreferredSize();
        int diameter = Math.max(size.width, size.height);
        return new Dimension(diameter, diameter);
    }
}
