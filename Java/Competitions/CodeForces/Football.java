import java.util.*;
public class Football
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int total = 0;
        if(s.length() <= 100)
        {
            int a = s.length()-1;
            boolean flag = false;
            for(int c = 0; c < s.length(); c++)
            {
                if((s.charAt(c) == '1') || (s.charAt(c) == '0'))
                {
                flag = true;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            int counter1 = 0;
            int counter0 = 0;
            if(flag == true)
            {
            while(a >= 0)
            {
                if(s.charAt(a) == '1'){
                    if(total < counter0)
                    {
                        total = counter0;
                        if(total < counter1)
                        {
                        total = counter1;
                        }
                    }
                    counter1++;
                    counter0 = 0;
                }
                else
                {
                    if(total < counter1)
                    {
                        total = counter1;
                        if(total < counter0)
                        {
                        total = counter0;
                        }
                    }
                    counter0++;
                    counter1 = 0;
                }
                --a;
                if(total >= 7)
                {
                    break;
                }
            }
            if(total >= 7)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            }
        }
        sc.close();
    }
}