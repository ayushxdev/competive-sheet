import java.util.Scanner;

public class BitsCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// number of line
        int x=0;// inital value
        for (int i = 0; i <n; i++) {// take the number of the that much time line will run  
            String a=sc.next();//"x++" & "++x" is in string
            if (a.contains("++")) {//.contains property will check if the string have ++ or not
                x++;
            }
            else{// for -- or something else 
                x--;
            }
        }
        System.out.println(x);
        sc.close();
     }
}
//https://codeforces.com/problemset/problem/282/A
// the first prblm link
// it's the 1st prblm of 180 day cp journey ..let's go
