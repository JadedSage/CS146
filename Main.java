//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] fib = new int[n];
        fib[0]=0;
        fib[1]=1;
        for (int i = 1; i <= fib.length-2; i++)
        {
            int j= i-1;
           fib[i+1]= fib[i]+fib[j];


        }

        for(int i: fib)
        {
            System.out.print(i+", ");
        }
    }
}