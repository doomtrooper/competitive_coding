package codechef;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by kuliza-265 on 28/2/17.
 */
public class ALGOB {
    public static void main(String[] args) throws IOException {
        /*Reader.init(System.in);
        int t = Reader.nextInt();
        for(int x=0; x< t; x++) {
            String str1 = Reader.next();
            String str2 = Reader.next();
            int time = Reader.nextInt();
            int lcs = findLCS(str1,str1.length(),str2,str2.length());
            //System.out.println(String.valueOf(lcs));
            //System.out.println(time>=(str1.length()>str2.length()?str1.length()-lcs:str2.length()-lcs)?"TO ERR IS HUMAN":"TO ERR TOO MUCH IS DEVIL");

        }*/
        //checkWarResult("BDEG","HKOM");
    }

    private static void checkWarResult(String str1, String str2) {
        str1 = sortString(str1);
        str2 = sortString(str2);
        System.out.println(checkWar(str1,str2) || checkWar(str2,str1)? String.valueOf(true):String.valueOf(false));
    }

    private static boolean checkWar(String str1, String str2) {
        for (int i = 0;i<str1.length();i++){
            if (str1.charAt(i)<str2.charAt(i)) return false;
        }
        return true;
    }

    private static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }

    private static int findLCS(String str1, int length, String str2, int length2) {
        if (length==0 || length2==0 ) return 0;
        return str1.charAt(length-1)==str2.charAt(length2-1)
                        ?1+findLCS(str1,length-1,str2,length2-1)
                        :Math.max(findLCS(str1,length,str2,length2-1),findLCS(str1,length-1,str2,length2));
    }


}

