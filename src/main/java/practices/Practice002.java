package main.java.practices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 正の整数値を入力し、それが偶数か判定する関数 isOdd を作成しなさい
 */

public class Practice002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してくれたら偶数か奇数か教えてあげます：");
        try {
            int n = scanner.nextInt();
            if (n > 0) {
                if(isOdd(n)){
                    System.out.println("これは偶数みたい");
                }else{
                    System.out.println("これは奇数みたい");
                }
            } else {
                System.out.println("正の数を入力してくれないと困る");
            }
        }catch (InputMismatchException e) {
            System.out.println("正の整数値じゃないとダメです");
        }

    }

    // 偶数判定
    public static boolean isOdd(int n) {
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

}
