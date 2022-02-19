package com.coderBros;

public class FindOdd {
    public static int findIt(int[] A) {
        int odd=0;
        for (int item: A){
            odd^= item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }
        return odd;
    }
}


//public class FindOdd {
//    public int findIt(int[] arr) {
//
//        for(int i=0; i<arr.length; i++){
//            int element=arr[i];
//            int count=0;
//            for(int j=0; j<arr.length; j++){
//                if(element== arr[j])
//                    count++;
//            }
//            if(count==0 || count%2!=0)
//                return element;
//        }
//        return 0;
//    }
//}