
public class Secuencia {
	
	// false 1>2
	// true 4>2
	
	static boolean secuenciaCiclica(int[] s) {
		
		int i=0, j=0, a, n=s.length;
		
		for(; j<n; j++) 
			i = s[j]<s[i]?j:i;
		
		for(j=0; j<n-1;) {
			a=i+j++;
			if(s[a%n] > s[++a%n])
				return 0>1;
		}
		return i<1 && n>1? 0>1: 1>0;
	}
}
