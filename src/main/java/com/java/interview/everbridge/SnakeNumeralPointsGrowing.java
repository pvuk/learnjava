package com.java.interview.everbridge;

import java.util.Scanner;

public class SnakeNumeralPointsGrowing {

		public static void main(String[] args) {
			System.out.println("Please enter number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int sqrt = num * num;
			int arr[][] = new int[num][num];//array initialization
			int arrNum = 0;
			int indexTop = 0, indexRight = 0, indexBottom = 0, indexLeft = 0;
			//assign values into 2D array
//			for(int i = 0; i < arr[0].length; i++) {
//				for(int j = 0; j < arr[i].length; j++) {
//					arrNum++;
//					arr[i][j] = arrNum;
//				}
//			}
			
			for(int i = 0; i < sqrt; i++) {
				// for loop (labeled "topSearch")
				//arr.length first dimension
				topSearch: for(int tRow = 0; tRow < arr.length; tRow++) {
					
					while(indexTop < arr.length) {
						arrNum++;
						arr[tRow][indexTop] = arrNum;
						indexTop++;
					}
					indexTop = indexTop - 1;//decreasing 'top row length' count for next iteration
					
					
					int rRowCount = tRow;
					//arr[tRow].length - second dimension
					indexRight = indexRight == 0 ? (arr[tRow].length - 1) : indexRight;//indexing to 'right column' position
//					rightSearch: for(int rColumn = arr[tRow].length - 1; rColumn >= 0; rColumn--) {
						
						int rColumnCount = indexRight;
						while(rColumnCount > 0) {
							arrNum++;
							rRowCount++;
							arr[rRowCount][indexRight] = arrNum;
							rColumnCount--;
						}
						indexRight = indexRight - 1;//decreasing 'right column length' count for next iteration
						
						
//						bottomSearch: for(int bRow = arr[tRow].length - 1; bRow >= 0; bRow--) {
							
							indexBottom = indexRight;
							int bColumnCount = indexRight;
							while(bColumnCount >= 0) {
								arrNum++;
								arr[rRowCount][bColumnCount] = arrNum;
								bColumnCount--;
							}
//							indexBottom = indexBottom - 1;
							
//							leftSearch: for(int lColumn = arr[rColumn].length; lColumn < arr[tRow].length; lColumn--) {
								
								indexLeft = indexBottom;
								int lRowCount = indexLeft;
								while(indexLeft != 1) {
									arrNum++;
									lRowCount--;
									arr[lRowCount][indexLeft] = arrNum;
								}
								
								continue topSearch;
								
//							}
							
//						}
						
//					}
					
				}
				
			}
			
			for (int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			sc.close();
		}
}
