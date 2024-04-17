import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int n = 4;
    int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
    int distanceThreshold = 4;

//      int n = 5;
//      int[][] edges = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
//      int distanceThreshold = 2;

      if(2<=n || n<=100|| 1<= edges.length||edges.length<=((n*(n-1))/2)||check(edges))
        System.out.println(findTheCity(n,edges,distanceThreshold));
    }
    public static boolean check(int[][] edges)
    {
        boolean check = true;
        for(int i =0;i< edges.length;i++)
        {
            if(edges[i].length!=3)
            {
                check = false;
            }
        }

        return check;
    }
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        int res = 0, smallest = n;
        for (int[] row : dis)
            Arrays.fill(row, 10001);
        for (int[] e : edges)
            dis[e[0]][e[1]] = dis[e[1]][e[0]] = e[2];
        for (int i = 0; i < n; ++i)
            dis[i][i] = 0;
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; ++j)
                if (dis[i][j] <= distanceThreshold)
                    ++count;
            if (count <= smallest) {
                res = i;
                smallest = count;
            }
        }
        return res;
    }
}
