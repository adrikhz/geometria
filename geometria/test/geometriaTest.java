import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class geometriaTest {
	
	@Test
	void areaTest() {
		Circulo_AVM c1 = new Circulo_AVM(7, "círculo");
		Circulo_AVM c2 = new Circulo_AVM(0, "círculo");
		Circulo_AVM c3 = new Circulo_AVM(-3, "círculo");
		assertEquals(153.94, c1.area(), 0.01);
		assertEquals(0, c2.area(), 0.01);
		assertEquals(28.27, c3.area(), 0.01);
	}
	
	@Test
	void perimetroTest() {
		Circulo_AVM c1 = new Circulo_AVM(7, "círculo");
		Circulo_AVM c2 = new Circulo_AVM(0, "círculo");
		Circulo_AVM c3 = new Circulo_AVM(-3, "círculo");
		assertEquals(43.98, c1.perimetro(), 0.01);
		assertEquals(0, c2.perimetro(), 0.01);
		assertEquals(18.85, c3.perimetro(), 0.01);
	}

}
