package gfg;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kuliza-265 on 8/4/17.
 */
public class OlaInterview {

    public static void main(String[] args) throws IOException {
        int[][] arr2 = new int[][]{
                {1, 1, 1, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}};
        ArrayList<String> a = new ArrayList<>();
        a.add("abcd");
        a.add("abde");
        a.add("abcf");
        int[] arr = {4,2};
        //System.out.println(countStridesUtil(1));
        //compressFile();
        fizzBuzz(3);
    }

    public static ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> nums = new ArrayList<>();
        for (int i=1;i<=A;i++){
            if (i%3==0 && i%5==0) nums.add("FizzBuzz");
            else if (i%3==0)  nums.add("Fizz");
            else if (i%5==0)  nums.add("Buzz");
            else  nums.add(String.valueOf(i));
        }
        return nums;
    }
    public static void arrange(ArrayList<Integer> a) {
        int val,pos,tempVal;
        /*for (int i=0;i<a.size();i++){
            if (a.get(a.get(i)).equals(a.get(i))) continue;
            else {
                if (pos==a.get(i)) {
                    tempVal = a.get(i);
                    pos = i;
                    a.set(i, val);
                    val = tempVal;
                }
            }
        }*/
    }


    public int findMinCost(int[][] arr){
        int row = 0, col = 0;
        return findMinCostUil(arr, row+1, col, arr[0][0], arr.length-1, arr[0].length-1);
    }

    private int findMinCostUil(int[][] arr, int row, int col, int cost, int ROW_MAX, int COL_MAX) {
        if (row==ROW_MAX && col==COL_MAX) return cost+arr[row][col];
        if (row>ROW_MAX || col>COL_MAX) return Integer.MAX_VALUE;
        int costLeft = cost;
        return 0;
    }

    public int findMinSetps(int[][] arr, int row, int col, int rowDes, int colDes){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col, 0));
        int ROW_MAX = arr.length, COL_MAX = arr[0].length;
        boolean[][] visited = new boolean[ROW_MAX][COL_MAX];
        int[] rowDir = {}, colDir = {};
        while (!queue.isEmpty()){
            Pair pair = queue.poll();
            visited[pair.getRow()][pair.getColumn()] = true;
            for (int i=0;i<8;i++){
                Pair newPair = new Pair(pair.getRow()+rowDir[i],pair.getColumn()+colDir[i],pair.getSteps()+1);
                if (newPair.getRow()==rowDes && newPair.getColumn()==colDes) return newPair.getSteps();
                if (isValid(newPair.getRow(),newPair.getColumn(),ROW_MAX, COL_MAX, visited)) queue.add(newPair);
            }
        }
        return -1;
    }

    private boolean isValid(int row, int col, int ROW_MAX, int COL_MAX, boolean[][] visited){
        return row>=0&&col>=0&&row<ROW_MAX&&col<COL_MAX&&!visited[row][col];
    }

    public class Pair{
        private int row,column, steps;

        public Pair(int row, int column, int steps) {
            this.row = row;
            this.column = column;
            this.steps = steps;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
    }

    public static void compressFile() throws IOException {
        File input = new File("/home/kuliza-265/Pictures/device-2017-04-12-185057.png");
        BufferedImage image = ImageIO.read(input);

        File compressedImageFile = new File("compress.png");
        OutputStream os =new FileOutputStream(compressedImageFile);

        Iterator<ImageWriter> writers =  ImageIO.getImageWritersByFormatName("png");
        ImageWriter writer = writers.next();

        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();

        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.05f);
        writer.write(null, new IIOImage(image, null, null), param);

        os.close();
        ios.close();
        writer.dispose();
    }

    public static int calculateMovees(int[] arr){
        int countEven = 0, wrongPlacedEvent = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0) countEven++;
        }
        for (int i=0;i<countEven;i++){
            if (arr[i]%2!=0) wrongPlacedEvent++;
        }
        return wrongPlacedEvent;
    }

    public static int countStridesUtil(int distance){
        int[] steps = {2,3,4};
        if (distance==0) return 1;
        return  countStrides(distance, steps);
    }

    public static int countStrides(int distance, int[] steps){
        if (distance==0) return 1;
        if (distance<0) return 0;
        int total = 0;
        for (int i=0; i<steps.length; i++) {
            total+=countStrides(distance-steps[i],steps);
        }
        return total;
    }

    private static int findPathCount(int[][] arr) {
        int row_max = arr.length-1, col_max = arr[0].length-1;
        return pathCount(arr,0,1,row_max,col_max)+pathCount(arr,1,0,row_max,col_max)+pathCount(arr,1,1,row_max,col_max);
    }

    private static int pathCount(int[][] arr, int x, int y,int ROW_MAX,int COL_MAX) {
        if (!isValidLocation(arr,x,y, ROW_MAX,COL_MAX)) return 0;
        if (x==ROW_MAX && y==COL_MAX) return 1;
        return pathCount(arr,x,y+1,ROW_MAX,COL_MAX)+pathCount(arr, x+1, y, ROW_MAX, COL_MAX)+pathCount(arr, x+1, y+1, ROW_MAX, COL_MAX);
    }

    private static boolean isValidLocation(int[][] arr, int row, int col, int row_max, int col_max) {
        return row>=0 && col>=0 && row<=row_max && col<=col_max && arr[row][col]==1;
    }

    public static int isPalindrome(String a) {
        char[] chars = a.replaceAll("[^A-Za-z0-9]+", "").toLowerCase().toCharArray();
        for (int i=0;i<chars.length/2;i++){
            if (chars[i]!=chars[chars.length-1-i]) return 0;
        }
        return 1;
    }

    public static String longestCommonPrefix(ArrayList<String> a) {
        if (a.size()==1) return a.get(0);
        String prefix = findPrefix(a.get(1), a.get(0));
        if (a.size()==2) return prefix;
        for (int i = 2; i<a.size(); i++){
            prefix = findPrefix(prefix, a.get(i));
        }
        return prefix;
    }

    private static String findPrefix(String str1, String str2) {
        char[] chars1 = str1.toCharArray() , chars2 = str2.toCharArray();
        int i;
        for (i =0;i<Math.min(chars1.length,chars2.length);i++){
            if (chars1[i]!=chars2[i]) break;
        }
        return i==0?"":str1.substring(0,i);
    }

    public static int lengthOfLastWord(final String a) {
        char[] chars = a.toCharArray();
        int count=0;
        for (int i =chars.length-1;i>=0 && chars[i]!=' ';i--){
            count++;
        }
        return count;
    }

    public static String reverseWords(String a) {
        char[] chars = a.toCharArray();
        reverseString(chars,0,chars.length);
        for (int i=0,j=0;i<chars.length;){
            while ( j<chars.length && chars[j]!=' ') j++;
            reverseString(chars,i,j);
            while (j<chars.length  && chars[j]==' ' ) j++;
            i=j;
        }
        return String.valueOf(chars).trim().replaceAll("\\s+"," ");
    }

    private static void reverseString(char[] chars, int start, int end) {
        for (int i=start; i<(start+end)/2; i++){
            char temp = chars[i];
            chars[i] = chars[end-i+start-1];
            chars[end-i+start-1] = temp;
        }
    }
}
