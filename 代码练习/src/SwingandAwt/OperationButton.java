package SwingandAwt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class OperationButton  extends Button{
    String operater;
    public OperationButton (String s){
        operater=s;
        setForeground(Color.red);}
    public String getOperater(){
        return operater;
    }

}