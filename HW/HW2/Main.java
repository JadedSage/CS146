import java.lang.Math;

public class Main {
    static int[] n = new int[10000]; //sets total amount of versions we assume n is a int because we follow 1,2,3,...,n
    static int badVer= setBadVersion(n); // this isn't used by main code to find only used in the comparision for knowing if the version is bad or not

    public static void main(String[] args)
    {

        // We start filling the versions with a sequential number
        for(int i=0;i<n.length; i++)
        {
            n[i]=i+1;
        }
        /*
        We are gonna do a binary search through the array
        I picked this because we can assume the array is in order because if not the version numbers being out of order would be a bigger problem than finding this
         */
        int left=0, right = n.length-1;
        int calls=0;
        while(left<=right)
        {
            int middle = (left + right-1)/2;
            boolean temp= isBadVersion(n[middle]);
            calls++;
            if(temp){
                right= middle-1;
            }
            else
            {
                left=middle+1;
            }

            if(left==right)
            {
                break;
            }
        }
        System.out.println("The first bad version from the random function is: "+badVer);
        System.out.println("The first bad version found from the loop is: "+n[left]);
        System.out.println("Calls to the API: "+calls);
    }

    /*
    This method is used to initialize a random bad version
     */
    public static int setBadVersion(int[] ver)
    {
        int badVer = 1 + (int)(Math.random() * ((ver.length-1) + 1));
        return badVer;
    }
    /*
    This is given but also not, so I made one to see code in action

    also intelij has a spell check and grammar check build in for comments that is something fun I learned
     */
    public static boolean isBadVersion(int version)
    {
        if(version<badVer)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}