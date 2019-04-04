package main.java.practices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * int 型の変数 x、y にそれぞれ数値を入力し
 * <p>
 * - 和
 * - 差（x－y）
 * - 積
 * - 商
 * - 余り(x÷y)
 * <p>
 * を求める関数をそれぞれ作成しなさい
 */

public class Practice001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("xの値を入力してください：");
            int x = scanner.nextInt();
            System.out.print("yの値を入力してください：");
            int y = scanner.nextInt();

            //和を出力する
            print("和", wa(x, y));

            //差を出力する
            print("差", sa(x, y));

            //積を出力する
            print("積", seki(x, y));

            //0除算はできない
            if (y != 0) {
                //商を出力する
                print("商", sho(x, y));

                //余りを出力する
                print("余り", amari(x, y));
            } else {
                System.out.println("0除算はできないので商と余りはやりません");
            }

        } catch (InputMismatchException e) {
            System.out.println("数字（整数）を入力してくれないと困ります");
        }

    }

    // 和
    public static int wa(int x, int y) {
        return x + y;
    }

    // 差
    public static int sa(int x, int y) {
        return x - y;
    }

    // 積
    public static int seki(int x, int y) {
        return x * y;
    }

    // 商
    public static int sho(int x, int y) {
        return x / y;
    }

    // 余り
    public static int amari(int x, int y) {
        return x % y;
    }

    // 出力する
    public static void print(String text, int result) {
        System.out.println(text + "の結果は【" + result + "】です");
    }
}
