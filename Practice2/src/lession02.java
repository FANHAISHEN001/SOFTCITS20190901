import java.util.Scanner;

public class lession02 {public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();
	
	int q = abcde(a,b,c,d,e);		
   System.out.println(q);
} 

public static int abcde(int a, int b, int c,int d,int e){ 
	
    int f = mod(b,c);
    int g = sub(f,d);
    int h = multiple(g,e);
    int i = add(a,a);
    int q = add(i,h);
    return q;
}       	
	public static int mod(int b,int c) {
	return b%c;
}
public static int sub(int d,int c) {
	return d-c;
}	
public static int multiple(int f,int e) {
	return f*e;
}	
public double ad(double a) {
	return a*a;
}
public static int add(int i,int h) {
	return i+h;
}

}

