
public class Main {
	//métodos
	
	public static void exercise1(){
		int n, cont=1;

		System.out.println("Give me a number: ");
		n=Entrada.entero();
		
		while(cont<=n){
			System.out.println("Running method...");
			cont++;
		}
	}
	
	public static int exercise2(){
		int a, b;
		
		System.out.println("Give me a number (a): ");
		a=Entrada.entero();
		System.out.println("Give me a number (b): ");
		b=Entrada.entero();
		
		if (a>b){
			return a;
		}else
			return b;
	}	
	
	public static int exercise3(){
		int a, b, c;
		
		System.out.println("Give me a number (a): ");
		a=Entrada.entero();
		System.out.println("Give me a number (b): ");
		b=Entrada.entero();
		System.out.println("Give me a number (c): ");
		c=Entrada.entero();
		
		if (a>b && a>c){
			return a;
		}else if (b>a && b>c){
			return b;
		}else
			return c;
	}	

	public static void exercise4(){
		int a, b, i;
		
		System.out.println("Give me a number (a): ");
		a=Entrada.entero();
		System.out.println("Give me a number (b): ");
		b=Entrada.entero();
		
		if (a>b){
			for (i=0; i<a-1; i++){
				System.out.print(b+i+" ");
			}
		}else
			for (i=0; i<b-1; i++){
				System.out.print(a+i+" ");
			}
	}
	
	public static void exercise5(){
		int payslip, amount=0, cont=1, average;
		
		while (cont<=5){
			System.out.print("Give me your payslip: ");
			payslip=Entrada.entero();
			amount+=payslip;
			cont++;
		}		
		average=amount/5;
		System.out.println("The average is "+average);
	}
	
	public static void exercise6(){
		int[][] T= new int[5][5];
			for(int fil=0; fil<T.length; fil++){
				for(int col=0; col<T[fil].length; col++){
					T[fil][col]=fil+col;
				}
			}
			for(int fil=0; fil<T.length; fil++){
				for(int col=0; col<T[fil].length; col++){
					System.out.print(" ["+T[fil][col]+"] ");
				}
				System.out.println("");
			}
	}
	
	public static void exercise7(){
		int[][] T= new int[7][7];
			for(int fil=0; fil<T.length; fil++){
				for(int col=0; col<T[fil].length; col++){
					if(fil==col){
						T[fil][col]=1;
					}else{
						T[fil][col]=0;
					}
				}
			}
			for(int fil=0; fil<T.length; fil++){
				for(int col=0; col<T[fil].length; col++){
					System.out.print(" ["+T[fil][col]+"] ");
				}
				System.out.println("");
			}
	}
	
	public static void exercise8(){
		String[] people= new String[2];
		String[] employment= new String[2];
		
			//Fills the Array
			for(int fil=0; fil<people.length; fil++){
				System.out.print("Give me the Name of the "+(fil+1)+" employee : ");
				people[fil]=Entrada.cadena();
				System.out.print("Give me the Employment of the "+(fil+1)+" employee: ");
				employment[fil]=Entrada.cadena();
			}
			//Screen Display
			for(int fil=0; fil<people.length; fil++){
					System.out.print("NAME: "+people[fil]);
					System.out.print(" - EMPLOYMENT: "+employment[fil]);
					System.out.println("");
			}
	}
		
	public static void main(String[] args) {
	//Variables
	int ex2=0, ex3=0;
	//Methods
	//exercise1();
	/*
	ex2=exercise2();
	System.out.println("The maximum is: "+ex2);
	*/
	/*
	ex3=exercise3();
	System.out.println("The maximum is: "+ex3);
	*/
	//exercise4();
	//exercise5();
	//exercise6();
	//exercise7();
	exercise8();
	
	}

}
