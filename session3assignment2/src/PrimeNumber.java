public class PrimeNumber {
int i,flag=0;
public void number(int n1)
{
for(i=2;i<=n1/2;i++)
{
	if(n1%i==0)
	{
		flag=1;
		break;
	}	
}
if(flag==0)
	System.out.println(n1 +" is prime");
else
	System.out.println(n1+" is not prime");
}
}

