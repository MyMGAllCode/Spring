
public class Calculate2Power {
	long result = 1;
	int i = 1;
	public  void get2Power(int n) {
		if(n==0)
		{
			result=1;
		}
		
		else{
		
	 result=result*2;
		
	 i++;
		}
	 if(i<=n){
	  get2Power(n);
	 }
		
	}

	public static void main(String[] args) {
		Calculate2Power c=new Calculate2Power();
		c.get2Power(0);
		
		System.out.println(c.getResult());
	}

public long getResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
