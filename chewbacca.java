//2nd prblm
import java.util.Scanner;

public class chewbacca {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String number=sc.next();// read the number as string
    StringBuilder req=new StringBuilder();// strinf is not mutable it's mutable in which ans will be strored
    for (int i = 0; i < number.length(); i++) {
      int n=number.charAt(i)-'0';//number-string=number
      int n_2=(9-n);
      if (i==0 && n==9) {//==> 1st digit
        // is 1st digit (9) become 0 make no sense
        req.append(n);
        }
        else{
          req.append(Math.min(n, n_2));
        }
     
      //the number of time we want  to scan and change the numnet and exchnage it with (9-t)
      // obersertion in prblm 2
      //in test case-1:->
      /* t-1 :-> 27
       * and the ouput is 22 ... two is not changed accord the q 1st value will not change
       * ---------------------------------------------------------------------------------------------
       * t-2 :-> 4545
       * here 1st value is safe 
       * 2nd value 5 so (9-5=4).. so five will be replaced with 4
       * but in the 3rnd value there is 4 that lower than (9-4=5) and that's why it will not be chnaged 
       * so min value b/w 4 and 5 will not be replaced
       * and 4th one will remain the same 
       * edge cases will be seen while coding 
       * to analyse earch and every number 1 st to last the int should be converted to string that's why we will use stringbuilder form
       */
      
    }
    System.out.println(req.toString());
    sc.close();
  }// prblm link ;-> https://codeforces.com/contest/514/problem/A
}
