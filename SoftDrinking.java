//4th prblm of cp(soft drink)
// prblm link :-> https://codeforces.com/problemset/problem/151/A
// yt tutorial link ->
import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = scanner.nextInt(); // number of friends
        int k = scanner.nextInt(); // number of bottles
        int l = scanner.nextInt(); // milliliters per bottle
        int c = scanner.nextInt(); // number of limes
        int d = scanner.nextInt(); // slices per lime
        int p = scanner.nextInt(); // grams of salt
        int nl = scanner.nextInt(); // milliliters per toast per person
        int np = scanner.nextInt(); // grams of salt per toast per person
        
        // Calculate total available resources
        int totalDrink = k * l; // total milliliters of drink
        int totalLimeSlices = c * d; // total lime slices
        int totalSalt = p; // total grams of salt
        
        // Calculate maximum number of toasts possible from each resource
        int toastsDrink = totalDrink / (n * nl);
        int toastsLime = totalLimeSlices / n;
        int toastsSalt = totalSalt / (n * np);
        
        // The number of toasts each friend can make is the minimum of these values
        int result = Math.min(toastsDrink, Math.min(toastsLime, toastsSalt));
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}
