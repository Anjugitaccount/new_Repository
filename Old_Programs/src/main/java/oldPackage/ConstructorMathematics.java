package oldPackage;

public class ConstructorMathematics {
	int value1;
	int value2;
	int result;
	public ConstructorMathematics(int a,int b){
	value1=a;
	value2=b;


	} 
	public void add(){

	result=value1+value2;
	System.out.println(result);
	}
	public void mul(){

	result=value1*value2;
	System.out.println(result);
	}
	public void sub(){

	result=value1-value2;
	System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			ConstructorMathematics object=new ConstructorMathematics(5,5);
			object.add();
			object.mul();
			object.sub();


			}
			}
		
		
		
		
		

}
