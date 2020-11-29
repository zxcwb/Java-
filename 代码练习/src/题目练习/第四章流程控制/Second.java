package 题目练习.第四章流程控制;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
//        //打印菱形
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入菱形大小");
//        int size = scanner.nextInt();
//        for (int i = size+2;)
        draw2(4);

    }

    public static void draw2(int size){
        if (size % 2 == 0)
        {
            size++;
        }

        for (int i = 0; i < size/2 + 1; i++)
        {
            for(int j =size/2+1;j>i+1;j--){//打印菱形空上角位置的空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++)//打印菱形的上半部分
            {
                if (j==0||j==2*i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = size/2+1; i < size; i++)//打印菱形的下半部分
        {
            for (int j = 0; j < i - size/2; j++)//打印左下角的空白
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * size -1-2*i; j++)
            {
                if (j==0||j==2*(size -i -1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
