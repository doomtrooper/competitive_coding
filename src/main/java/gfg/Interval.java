package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by kuliza-265 on 28/3/17.
 */
public class Interval {

    public static void main(String[] args) throws IOException, NoSuchMethodException {
        //jpAndEscapePlan();
        //dijkstarasUtil();
        //minPathCost();
        FooBar<Pair> lis = new FooBar<Pair>() {
            @Override
            public void onSucces(Pair obj) {
                System.out.println("obj");
            }

        };
        Class aClass = lis.getClass();
        Method method = aClass.getMethod("onSucces", String.class);
        Class[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.println(parameterTypes[i]);
        }
    }

    interface Foo<T>{
        void onSuccess(T obj);
    }

    private static void minPathCost() throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt(), m = Reader.nextInt();
        int[][] graph = new int[n][n];
        String[] stations = new String[n];
        String a,b;
        int distance;
        for (int i = 0; i < n; i++) {
            stations[i] = Reader.next();
        }
        for (int i = 0; i < m; i++) {
            a = Reader.next();
            b = Reader.next();
            distance = Reader.nextInt();
            Pair pair = stationIndex(a, b, stations);
            graph[pair.x][pair.y] = distance;
            graph[pair.y][pair.x] = distance;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j]<=0 && i!=j) graph[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (graph[j][i]==Integer.MAX_VALUE || graph[i][k]==Integer.MAX_VALUE) continue;
                    graph[j][k] = Math.min(graph[j][k], graph[j][i]+graph[i][k]);
                }
            }
        }

        int queries = Reader.nextInt();
        for (int i = 0; i < queries; i++) {
            a = Reader.next();
            b = Reader.next();
            Pair pair = stationIndex(a, b, stations);
            System.out.println(graph[pair.x][pair.y]);
        }
    }

    private static Pair stationIndex(String a, String b, String[] stations){
        Pair pair = new Pair(0,0);
        for (int i = 0; i < stations.length; i++) {
            if (stations[i].equals(a))  pair.x = i;
            if (stations[i].equals(b))  pair.y = i;
        }
        return pair;
    }


    private static void dijkstarasUtil() throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt(), m = Reader.nextInt();
        int[][] graph = new int[n][n];
        int a, w,b;
        for (int i = 0; i < m; i++) {
            a = Reader.nextInt();
            b = Reader.nextInt();
            w = Reader.nextInt();
            graph[a - 1][b - 1] = w;
        }
        int[] distance = new int[n];
        dijkstaras(graph, 0, distance);
        for (int i = 1; i < distance.length; i++) {
            System.out.print(distance[i]==Integer.MAX_VALUE?"10^9":distance[i]);
            System.out.print(" ");
        }
    }

    private static void dijkstaras(int[][] graph, int source, int[] distance) {
        for (int i = 1; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        ArrayList<Integer> unvisited = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            unvisited.add(i);
        }
        distance[source] = 0;
        while (!unvisited.isEmpty()){
            source = findSource(distance, unvisited);
            for (int i = 0; i < graph.length; i++) {
                if (graph[source][i]!=0 && +distance[source]+graph[source][i]<distance[i]){
                    distance[i] = distance[source]+graph[source][i];
                }
            }
            unvisited.remove(new Integer(source));
        }
    }

    private static int findSource(int[] distance, ArrayList<Integer> unvisited) {
        int index = 0, max = unvisited.get(0);
        for (int i = 1; i < unvisited.size(); i++) {
            if (distance[unvisited.get(i)]<max) {
                index = i;
                max = distance[unvisited.get(i)];
            }
        }
        return unvisited.get(index);
    }


    private static void jpAndEscapePlan() throws IOException{
        Reader.init(System.in);
        int n = Reader.nextInt(), m = Reader.nextInt();
        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = Reader.nextInt();
            }
        }
        int X = Reader.nextInt()-1, Y = Reader.nextInt()-1, J = Reader.nextInt();
        jPDfs(graph, X, Y,J, n, m);
    }

    private static void jPDfs(int[][] graph, int x, int y, int j, int n, int m) {
        int[] dirX = {0, 1, 0, -1};
        int[] dirY = {1, 0, -1, 0};
        boolean[][] visited = new boolean[n][m];
        boolean result;
        ArrayList<Pair> path = new ArrayList<>();
        Pair start = new Pair(x, y);
        path.add(start);
        visited[x][y] = true;
        result = dfsUtil(start, visited, n, m , graph, j, path, dirX, dirY);
        System.out.println(result?"YES":"NO");
        if (result) {
            System.out.println(path.size());
            for(Pair pair:path) System.out.println((pair.x+1)+" "+(pair.y+1));
        }
    }

    private static boolean dfsUtil(Pair pair, boolean[][] visited, int n, int m, int[][] graph, int j, ArrayList<Pair> path, int[] dirX, int[] dirY){
        if (pair.x == 0 || pair.x == n-1 || pair.y == 0 || pair.y == m-1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            Pair temp = new Pair(pair.x+dirX[i], pair.y+dirY[i]);
            if (isValidjp(pair,temp, graph, n, m, visited, j)) {
                if (dfsUtil(temp, visited, n, m, graph, j, path, dirX, dirY)) {
                    path.add(1,temp);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidjp(Pair pair, Pair temp, int[][] graph, int n, int m, boolean[][] visited, int j) {
        if (temp.x<0 || temp.x>=n) return false;
        if (temp.y<0 || temp.y>=m) return false;
        if (visited[temp.x][temp.y]) return false;
        if (graph[temp.x][temp.y] > graph[pair.x][pair.y]) return false;
        return graph[temp.x][temp.y]>=graph[pair.x][pair.y]-j || graph[temp.x][temp.y]== graph[pair.x][pair.y];
    }

    private static void bishuAndGirlfriend(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a,b;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            a = s.nextInt();
            b = s.nextInt();
            graph[a-1][b-1] = 1;
        }
        int q = s.nextInt();
        int[] girls = new int[q];
        int[] levelArr = new int[n];
        for (int i = 0; i < q; i++) {
            girls[i] = s.nextInt();
        }
        Arrays.sort(girls);
        bfsBishu(graph, n, levelArr);
        int index = -1, minDis = Integer.MAX_VALUE;
        for (int i = 0; i < q; i++) {
            if (graph[girls[i]-1][girls[i]-1]<minDis){
                minDis = graph[girls[i]][girls[i]];
                index = girls[i];
            }
        }
        System.out.println(index);
    }

    private static void bfsBishu(int[][] graph, int n, int[] levelArr) {
        int temp ;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int level = 0;
        int counter = 0;
        while (!queue.isEmpty()){
            counter = queue.size();
            level++;
            while (counter!=0) {
                temp = queue.poll();
                counter--;
                for (int i = 0; i < n; i++) {
                    if (graph[temp][i] == 1) {
                        levelArr[i] = level;
                        queue.add(i);
                    }
                }
            }
        }
    }

    private static void travelDiaries(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] graph = new int[n][m];
        int[] dirX = {0, 1, 0, -1};
        int[] dirY = {1, 0, -1, 0};
        int[][] graphLevel = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = s.nextInt();
                if (graph[i][j]==1) graphLevel[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j]==2) bfs(new Pair(i,j), graph, graphLevel, dirX, dirY, n, m);
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graphLevel[i][j]==-1) {
                    max = -1;
                    break;
                }
                if (graphLevel[i][j]>max){
                    max = graphLevel[i][j];
                }
            }
            if (max==-1) break;
        }
        System.out.println(max);
    }

    private static void bfs(Pair pair, int[][] graph, int[][] graphLevel, int[] dirX, int[] dirY, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(pair);
        visited[pair.x][pair.y] = true;
        while (!queue.isEmpty()){
            Pair temp = queue.poll();
            for (int i = 0; i < dirX.length; i++) {
                Pair newPair = new Pair(temp.x+dirX[i], temp.y+dirY[i]);
                if (isValid(newPair, n, m, graph, visited, graphLevel, graphLevel[temp.x][temp.y]+1)) {
                    graphLevel[newPair.x][newPair.y] = 1 + graphLevel[temp.x][temp.y];
                    queue.add(newPair);
                    visited[newPair.x][newPair.y] = true;
                }
            }
        }
    }

    private static boolean isValid(Pair pair, int n, int m, int[][] graph, boolean[][] visited, int[][] graphLevel, int toBeLevel) {
        if (pair.x<0 || pair.x>=n) return false;
        if (pair.y<0 || pair.y>=m) return false;
        if (graph[pair.x][pair.y]!=1 ) return false;
        if (graphLevel[pair.x][pair.y]!=-1 && graphLevel[pair.x][pair.y]<= toBeLevel) return false;
        return !visited[pair.x][pair.y];
    }

    static class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /**
         * call this method to initialize reader for InputStream
         */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");

        }

        /**
         * get next word
         */
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
//            TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

}
