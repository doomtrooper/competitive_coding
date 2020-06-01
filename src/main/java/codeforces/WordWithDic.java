package codeforces;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class WordWithDic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //String S= sc.next();
        System.out.println(removeDuplicates("aaabbbaaabbabddccc"));
    }


    private static boolean ifCreated(HashSet<String> dic, String s) {
        if(s.length()==0){
            return true;
        }
        for(int i=1; i<=s.length(); i++){
            if(!dic.contains(s.substring(0,i))) {
                continue;
            }
            if(ifCreated(dic, s.substring(i,s.length()))){
                return true;
            }
        }
        return false;
    }
    private static String removeDuplicates(String s) {
        int count=0;
        for(int i=0; i< s.length()-1; ){
            if(s.charAt(i)== s.charAt(i+1)){
                count=0;
                int j=i+2;
                for(j=i+2; j<s.length(); j++){
                    if(s.charAt(i) != s.charAt(j)){
                        break;
                    }
                    count++;
                }
                if(count %2==0){
                    String s1= s.substring(0,i);
                    String s2= s.substring(j, s.length());
                    s= s1+ s2;
                    i=0;
                }else {
                    i = j-1;
                }
            }else {
                i++;
            }
        }
        return s;
    }
}
