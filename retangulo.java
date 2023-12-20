package E_VERDADE;

public class retangulo {
	private double Base;
	private double Altura;
	private double Area;
	private double Perimetro;
	
public retangulo () {
	
	this.Base = Base;
	this.Altura = Altura;
	this.Area = Area;
	this.Perimetro = Perimetro;
}
	public double getBase() {
		return Base;
	}
	public void setBase(double base) {
		Base = base;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
	public void setArea() {
		Area = Base*Altura;
	}
	
	public double getArea() {
		return Area;
	}
	
	public double getPerimetro() {
		return Perimetro;
	}
	public void setPerimetro() {
		Perimetro = 2*(Base + Altura);
	
	}
	}
