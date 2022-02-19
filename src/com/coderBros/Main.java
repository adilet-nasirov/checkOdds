package com.coderBros;

public class Main {

    public static void main(String[] args) {
//	    var find= new FindOdd();
//        int odd=find.findIt(new int[]{1,2,1,2,3});
//        System.out.println(odd);
        System.out.println(GetSum(4,-3));
   // 5+4+3+2+1
    }
    public static int GetSum(int a, int b) {
        int n= Math.abs(a-b)+1;
        return n*(a+b)/2;
        }

}
