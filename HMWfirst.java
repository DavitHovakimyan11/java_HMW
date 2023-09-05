public class HMWfirst {
	public static void main(String[] args) {
		// Task1

		// int[][] mymatrix = {
		// 	{8, 9, 2},
		// 	{10, 3, 5},
		// 	{36, 14, 32},
		// 	{1 ,7, 3}
		// };

		// int mymax = mymatrix[0][0];

		// for (int i = 0; i < mymatrix.length; ++i) {
		// 	for (int j = 0; j < mymatrix[0].length; ++j) {

		// 		if (mymatrix[i][j] > mymax) {
		// 			mymax = mymatrix[i][j];

		// 		}
		// 	}
		// }
		// System.out.println(mymax);



		// Task2

		// int[][] mymatrix = {
		// 	{8, 9, 2},
		// 	{10, 3, 5},
		// 	{36, 14, 32},
		// 	{1 ,7, 3}
		// };

		// int mymin = mymatrix[0][0];
		// int minrow = 0;
		// int mincolumn = 0;

		// for (int i = 0; i < mymatrix.length; ++i) {
		// 	for (int j = 0; j < mymatrix[0].length; ++j) {
				
		// 		if (mymatrix[i][j] < mymin) {
		// 			mymin = mymatrix[i][j];
		// 			minrow = i;
		// 			mincolumn = j;

		// 		}
		// 	}
		// }

		// System.out.println("row is " + minrow + " and column is " + mincolumn);


		// Task3

		// Task4

		// int size = 3;
		// int[][] mymatrix = {
		// 	{8, 9, 2},
		// 	{10, 3, 5},
		// 	{36, 14, 32}
		// };

		// for (int i = 0; i < size; ++i) {
		// 	for(int j = 0; j < size; ++j) {
		// 		if (i == j || i + j == size - 1) {
		// 			mymatrix[i][j] = 0;
		// 		}

		// 		System.out.print(mymatrix[i][j] + " ");

		// 	}
		// 	System.out.println();
		// }


		// Task5

		// int[][] mymatrix = {
		// 	{8, 9, 2},
		// 	{10, 3, 5},
		// 	{36, 14, 32}
		// };

		// int sum = 0;

		// for (int i = 0; i < mymatrix.length; ++i) {
		// 	for (int j = 0; j < mymatrix[0].length; ++j) {

		// 		if (j < i) {
		// 			sum += mymatrix[i][j];
		// 		}

		// 	}
		// }

		// System.out.println(sum);



		// Task6

		// int[][] mymatrix = {
		// 	{8, 9, 2},
		// 	{10, 3, 5},
		// 	{36, 14, 32}
		// };

		// int row = mymatrix.length;
		// int column = mymatrix[0].length;
		// int sizearr = row * column;
		// int arrind = 0;

		// int[] myarray = new int[sizearr];


		// for (int i = 0; i < row; ++i) {
		// 	for (int j = 0; j < column; ++j) {

		// 		myarray[arrind] = mymatrix[i][j];
		// 		System.out.print(myarray[arrind] + " ");
		// 		arrind += 1;
		// }
		// 	}
		

	// Task7
        // int[][] mymatrix = {
        //     {8, 9, 2},
        //     {10, 3, 5},
        //     {36, 14, 32}
        // };

        // int size = mymatrix.length;
        // int[] main = new int[size];
        // int[] aux = new int[size];
        // int mainIND = 0;
        // int auxIND = 0;

        // for (int i = 0; i < size; ++i) {
        //     for (int j = 0; j < size; ++j) {

        //         if (i == j) {
        //             main[mainIND] = mymatrix[i][j];
        //             mainIND += 1;
        //         } else if (i + j == size - 1) {
        //             aux[auxIND] = mymatrix[i][j];
        //             auxIND += 1;
        //         }
        //     }
        // }

        // mainIND = 0;
        // auxIND = 0;

        // for (int i = 0; i < size; ++i) {
        //     for (int j = 0; j < size; ++j) {

        //         if (i == j) {
        //             mymatrix[i][j] = aux[auxIND];
        //             auxIND += 1;
        //         } else if (i + j == size - 1) {
        //             mymatrix[i][j] = main[mainIND];
        //             mainIND += 1;
        //         }

        //         System.out.print(mymatrix[i][j] + " ");
        //     }
        // 	System.out.println();
        // }


        // Task8

        // int[][] mymatrix = {
        //     {8, 9, 2},
        //     {10, 3, 5},
        //     {36, 14, 32}
        // };

        // int size = mymatrix.length;
        // int sum = 0;

        // for (int i = 0; i < size; ++i) {
        // 	for (int j = 0; j < size; ++j) {
        // 		if(i < j) {
        // 			sum += mymatrix[i][j];
        // 		}
        // 	}
        // }

        // System.out.println(sum);
   	
   		// Task9

        // int[][] mymatrix = {
        //     {8, 9, 2},
        //     {10, 3, 5},
        //     {36, 14, 32}
        // };

        // int size = mymatrix.length;
        // int sum = 0;

        // for (int i = 0; i < size; ++i) {
        // 	for (int j = 0; j < size; ++j) {
        // 		if(i + j < size - 1) {
        // 			sum += mymatrix[i][j];
        // 		}
        // 	}
        // }

        // System.out.println(sum);


		// Task10


        // int[][] mymatrix = {
        //     {8, 9, 2},
        //     {10, 3, 5},
        //     {36, 14, 32}
        // };

        // int size = mymatrix.length;
        // int sum = 0;

        // for (int i = 0; i < size; ++i) {
        // 	for (int j = 0; j < size; ++j) {
        // 		if(i + j > size - 1) {
        // 			sum += mymatrix[i][j];
        // 		}
        // 	}
        // }

        // System.out.println(sum);



        // Task11
  
        int[] myarray = {2, 3, 2, 3, 4, 4, 5, 6, 7, 6, 7};
        int[] myarray = new int[myarray.length - 1];

        int tmp = 0;

        for (int i = 0; i < myarray.length; ++i) {
        	
        } 



	}
}