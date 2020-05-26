package com.company.carapp.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QueenApp {

    /* Java program to solve N Queen Problem using
   backtracking */
    public class NQueenProblem {

        final int N = 8;


        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        List<String> syncCollectionList = Collections.synchronizedList(Arrays.asList("a", "b", "c"));


        /* A utility function to print solution */
        void printSolution(int board[][]) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(" " + board[i][j]
                        + " ");
                }
                System.out.println();
            }
        }

        /* A utility function to check if a queen can
           be placed on board[row][col]. Note that this
           function is called when "col" queens are already
           placeed in columns from 0 to col -1. So we need
           to check only left side for attacking queens */
        boolean isSafe(int board[][], int row, int col) {
            int i, j;

            for (j = col; j >= 0; j--) {
                if (board[row][j] == 1) {
                    return false;
                }
            }
            for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }
            for (i = row, j = col; i < N && j >= 0; i++, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }
            return true;
        }

        boolean solveNQUtil(int board[][], int col) {
            if (col >= N) {
                return true;
            }

            for (int i = 0; i < N; i++) {
                if (isSafe(board, i, col)) {
                    board[i][col] = 1;
                    if (solveNQUtil(board, col + 1) == true) {
                        return true;
                    }
                    board[i][col] = 0;
                }
            }

            return false;
        }

        boolean solveNQ() {
            int board[][] = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}};

            if (solveNQUtil(board, 0) == false) {
                System.out.print("Solution does not exist");
                return false;
            }

            printSolution(board);
            return true;
        }

    }

    // driver program to test above function
    public static void main(String args[]) {
        QueenApp app = new QueenApp();
        NQueenProblem Queen = app.new NQueenProblem();
        Queen.solveNQ();
    }

}
