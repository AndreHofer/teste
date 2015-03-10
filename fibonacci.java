class fibonacci{
	public static void main(String args[]){
		int a, c, n;
		int b=1;
		a=0;
		System.out.print("1");
		for(n=1; n<30; n++){
			c=a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
	System.out.print("\n");
	}
}
