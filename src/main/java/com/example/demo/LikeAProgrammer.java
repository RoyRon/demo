package com.example.demo;

public class LikeAProgrammer {
    public static void _2_3() {
        for (int row = 1; row <= 4; row++) {
            for (int i = 1; i <= 14; i++) {
                if (i < 8) {
                    if (i < row || i > 2 * row - 1)
                        System.out.print(" ");
                    else {
                        System.out.print("#");
                    }
                }else{
                    if (i < 16 - 2 * row || i > 15 - row)
                        System.out.print(" ");
                    else {
                        System.out.print("#");
                    }
                }
            }
            System.out.print("\n");
        }
//        for (int row = 1; row <= 4; row++) {
//            for (int i = 8; i <= 14; i++) {
//                if (i < 16 - 2 * row || i > 15 - row)
//                    System.out.print(" ");
//                else {
//                    System.out.print("#");
//                }
//            }
//            System.out.print("\n");
//        }
    }

    public static void main(String[] args) {
        _2_3();
    }
}