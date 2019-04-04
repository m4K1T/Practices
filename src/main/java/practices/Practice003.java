package main.java.practices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 整数値を入力し、以下の4つの分類から該当するものを表示する関数 displayText を作成しなさい
 * <p>
 * 引数：整数
 * 返却：以下の4つの文字列のいずれか
 * 正の偶数
 * 正の奇数
 * 負の偶数
 * 負の奇数
 * <p>
 * ※ 負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 0 は 正の偶数 であるとする。
 */

public class Practice003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数値を入力してください：");
        try {
            int n = scanner.nextInt();
            System.out.println("入力されたのは" + displayText(n) + "です。");
        } catch (InputMismatchException e) {
            System.out.println("整数値を入力してくれないとダメです");
        }

    }

    // 正の偶数、正の奇数、負の偶数、負の奇数のいずれかを返却する
    public static String displayText(int n) {
        String returnText;

        //正負判定
        if (n >= 0) {
            returnText = "正の";
        } else {
            returnText = "負の";
        }

        //偶奇判定
        if (n % 2 == 0) {
            returnText += "偶数";
        } else {
            returnText += "奇数";
        }

        return returnText;
    }

}
