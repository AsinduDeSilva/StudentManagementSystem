package com.icet.sms.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class common extends JFrame{
    public common() {
        setResizable(false);
    } 
    
    public void setImageTo(JLabel imgLabel){
        ImageIcon img=new ImageIcon(getClass().getResource("/resources/image.jpg"));
        Image image=img.getImage();
        Image imgScale=image.getScaledInstance(imgLabel.getWidth(),imgLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImg=new ImageIcon(imgScale);
        imgLabel.setIcon(scaledImg);    
    }
    public boolean isValidId(String id){
        if(id.length()!=5 || id.charAt(0)!='S'){
            return false;
        }
        for(int i=1; i<5; i++){
            if(id.charAt(i)<48 || id.charAt(i)>57){
                return false;
            }
        }
        return true;
    }
    
}
