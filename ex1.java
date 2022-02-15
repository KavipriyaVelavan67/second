import java.io.*;
import java.util.Scanner;  

class ex1
{
public static void main(String[] args)
{
int i,j,k;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter i,j,k");
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();

if(i>=j)
{
if(i>=k)
System.out.println("i is greatest number");
else
System.out.println("k is greatest number");
}

if(i>=k)
{
if(i>=j)
System.out.println("i is greatest number");
else
System.out.println("j is greatest number");
}

else
{
if(j>=k)
System.out.println("j is greatest number");
else
System.out.println("k is greatest number");
}

}
}
