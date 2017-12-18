import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] a=sc.nextLine().toCharArray();
        int b=a.length;
        int c=b/2;
        boolean flag=true;
        for (int i=0;i<c;i++){
            if (a[i]-a[b-1-i]!=0){
                flag=false;
            }

        } if (flag==true){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }
    }

