package sudoku;

import java.util.*;

public class SudokuDriver {
	public static void main(String[] args ) {
		/*int[][] puzzle = {	{0,0,0,7,0,0,0,9,0},
							{0,0,9,0,3,0,0,6,0},
							{8,0,0,6,0,0,4,3,2},
							{7,0,0,0,0,3,6,0,0},
							{0,2,0,0,7,0,0,5,0},
							{0,0,8,5,0,0,0,0,7},
							{9,8,1,0,0,7,0,0,6},
							{0,4,0,0,9,0,2,0,0},
							{0,6,0,0,0,5,0,0,0}};*/
		/*int[][] puzzle = {	{0,1,2,7,0,0,0,9,0},
							{7,6,3,0,0,0,0,6,0},
							{8,5,4,6,0,0,4,3,2},
							{7,0,0,0,0,3,6,0,0},
							{0,2,0,0,7,0,0,5,0},
							{0,0,8,5,0,0,0,0,7},
							{9,8,1,0,0,7,0,0,6},
							{0,4,0,0,9,0,2,0,0},
							{0,6,0,0,0,5,0,0,0}};*/
		/*int[][] puzzle = {	{0,0,0,7,0,0,0,9,0},
							{0,0,9,0,3,0,0,6,0},
							{8,0,0,6,0,0,4,3,2},
							{7,0,0,0,0,0,6,0,0},
							{0,2,0,0,7,0,0,5,0},
							{0,0,8,5,0,0,0,0,7},
							{9,8,1,0,0,0,0,0,6},
							{0,4,0,0,9,0,2,0,0},
							{0,6,0,0,0,0,0,0,0}};*/
		/*int[][] puzzle = {	{0,0,0,0,5,0,0,0,0},
							{9,0,6,0,0,0,3,0,7},
							{0,0,0,4,0,9,0,0,0},
							{0,1,0,0,0,0,0,5,0},
							{2,0,0,6,0,7,0,0,1},
							{0,4,0,0,0,0,0,9,0},
							{0,0,0,7,0,1,0,0,0},
							{7,0,9,0,0,0,2,0,6},
							{0,0,0,0,3,0,0,0,0}};*/
		int[][] puzzle0 = {	{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0}};
		int[][] puzzle1 = {	{2,0,0,0,0,0,0,0,0},
							{0,0,0,0,2,0,0,0,0},
							{0,0,0,0,0,0,2,0,0},
							{0,0,0,0,0,2,0,0,0},
							{0,0,2,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,2,0},
							{0,2,0,0,0,0,0,0,0},
							{0,0,0,2,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,2}};
		int[][] puzzle2 = {	{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,3,0,8,5},
							{0,0,1,0,2,0,0,0,0},
							{0,0,0,5,0,7,0,0,0},
							{0,0,4,0,0,0,1,0,0},
							{0,9,0,0,0,0,0,0,0},
							{5,0,0,0,0,0,0,7,3},
							{0,0,2,0,1,0,0,0,0},
							{0,0,0,0,4,0,0,0,9}};
		/*int[][] puzzle = {	{1,2,3,4,5,6,7,8,9},
							{4,5,6,1,2,7,3,3,3}, 
							{7,8,9,3,3,3,1,2,4}, 
							{2,3,1,5,4,8,6,9,7}, 
							{6,7,8,9,1,1,2,4,5}, 
							{5,9,4,6,7,2,8,1,8}, 
							{3,1,2,7,8,4,9,5,6}, 
							{3,6,5,2,8,9,4,7,1},
							{3,6,5,2,8,9,4,0,0}};*/
		
		//ArrayList<int[][]> test1 = new Solve(puzzle).getSolutions();
		//ArrayList<int[][]> test = Sudoku.solve(puzzle0,1);
		/*
		if (!test.isEmpty()) {
			for (int[][] solution : test) {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 9; j++) {
						System.out.print(solution[i][j] + ", ");
					}
					System.out.print("\n");
				}
				System.out.println("--------------------------");
			}
		}*/
		
		int[][] test = Sudoku.getRandomPuzzle();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(test[i][j] + ", ");
			}
			System.out.print("\n");
		}
		
	}
}