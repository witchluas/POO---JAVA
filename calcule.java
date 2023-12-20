package E_VERDADE;
public class calcule {
	public static void main(String[] args) {
		
		retangulo x = new retangulo(); 
		x.setArea();
		double area = x.getArea();
		System.out.println(area);
		
		retangulo x1 = new retangulo();
		x1.setBase(6);
		x1.setAltura(3);
		x1.setArea();
		double areaX1 = x1.getArea();
		System.out.println(areaX1);
		
		
		
		
		
		

	}

}
