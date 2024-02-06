import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     String s = "listenl";
     String t = "silentl";
     Boolean solution = true;
     //this statement checks for if the two strings are even the same if not then don't even bother checking and just say false
     if(s.length()==t.length())
     {
        char[] cS = s.toCharArray();
        char[] cT= t.toCharArray();
        Arrays.sort(cS);
        Arrays.sort(cT);
        //make and sorts the arrays into alphabetical order
         /*This for loop takes the two sorted arrays and if they are not the same at any point
          * Set Solution to false
          * GTFO of the loop
          */
         for(int i=0;i<s.length();i++)
        {
            if(cS[i]!=cT[i])
            {
                solution = false;
                break;
            }
        }
     }
     else
     {
         solution = false;
     }
        System.out.println(solution);
     }
}
