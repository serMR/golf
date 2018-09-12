
public class Secuencia {
	
	// false 1>2
	// true 4>2
	
	//BORRAR EL 1 EN CICLICA
	
static boolean secuenciaCiclica(int[] s) {
		
		int i=1, c=0;
		for(int x:s) 
			c += x>s[i++%s.length]?1:0;
		return c<2 & s[i-2]<s[0] | i<3;
		
	}
	


}

