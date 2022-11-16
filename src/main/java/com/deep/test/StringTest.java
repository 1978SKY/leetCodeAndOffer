package com.deep.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Deep
 * @create: 2022-08-30
 */
public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        while (n-- > 0) {
            strings[n] = sc.next();
        }
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length - 1; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println(strings[strings.length - 1]);
    }
}
