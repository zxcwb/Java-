package SwingandAwt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class NumberButton  extends Button{
    int number;
    public NumberButton(int number){
        super(""+number);
        this.number=number;
        setForeground(Color.blue);}
    public int getNumber(){
        return number;
    }
}