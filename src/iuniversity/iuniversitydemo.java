package iuniversity;

public class iuniversitydemo {

	public static void main(String[] args) {
		college[] c=new college[2];
		college e=new college();
	
				
		c[0]=new college("vdrit",121,700,305);
		c[1]=new college("kleit",304,900,765);
		
		e.maxcheck(c);
		e.maxcheck1(c);
		
		BVB bv=new BVB(12,"bb",34,44,33);
		bv.displaycourse();
		GIT gv=new GIT(13,"gg",78,99,76);
		gv.displaycourse();
		
		
		department[] d=new department[5];
		department b=new department();
		
		d[0]=new department("cse");
		d[1]=new department("ec");
		d[2]=new department("ee");
		d[3]=new department("chemical engg");
		d[4]=new department("mechanical");
		
		b.checks(d);
		b.display(d);
		
		

	}

}
