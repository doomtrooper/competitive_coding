package codechef;

import java.io.IOException;

/**
 * Created by kuliza-265 on 3/3/17.
 */
class XENTASK {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int t = Reader.nextInt();
        for(int x=0; x< t; x++) {
            int task = Reader.nextInt();
            int[] xenny = new int[task];
            int[] yana = new int[task];
            for(int i=0; i< task; i++) {
                xenny[i]= Reader.nextInt();
            }
            for(int i=0; i< task; i++) {
                yana[i]= Reader.nextInt();
            }
            long jennyFirst = 0, yanaFirst = 0;
            for (int i=0;i<task;i++){
                if (i%2==0){
                    jennyFirst+=xenny[i];
                    yanaFirst+=yana[i];
                }else{
                    jennyFirst+=yana[i];
                    yanaFirst+=xenny[i];
                }
            }
            System.out.println(jennyFirst>yanaFirst?yanaFirst:jennyFirst);
        }
    }
}

