import java.util.Scanner;
public class LongestPalindrome {
        public static String longestPalindromicSubstring (String str,int n){
            int maxLength = Integer.MIN_VALUE;
            String result="";
            for (int i=0; i<n; i++) {
                for (int j=i + 1;j<n;j++) {
                    if (str.charAt(i) == str.charAt(j)&&(palindromeOrNot(str.substring(i,j+ 1)))) {
                        int length = str.substring(i,j+1).length();
                        if (length >maxLength) {
                            maxLength =length;
                            result=str.substring(i,j+1);
                        }
                    }
                }
            }
            return result;
        }
        public static boolean palindromeOrNot (String word){
            StringBuilder stringBuilder = new StringBuilder(word);
            return (stringBuilder.reverse().toString().equals(word)) ? true : false;
        }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String str=scanner.next();
            int n=str.length();
            System.out.println(longestPalindromicSubstring(str,n));
        }
    }