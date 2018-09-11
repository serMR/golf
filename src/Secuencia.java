
public class Secuencia {
	
	// false 1>2
	// true 4>2
	
	static boolean secuenciaCiclica(int[] s) {
		
		int i=1, c=0, n=s.length;
				
		for(int x:s) 
			c += x>s[i++%n]?1:0;
		
		return c<2 && s[n-1]<s[0] || n<2 ?1>0:0>1;
		
	}
	
}
