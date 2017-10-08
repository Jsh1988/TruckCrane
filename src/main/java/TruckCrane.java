package main.java;

public class TruckCrane {

    //через рекурсию
    //высота башни //с какой машины плиты // на какую // вспомогательная машина
    public static void hanoi_Tower(int n, int src, int dest, int temp){
        if(n == 0) return;
        hanoi_Tower(n - 1, src, temp, dest);
        System.out.println("с какой машины плиты = " + src + " -> на какую = " + dest + " вспомогательная машина =" + temp);
        hanoi_Tower(n - 1, temp, dest, src);
    }

    public static void main(String[] args) {
        hanoi_Tower(8,1,2,3);
    }
}