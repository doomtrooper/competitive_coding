package codechef;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kuliza-265 on 9/4/17.
 */
class SIMDISH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> ingrediants = new ArrayList<>();
        int counter = 0;
        while (t-->0){
            for (int i =0;i<4;i++) ingrediants.add(in.next());
            for (int i =0;i<4;i++) if (ingrediants.contains(in.next())) counter++;
            System.out.println(counter>=2?"similar":"dissimilar");
            ingrediants.clear();
            counter = 0;
        }
    }
}




