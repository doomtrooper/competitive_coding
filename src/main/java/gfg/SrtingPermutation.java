package gfg;

/**
 * Created by kuliza-265 on 26/3/17.
 */
public class SrtingPermutation {
    public static void main(String[] args) {
        String str = "ABAB";
        int n = str.length();
        permute(str, 0, n-1);
    }

    private static void permute(String str, int l, int r) {
        if (l==r) {
            System.out.println(str);
            return;
        }
        for (int i=l;i<=r;i++){
            if (i !=l && str.toCharArray()[i]==str.toCharArray()[l]) continue;
            permute(swap(str,i,l),l+1,r);
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
