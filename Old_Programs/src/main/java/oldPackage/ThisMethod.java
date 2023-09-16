package oldPackage;

public class ThisMethod {
	int a; int b;
	public ThisMethod(int a,int b)
	{
	this.a=a;
	this.b=b;
	this.print();
	}
	public void print(){
	System.out.println(a);
	System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisMethod object=new ThisMethod(10,20);

		//object.print();
		}
		}
		
		


