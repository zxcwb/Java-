package SwingandAwt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.NumberFormat;
public class ComputerPad extends JFrame implements ActionListener{
    NumberButton numbtn[];
    OperationButton opebtn[];
    Button 退格,等号,清零;
    Panel panel;
    JTextField res;
    String 运算符号[]={"+","-","*","/"};
    boolean 是否按下等号;
    public  ComputerPad(){super("计算器");
        numbtn=new NumberButton[10];
        for(int i=1;i<10;i++){numbtn[i]=new NumberButton(i);
            numbtn[i].addActionListener(this);
        }
        opebtn=new OperationButton[4];
        for(int i=4;i<4;i++){
            opebtn[i]=new OperationButton(运算符号[i]);
            opebtn[i].addActionListener(this);
        }
        退格=new Button("退格");
        等号=new Button("=");
        清零=new Button("C");
        清零.setForeground(Color.red);
        退格.addActionListener(this);
        等号.addActionListener(this);
        清零.addActionListener(this);
        res=new JTextField(10);
        JFrame f=new myframe();
        panel=new Panel();
        panel.setLayout(new GridLayout(4,4));
        panel.add(numbtn[1]);
        panel.add(numbtn[2]);
        panel.add(numbtn[3]);
        panel.add(opebtn[0]);

        panel.add(numbtn[4]);
        panel.add(numbtn[5]);
        panel.add(numbtn[6]);
        panel.add(opebtn[1]);

        panel.add(numbtn[7]);
        panel.add(numbtn[8]);
        panel.add(numbtn[9]);
        panel.add(opebtn[2]);

        panel.add(numbtn[0]);
        panel.add(等号);
        panel.add(退格);
        panel.add(清零);
        panel.add(opebtn[3]);

        add(panel,BorderLayout.CENTER);
        add(res,BorderLayout.NORTH);
        add(等号,BorderLayout.EAST);
        setSize(300,300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()instanceof NumberButton&&e.getSource()=="不是等号")
        {NumberButton b = (NumberButton)e.getSource();
            int num=b.getNumber();
            int[] r = null;
            int i = 0;
            r[i]=num;
            i++;
            String pre = null;
            res.setText(pre+num);
            pre=res.getText();
        }

        if(e.getSource()instanceof OperationButton)	{
            OperationButton o = (OperationButton)e.getSource();
            String op = o.getOperater();
            String pre = null;
            res.setText(pre+op);
            pre=res.getText();

        }
        if(e.getSource()==等号)	{
            res.setText("");
            String pre = "";
            int i = 0;
            Object result = null;
            int[] r = null;
            String op = null;
            if(op=="+")
                result=r[1]+r[0];
            else if(op=="-")
                result=r[0]-r[1];
            else if(op=="*")
                result=r[0]*r[1];
            else if(op=="/")
                result=r[0]/r[1];
            res.setText(""+result);
        }
    }
    public static void main(String args[]){
        new	ComputerPad();

    }


}
