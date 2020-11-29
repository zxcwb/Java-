package 线程与Swing相结合创建GUI程序;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    private JLabel jl = new JLabel();//声明JLabel对象
    private static Thread t;//声明线程对象
    private int count = 0;//声明计数变量
    private Container container = getContentPane();//声明容器

    public SwingAndThread(){
        setBounds(300,200,250,100);//绝对定位窗口大小位置
        container.setLayout(null);//使窗体不使用任何布局管理器
        URL url = SwingAndThread.class.getResource("");
    }
}
