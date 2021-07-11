import java.util.Scanner;

public class minor_project_by_mihika {

public static void main(String [] args)
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter a large number: ");
long n= sc.nextLong();
String no = n+"";
String str="";
int c=9;
long len = no.length();
//loop to check repeated numbers.
StringBuffer str2=new StringBuffer(no);
for(int i=0; i<len-1; i++)
{
for(int j=i+1; j<len; j++)
{
if((no.charAt(i))==(no.charAt(j))) {


str2.setCharAt(j,'*');

}

}
}
// loop to print the unique digits.
System.out.print("The unique digits present in "+no+" are ");
for(int j=0; j<len; j++)
{
if (str2.charAt(j)!='*'){

System.out.print(str2.charAt(j)+" ");



}

}
while(c>=0)
{
for(int i=0;i<no.length();i++)
{
long n1=n;
while(n1>0)
{

if(n1%10==c)
{
str=str+(n1%10);
n1=0;
}
n1=n1/10;
}
i=i+no.length();
}
c--;
}
n=Long.parseLong(str);
System.out.println(". The largest number is "+n+".");

}


}
