import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String s = "abbbccccdd";
        String s = "speediskey";
        if(s.length()>=1||s.length()<=2000)
        {
            System.out.println(longestPalindrome(s));
        }
        else
        {
            System.out.println("Length Invalid");
        }

    }
    public static int longestPalindrome(String s) {
        char[] unsorted = s.toCharArray();

        for (int i = 0; i < unsorted.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = unsorted[i];
            unsorted[i] = unsorted[minIndex];
            unsorted[minIndex] = temp;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : unsorted)
        {

            if (!uniqueChars.contains(c))
            {

                uniqueChars.add(c);
                charCount.put(c, 1);
            } else
            {
                charCount.put(c, charCount.get(c) + 1);
            }
        }

        List<Character>  key = new ArrayList<>(charCount.keySet());
        List<Integer> count= new ArrayList<>(charCount.values());
        List<Character> palindrome = new ArrayList<>();
        char high='a';
        int counters=0;
        int size = key.size();
        for(int i =0; i<size;i++)
        {
            int temp = size -i;
            int temp2= count.get(i);
            if(count.get(i)%2==0)
            {
                while(temp2!=0)
                {

                    if(temp2%2==0)
                    {
                        palindrome.addFirst(key.get(i));

                    }
                    else
                    {
                        palindrome.addLast(key.get(i));
                    }
                    temp2--;
                }
            }
            else
            {
                if(counters<count.get(i))
                {
                    high = key.get(i);
                    counters = count.get(i);
                }
            }
        }

        for(int i=0;i<counters;i++)
        {
            palindrome.add((palindrome.size()/2),high);
        }
        char[] sortedpt1 = new char[palindrome.size()];
        for(int i=0 ; i<sortedpt1.length;i++)
        {
            sortedpt1[i]= palindrome.get(i);
        }

     return sortedpt1.length;
    }

}