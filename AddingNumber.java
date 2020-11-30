class AddingNumbers
{
	public static void main(String a[])
{
int output=add();
System.out.println(output);

double ans = add(89.99,34.550);
System.out.println(ans);

double res = add(35.5,55.8);
System.out.println(res);
}
static int add()
{
int a=10;
int b=14;
int c=a+b;
return c;
}
static double add(double addOne,double addTwo)
{
double finalData=(addOne+addTwo);
return finalData;
}
static double add(double subjectOne,double subjectTwo, double subjectThree)
{
double finaldb=(subjectOne+subjectTwo+subjectThree);
return finaldb;
}
}
