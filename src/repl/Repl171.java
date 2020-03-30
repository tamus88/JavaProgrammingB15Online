package repl;

import java.util.Arrays;

public class Repl171 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        String[] last = chessBoard[chessBoard.length-1];
       // chessBoard[0][0]= ["1a"]["1a"];

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
    }
//    So first element in the array, chessboard[0][0] should have a
//        value "1a", and last element in the array,
//        chessboard[7][7] should have a value "8h".


