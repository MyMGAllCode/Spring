import java.io.IOException;

public class Polymorphism {
	public void a(String s){
		System.out.println("String Parameter");
	}
	public void a(Object obj){
		System.out.println("Object Parameter");
	}
	
	public void a(Integer no){
		System.out.println("Integer Parameter");
	}
	
	public int getval(int x){
		return x;
	}
	
	public Double getval2(Double x){
		return x;
	}
	
}
