
/**
 * @author Adrián Vicente Maciá
 * @version 1.2
 */
public class Rectangulo_AVM extends FiguraGeometrica_AVM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase.
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_AVM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el área.
	 * @return l1 * l2
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perímetro.
	 * @return (2 * l1) + (2 * l2)
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
