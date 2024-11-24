package org.example.problem.easy;

public class PortlateMode {

    public static void main(String[] args) {
        System.out.println(screenViewMode(200,150));
        System.out.println(screenViewMode(150,150));
        System.out.println(screenViewMode(100,150));
    }

    public static String screenViewMode(int height, int width){
        return (height >= width) ? "portrait" : "landscape";
    }
}
