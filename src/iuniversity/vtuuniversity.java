package iuniversity;

public interface vtuuniversity {
   void checks(department[] d);    
   
   }
interface ugc
{	
 void maxcheck(college[]  c);
}



class college implements ugc{
	String sname;
	int icode;
	String fname;
	int noofaculty;
	int noofstu;
	public college(String sname,int icode,int noofaculty,int noofstu)
	{ 
		super();
		this.sname=sname;
		this.icode=icode;
		this.noofaculty=noofaculty;
		this.noofstu=noofstu;
		
	}
	static
	{
		System.out.println("*** checking students intake  under vtu university***");
	}
	public college(){
		}
	public void maxcheck(college[] c){
		int i;
			
		for ( i=0;i<c.length;i++)
		{
			if (c[i].noofstu>300)
			System.out.println("the college\t"+c[i].sname  +  "\thas maximum students"+c[i].noofstu);
		
		else
		{
			System.out.println("the strength of college is valid\n");
		}
			
		}
	}
		

public void maxcheck1(college[] c){
	int i;
	System.out.println("faculty check\n");
	for (i=0;i<c.length;i++)
	{
		if(c[i].noofaculty>211)
		{
			System.out.println("the college\t"  +c[i].sname +"\thas maxmimum limit of faculty\n"+c[i].noofaculty);
		}
	}
}
}

class BVB extends college{
	 int icode;
	 String sname;
	 int  noofaculty;
	 int noofstu;
	 int nofcourse;
	
	 BVB(int icode,String sname,int noofaculty,int nofstu,int nofcourse)
	 {
		 super();
		 this.nofcourse=nofcourse;
	 }
		public  void displaycourse(){
			System.out.println("no of courses present is"+nofcourse);
			 
		 }
	 }
class GIT extends college{
	int icode;
	 String sname;
	 int  noofaculty;
	 int noofstu;
	 int nofcourse;
	
	 GIT(int icode,String sname,int noofaculty,int nofstu,int nofcourse) //constructor overiding
	 {
		 super();
		 this.nofcourse=nofcourse;
	 }
		public  void displaycourse(){ //method overriding
			System.out.println("no of courses present is"+nofcourse);
			 
		 }
	
}





class department implements vtuuniversity{
	final String s="welcome to department"; //final
	String sdeptname;
	public department (String sdeptname){
		super();
		this.sdeptname=sdeptname;
	
	
	
	}
	public department(){
		
	}
	public void checks(department[] d)
	{
		if(d.length>4)
		{
			System.out.println("college has maximum department so it cannot have any new department\n");
		
		}
		else
		{
			System.out.println("college has sufficient departments\n");
		}
	}
	
	 public void display(department[] d5){
	
		System.out.println("departments of college are\n");
		for (int j=0;j<5;j++)
		{
			System.out.println("department name is:"+d5[j].sdeptname);
		}
		
	}
}



	 



	

