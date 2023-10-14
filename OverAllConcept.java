package collage;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class OverAllConcept {
//    public static void Counting(int []arr){
////        int max =0;
////        for (int val : arr){
////            max = Math.max(val,max);
////        }
////        System.out.println(max);
////
////        int []count = new int[max+1];
////
////        for(int val : arr){
////            count[val]++;
////        }
////        int j=0;
////        for (int i=0; i<count.length; i++){
////            while(count[i]>0){
////                arr[j] = i;
////                j++;
////                count[i]--;
////            }
////        }
////    }
//    static int count =0;
//    public static boolean issafe(char [][] board,int row,int col){
//        for(int i=row-1; i>=0; i--){
//            if(board[i][col] == 'Q'){
//                return false;
//            }
//        }
//        for (int i= row-1, j=col-1; j>=0 && i>=0; i--,j--){
//            if(board[i][j] == 'Q'){
//                return false;
//            }
//        }
//        for (int i=row-1,j= col+1; i>=0 && j<board.length; i--,j++){
//            if(board[i][j] == 'Q'){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void print(char[][] board){
//        for (int i=0; i<board.length; i++){
//            for (int j=0; j<board.length; j++){
//                System.out.print(board[i][j] + "  ");
//            }
//            System.out.println();
//        }

//        System.out.println();
//    }
//    public static void NQ(char [][] board,int row){
//        if(board.length == row){
//            print(board);
//            count++;
//            return;
//        }
//        for (int j=0; j<board.length; j++){
//            if (issafe(board,row,j)){
//                board[row][j] = 'Q';
//                NQ(board,row+1);
//                board[row][j] = 'x';
//            }
//        }
//    }
    public static void main(String[] args){
//        String name = "swapnil kadam";
//
//        boolean res = name instanceof String;
//
////        System.out.println(res);
//
//        int [] arr = {1,5,4,3,78};
//        Arrays.sort(arr,1,3);
//
//        for (int val : arr){
//            System.out.print(val+ " ");
//        }

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//       float ch =  Float.parseFloat(reader.readLine());
//
//        System.out.println(ch);
//        int val = Integer.parseInt(reader.readLine());
//
//        System.out.println(val);
//        int ream ,result =0;
//        while(val >0){
//            ream = val % 10;
//            result = result  + ream;
//            val = val /2;

//        }
//        System.out.println(result);
//        System.out.println(Integer.parseInt(reader.readLine())+Integer.parseInt(reader.readLine()));






//       int n = 4;
//        char [][] board = new char[n][n];
//     for (int i=0; i<board.length; i++){
//         for (int j=0; j<board.length; j++){
//             board[i][j] = 'x';
//         }
//     }
//    NQ(board,0);
//        System.out.println("Toatl Queue : "+count);
//
//       int a = 10;
//       int b = 12;
//
//       a = a + b;
//       b = a -b;
//       a = a - b;
//        System.out.println(a + " "+b);


//     for(int i='A'; i<='Z'; i++){
//         System.out.format("%d",i);
//         System.out.println();
//     }
//        ArrayList<Integer>  ll = new ArrayList<>();
//
//        ll.add(12);
//        ll.add(13);
//        ll.add(14);
//        ll.add(15);
//        int [] arr = {14,12,30,14,15,19};
//        ll.forEach((n)-> System.out.println(n));

//        Consumer<Integer> method = (n) -> System.out.println(n);
//        method.accept(12);
//        method.accept(13);
//        method.accept(14);
//        method.accept(15);




//     Counting(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println();



//        int num = 6;
//
//        for(int i=0; i<num; i++){
//            for(int j=0; j<num-i; j++){
//                System.out.print("   ");
//            }
//            for (int j=0; j<i; j++){
//                System.out.print(" * ");
//            }
//            for (int j=1; j<i; j++){
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }
//        for (int i=0; i<num; i++){
//            for (int j=0; j<i; j++){
//                System.out.print("   ");
//            }
//            for (int j=0; j<num-i; j++){
//                System.out.print(" * ");
//            }
//            for (int j=1; j<num-i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }

//
//        int [][]  arr = {{1,2,3},{3,4,5},{7,8,9}};

//
//        System.out.println("A :"+ Arrays.deepToString(arr));
//        System.out.println(0);
//
//        int num1 = 100;
//        int num2 = 300;;
//
//        num1 = num1 * num2;
//        num2 = num1 / num2;
//        num1 = num1 / num2;
//     num1 = num1 + num2 -  (num2 = num1);
//        System.out.println(num1 + " "+num2);
/*
        String name ="Rohan laxman sur";
        String temp1 = "";
        System.out.print(name.charAt(0));
        boolean c = false;;
        char temp = '0';
        name += name.charAt(0);
        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (ch == ' ') {
                if(c == true){
                    System.out.print("."+temp);
                }
                temp1 = "";
                c = true;
                 temp = name.charAt(i+1);

            }else{

                if(i != name.length()-1){
                    temp1 += name.charAt(i);
                }
            }
        }
       // System.out.println();
//        System.out.print("."+temp1);
/
        */
//
//        String name = "swapnil kadam";
//        char [] ch = name.toCharArray();
//        for (int i=0; i<name.length(); i++){
//            System.out.println(ch[i] + "   "+ ch[name.length()-i-1]);
//        }


//                String name = "shree swapnil keda kadam";
//
//                String[] str = name.split(" ");
//
//                System.out.print(str[0].charAt(0) + "." + str[1].charAt(0) + "." + str[2].substring(0,1).toUpperCase() + str[2].substring(1));


        System.out.println();

        for (int i=0; i<100; i++){
            System.out.println((int) (Math.random()*32)+1);
        }
    }

}
