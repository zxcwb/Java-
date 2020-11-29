package SwingandAwt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class myframe extends JFrame implements ActionListener{
    int value=0;TextField l;
    public myframe(){super("统计单击的次数");
        Button b=new Button("单击");
        TextField l=new TextField("···0···");
        setLayout(new FlowLayout());add(b);add(l);
        b.addActionListener(this);//监听者落在了容器身上，在这里引入第二个包,应该编监听者的接口程序,红叉消失
    }
    public void actionPerformed(ActionEvent e){int value=0;value++;l.setText(""+value);
    }//e这个事件的类型是第二个包里的ActionEvent


    public static void main( String args[]){Button b=new Button("单击");
        JFrame f=new myframe();
        f.setSize(200,400);
        f.setVisible(true);
        f.add(b);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}