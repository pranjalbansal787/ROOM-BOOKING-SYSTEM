import java.util.*;
class menu
{
public static void main(String args[])
{
int x,p=0,n=0,m=0,f=0,q=0,pr=0;
String s="",ch="";
 
System.out.println(" Menu");
System.out.println("1:-Room Booking");
System.out.println("2:-Order meal");
System.out.println("3:-Display Records");
System.out.println("4:-Exit");
Scanner ob1=new Scanner(System.in);
System.out.println("Enter no for the action");
x=ob1.nextInt();
if(x==1)
{	
	System.out.println("Name:- ");
        	s=ob1.next() ;
	System.out.println("Gender:- ");	
	ch=ob1.next();
	System.out.println("No of person");
	p=ob1.nextInt();

	if(p%2==0){
	 n=p/2;}
         else if(p%2==1){
	n=(p/2)+1;}
	pr=n*800;



                  System.out.println("No of rooms:-"+n);


	System.out.println(" Menu");
	System.out.println("1:-Room Booking");
	System.out.println("2:-Order meal");
	System.out.println("3:-Display Records");
	System.out.println("4:-Exit");
	System.out.println("Enter no for the action");
	x=ob1.nextInt();
	        
	if(x==2)
	{
	System.out.println("1:-Breakfast");
	System.out.println("2:-Lunch");
	System.out.println("3:-Dinner");
	System.out.println("Enter no for the action");
	m=ob1.nextInt();
	if(m==1)
	{
	System.out.println("1:-Sandwich");
                  System.out.println("2:-Omlet");
	System.out.println("3:-Milk");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	q=ob1.nextInt();
	if(f==1){
	pr=q*30;}
	else if(f==2){
	pr=q*30;}
	else if(f==3){
	pr=q*30;}

System.out.println("Price:-"+pr);


System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);




	}
	else if(m==2)
	{
	System.out.println("1:-rice");
        System.out.println("2:-Dal");
	System.out.println("3:-aloo parantha");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	q=ob1.nextInt();
	if(f==1){
	pr=q*30;}
	else if(f==2){
	pr=q*30;}
	else if(f==3){
	pr=q*30;}

System.out.println("Price:-"+pr);


System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);


	}
	else if(m==3)
	{
	System.out.println("1:-roti");
        System.out.println("2:-raita");
	System.out.println("3:-mix veg");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	 q=ob1.nextInt();
	 if(f==1){
	 pr=q*30;}
	 else if(f==2){
	 pr=q*30;}
	 else if(f==3){
	 pr=q*30;}

System.out.println("Price:-"+pr);


System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);

	 }
	 }
	 if(x==3)
	 {
	 System.out.println("Name:- "+s);
        
	  System.out.println("Gender:- "+ch);	
	
	  System.out.println("No of person:-"+p);
	
                   System.out.println("No of rooms:-"+n);
	 System.out.println("Price:-"+pr);
	 }
}

else if(x==2)
	{
	System.out.println("1:-Breakfast");
	System.out.println("2:-Lunch");
	System.out.println("3:-Dinner");
	System.out.println("Enter no for the action");
	m=ob1.nextInt();
        if(m==1)
	{
	System.out.println("1:-Sandwich");
        	System.out.println("2:-Omlet");
	System.out.println("3:-Milk");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	q=ob1.nextInt();
	if(f==1){
	pr=q*30;}
	else if(f==2){
	pr=q*30;}
	else if(f==3){
	pr=q*30;}

System.out.println("Price:-"+pr);

System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);



	}
	else if(m==2)
	{
	System.out.println("1:-Sandwich");
                  System.out.println("2:-Omlet");
	System.out.println("3:-Milk");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	q=ob1.nextInt();
	if(f==1){
	pr=q*30;}
	else if(f==2){
	pr=q*30;}
	else if(f==3){
	pr=q*30;}

System.out.println("Price:-"+pr);


System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);



	}
	else if(m==3)
	{
	System.out.println("1:-Sandwich");
                  System.out.println("2:-Omlet");
	System.out.println("3:-Milk");
	System.out.println("Enter no for the action");
	f=ob1.nextInt();
	System.out.println("Enter no of item");
	q=ob1.nextInt();
	if(f==1){
	pr=q*30;}
	else if(f==2){
	pr=q*30;}
	else if(f==3){
	pr=q*30;}
	}

System.out.println("Price:-"+pr);



System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);





}
 if(x==3)
	{
	System.out.println("Name:- "+s);
        
	System.out.println("Gender:- "+ch);	
	
	System.out.println("No of person:-"+p);

                  System.out.println("No of rooms:-"+n);

	System.out.println("Price:-"+pr);
}
if(x==4)
{
System.exit(0);
}
                  }
                  }