import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result = "";
       
       while(n > 0) {
           n --;
           result = (char)('A' + (n % 26)) + result;
           n = n / 26;
       }
       System.out.println(result);
    }
}