import java.util.Scanner;

public class MAIN {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
//				Problema1(s);
//				Problema2(s);
//				Problema3(s);
//				Problema4(s);
//				Problema5(s);
//				Problema6(s);
//				Problema7(s);
//				Problema8(s);
//				Problema9(s);
//				Problema12(s);
//				Problema13(s);
//				Problema16(s);
//				Problema17(s);
//				Problema18(s);
//				Problema19(s);
				Problema20(s);
			}
			
	public static void Problema1(Scanner s) {
		System.out.println("Introdu nota");
		int n = s.nextInt();
		if(n>=5)
			System.out.println("ADMIS");
		if(n<5)
			System.out.println("RESPINS");
		if(n<1 || n>10)
			System.out.println("INVALID");
	}
	
	public static void Problema2(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		if(n>1 && n<5)
			switch(n) {
			case 1: 
				System.out.println("UNU");
				break;
			case 2:
				System.out.println("DOI");
				break;
			case 3:
				System.out.println("TREI");
				break;
			case 4:
				System.out.println("PATRU");
				break;
			case 5:
				System.out.println("CINCI");
				break;
			}
		else 
			System.out.println("INVALID");
	}

	public static void Problema3(Scanner s) {
		System.out.println("Introdu numerele");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a % 2 == 0 && b % 2 == 0) {
			int media = (a+ b) / 2;
		System.out.println("Media aritmetica: " + media ); }
		if(a % 2 != 0 && b % 2 != 0) {
			int produs = a * b;
		System.out.println("Produsul: " + produs);}
		if(a % 2 ==0 && b % 2 != 0 || a % 2 !=0 && b % 2 == 0) {
			int suma = a + b;
		System.out.println("Suma: " + suma);}
		
	}
	
	public static void Problema4(Scanner s) {
		System.out.println("Introdu numerele");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a < b && a < c)
			System.out.println(a);
		if(b < a && b < c)
			System.out.println(b);
		if(c < a && c <b)
			System.out.println(c);
	}
	
	public static void Problema5(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0)
				suma = suma +i;
		}
		System.out.println(suma);
			
	}
	
	public static void Problema6(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0)
				suma = suma + i;
		}
		System.out.println(suma);
	}
	
	public static void Problema7(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int media = 0;
		int suma = 0;
		for (int i = 1; i < n; i++) {
			    suma = suma + i;
				media = suma / n;
		}
		System.out.println(media);
	}
	
	public static void Problema8(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
			
			
	}

	public static void Problema9(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		if(n > 1)
			if(esteNrPrim(n))
				System.out.println("N este prim");
			
		else System.out.println("N nu este prim");
	}

	//n.11 Sa se afiseze toti divizorii numarului ‘n’ dat.
	public static boolean esteNrPrim(int nr) {
			boolean flag = true;
			if((nr%2) ==0)
			return false;
			for(int div=3; div<=Math.sqrt(nr);div++) {
				if(nr%div==0) {
					flag = false;
					System.out.println("Am gasit un prim divizor: " + div);
					break;
				}
				div++;
			}
			return flag;
		}
		
	public static void Problema10() {
			int nr = 1000;
			while(true)
				if(esteNrPrim(nr)) {
			System.out.println("Am gasit numarul prim: " + nr);
			break;
		}
				else
				nr++;
		}
	
	public static void Problema12(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int div = 2;
		while (n != 1) {
			while (n % div == 0) {
				if( n % div == 0) {
					n = n / div;
					if(esteNrPrim(div)) {
						System.out.println("Divizorii primi: " + div);
						div += 2;
					}
					System.out.println("Numar: " +n);
				}
			}
			div++;
		}
	}
	
	public static void Problema13(Scanner s) {
		int n = 1000;
		int m = 0;
		int newNumber = n;

		while (m <= n) {
			if (m % 17 == 0)
			if (newNumber % 19 == 0) {
				System.out.println("Numarul 1: " + m + "\n" + "Numarul 2: " + newNumber);
				System.out.println();
			}
			++m;
			--newNumber;
		}
	}
	
	public static void Problema14(Scanner s) {
		int n = 1000;
		int m = 1;
		int newNumber = n - 1;

		while (m < n) {
			if (m + newNumber == n) {
				if (m % 17 == 0 || m % 13 == 0) {
				if (newNumber % 19 == 0 || newNumber % 7 == 0) {
					System.out.println("Numarul 1: " + m + "\n" + "Numarul 2: " + newNumber);
					System.out.println();
				}
				}
				m++;
				newNumber--;
			}
		}
	}
	
	public static void Problema16(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int m = n;
		while(n > 10) {
			m = n % 10 ;
			System.out.println(m);
			n = n/10;
		}
		System.out.println(n);
	}
	
	public static void Problema17(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int m = n;
		int maxx =0;
		while (n > 10) {
			m = n % 10;
		if(m > maxx)
			maxx = m;
		n = n/10;
		}
		System.out.println(maxx);
	}
	
	public static void Problema18(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int m = n;
		int min = 1000;
		while (n > 10) {
			m = n % 10;
		if(m < min)
			min = m;
		n = n/10;
		}
		System.out.println(min);
	}
	
	public static void Problema19(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int newnumber = 0;
		while(n > 0) {
			int m = n;
			m = n % 10;
			newnumber = newnumber *10 +m;
			n = n / 10;
		}
		System.out.println(newnumber);
	}
	
	public static void Problema20(Scanner s) {
		System.out.println("Introdu numarul");
		int n = s.nextInt();
		int n2 = n;
		int newnumber = 0;
		while(n > 0) {
			int m = n;
			m = n % 10;
			newnumber = newnumber *10 +m;
			n = n / 10;
		}
		if(n2 == newnumber)
		System.out.println("Este palindrom");
		else 
			System.out.println("Nu este palindrom");
		
	}
	
	
}



