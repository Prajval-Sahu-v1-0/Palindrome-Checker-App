import java.util.*;
public class IsPalin
{
    public static boolean isAlphaNumeric(char ch)
    {
        return (ch >= 48 && ch <=57 ||
                ch >= 65 && ch <= 90 ||
                ch >= 97 && ch <=122
                );
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Check for Plaindrome.");
        str = sc.nextLine();
        str.trim();
        int left = 0, right = str.length() - 1;
        while (left <= right)
        {
            char leftch = str.charAt(left);
            char rightch = str.charAt(right);

            if(isAlphaNumeric(leftch))
            {
                left++;
                continue;
            }

            if(isAlphaNumeric(rightch))
            {
                right--;
                continue;
            }

            if(leftch != rightch) {
                System.out.println("Not a Plindrome " + str);
                break;
            }left++;right--;
        }
        if(left > right) System.out.println("Is Palindrome " + str);
    }
}