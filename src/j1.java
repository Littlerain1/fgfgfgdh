import java.util.Scanner;

public class j1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(fun(n)/(fun(m)*fun(n-m)));
    }
    public static int fun(int n){
        int sum=1;
        for (int i=n;i>1;i--){
            sum=sum*i;
        }
        return sum;
    }
}
