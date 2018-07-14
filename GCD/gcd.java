import java.util.Scanner;

public class nod {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number a:");
        int a;
        a=sc.nextInt();

        System.out.println("Enter number b:");
        int b;
        b=sc.nextInt();

        System.out.println("NOD of these numbers is :\n"+NOD(a,b));


    }

    public static int NOD (int a,int b)
    {

        while (b!=0){
            int remainder = a % b;

            a=b;

            b=remainder;
        }
        return a;

    }
}
