package com.exercises;

public class PrintTable {
    public static void main(String[] args) {
        System.out.printf("%1$-7s%2$-7s%3$-7s%4$-7s \n", "a", "a^2", "a^3", "a^4");
        System.out.printf("%1$-7d%2$-7d%3$-7s%4$-7d \n", 1, 1, 1, 1);
        System.out.printf("%1$-7d%2$-7d%3$-7s%4$-7d \n", 2, 4, 8, 16);
        System.out.printf("%1$-7d%2$-7d%3$-7s%4$-7d \n", 3, 9, 27, 81);
        System.out.printf("%1$-7d%2$-7d%3$-7s%4$-7d \n", 4, 16, 64, 256);
    }
}
