//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boolean result;
        String s ="racecar"; // Its funny because palindrome is not a palindrome
        s=s.toLowerCase();
        for(int i =0;i<s.length(); i++) // removal if not alphanumeric values
            {
        if(s.charAt(i)>=48 && s.charAt(i)<=57||s.charAt(i)>=97 && s.charAt(i) <=122){}// empty on purpose to skip, in hindsight I could have made it go the other way but ehhhh
        else {
            if(i==0)
            {
                s=s.substring(i+1);
            }
            else
            {
                s= s.substring(0,i)+s.substring(i+1);
            }
        }
        }
        char rev[]=new char[s.length()];
        int j=0;

        for(int i = s.length()-1; i>=0; i--)
        {
        rev[j]=s.charAt(i);
        j++;
        }
        String reversed=new String(rev);// makes the reversed char array into a String
        if(s.equals(reversed))
        {
            result = true;
        }
        else
        {
            result= false;
        }
        System.out.println(result);
    }
}
