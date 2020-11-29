package 题目练习.第四章流程控制;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        // 判断输入数字是奇数或偶数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"是奇数");
        }
    }
}
