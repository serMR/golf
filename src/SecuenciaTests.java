import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SecuenciaTests {
	
	@Test
	public void prueba1() {
		
		int[] secuencia = new int[5];
		
		secuencia[0]=5;
		secuencia[1]=9;
		secuencia[2]=1;
		secuencia[3]=2;
		secuencia[4]=4;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
		
	}
	
	@Test
	public void prueba2() {
		
		int[] secuencia = new int[3];
		
		secuencia[0]=1;
		secuencia[1]=3;
		secuencia[2]=2;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
	}
	
	@Test
	public void ejemplo1() {

		int[] secuencia = new int[5];
		
		secuencia[0]=1;
		secuencia[1]=4;
		secuencia[2]=10;
		secuencia[3]=-2;
		secuencia[4]=0;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
		
	}
	
	@Test
	public void ejemplo2() {

		int[] secuencia = new int[3];
		
		secuencia[0]=-2;
		secuencia[1]=0;
		secuencia[2]=-1;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
		
	}
	
	@Test
	public void ejemplo3() {

		int[] secuencia = new int[1];
		
		secuencia[0]=1;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
		
	}
	
	
	@Test
	public void ejemplo4() {

		int[] secuencia = new int[5];
		
		secuencia[0]=1;
		secuencia[1]=2;
		secuencia[2]=3;
		secuencia[3]=4;
		secuencia[4]=5;
		
		assertTrue(Secuencia.secuenciaCiclica(secuencia));
		
	}
	
	
	
	
}
