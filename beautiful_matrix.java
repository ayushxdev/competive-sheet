import java.util.Scanner;

public class beautiful_matrix {
  public static void main(String[] args) {
    //
    Scanner sc=new Scanner(System.in);
   int[][] matrix=new int[5][5];// method of decleraing 2-d array
   int row=-1;
   int column=-1;
   for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {// go through from the all the elements in matrix
      matrix [i][j]=sc.nextInt();
      if (matrix[i][j]==1) {
         row=i;
         column=j;
      }

    }
   }
   int ans=Math.abs(row-2)+Math.abs(column-2);
   System.out.println(ans);
   sc.close();
  }// prblm link :-> https://codeforces.com/problemset/problem/263/A
}
