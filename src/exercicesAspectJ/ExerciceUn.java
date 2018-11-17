package exercicesAspectJ;


public class ExerciceUn {

	static public int returnOne(){
		return 1;
	}
	
	static public String concatenation(String toConcat){
		String str = toConcat;
		return str;
	}
	
	static public int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	static private String concatenator(String toConcat) {
		String str = toConcat;
		return str;
	}
	
	public static void main(String[] args) {
		System.out.printf("%d \n",returnOne());
		System.out.printf("%d \n",fact(4));
	    System.out.printf("%s \n",concatenation("mot"));
		System.out.printf("%s \n",concatenation("Ceci est une longue phrase pour pouvoir avoir un temps d\'exécution"
				+ " plus long"));
		System.out.printf("%s \n",concatenator("Ceci est une longue phrase pour pouvoir avoir un temps d\'exécution"
				+ " plus long"));
	}
	
}
