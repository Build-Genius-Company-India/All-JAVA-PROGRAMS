import java.util.*;
public class string_tokeniser_tool
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your promt/message");
        String p= sc.nextLine(); int l=p.length();
        int arr[]=new int[l];
        for (int i=0 ; i<l ; i++)
        {
            char ch= p.charAt(i);
            arr[i]= (int)ch;
            
        }
        System.out.println("your PROMPT has been successfully converted to tokened array unit or dataset ==>");
        for(int i=0; i<l;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
