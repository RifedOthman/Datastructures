package Leetcode1528;
public class Main {
    public static void main(String[] args) {
        ShuffleString obj = new ShuffleString();

        String s = "EDOC";
        int[] indices = {3, 2, 1, 0};

        String result = obj.solution(s, indices);

        System.out.println("Result: " + result);

    }
}