import java.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextint();
int m=n;
int s=0;
int n;
while(m>0)
{
ch=n%10;
s=(s*10)+ch;
temp=temp/10;
}
if(n==s)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
