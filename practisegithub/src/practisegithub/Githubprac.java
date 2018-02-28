package practisegithub;

public class Githubprac {


private static Githubprac bb;
public int add(int a,int b) {
	return(a+b);
}
public static void main(String[] args) {
	Githubprac.bb = new Githubprac();
	
	System.out.println(bb.add(20,30));
	//changes 
	
}

}

