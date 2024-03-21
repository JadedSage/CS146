//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1} };
        int sr = 1, sc = 1, color = 2;
        if(valid(image,sr,sc,color)) {
            image = floodFill(image, sr, sc, color);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color)
    {
        if(image[sr][sc]==color) return image;

        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void fill(int[][]image,int sr, int sc, int color, int cur)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)return;
        if(cur !=image[sr][sc])return;
        image[sr][sc]= color;
        fill(image, sr-1, sc, color, cur);
        fill(image, sr+1, sc, color, cur);
        fill(image, sr, sc-1, color, cur);
        fill(image, sr, sc+1, color, cur);
    }
    public static Boolean valid(int[][] image, int sr, int sc, int color)
    {
        int m= image.length;
        int n= image[0].length;
        if(1<=m && m<=50&&1<=n&&n<=50&& 0<=image[sr][sc] && image[sr][sc]<=65536 && 0<=color && color<=65536 && 0<=sr && sr<=m && 0<=sc && sr<=n ) return true;
        return false;
    }

}
