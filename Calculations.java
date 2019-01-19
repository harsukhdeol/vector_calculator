package calculator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculations {

/**
 * This is the code for the button that performs cross product
 * @param V1 is the vector inputed before clicking the crossProduct button
 * @param V2 is the vector inputed after clicking the crossProduct button
 * @return This method performs the cross product of the 2 vectors
 * 			and returns the answer as a Float ArrayList
 */
	public static List<Float> crossProduct(List<Float>V1, List<Float>V2){
		List<Float> cross= new ArrayList<>();
		cross.add(V1.get(1)*V2.get(2)-V1.get(2)*V2.get(1));
		cross.add(V1.get(2)*V2.get(0)-V1.get(0)*V2.get(2));
		cross.add(V1.get(0)*V2.get(1)-V1.get(1)*V2.get(0));
 		return cross;
	}
	public static List<Float> dotProduct(List<Float>V1, List<Float>V2){
		List<Float> dot = new ArrayList<>();
		dot.add(V1.get(0)*V2.get(0)+V1.get(1)*V2.get(1)+V1.get(2)*V2.get(2));
		return dot;
	}
	public static List<Float> Xangle(List<Float>V1){
		List<Float> Xangle =new ArrayList<>();
		Xangle.add((float) Math.toDegrees(Math.atan((V1.get(1)/V1.get(0)))));
		System.out.println(V1.get(1));
		System.out.println(V1.get(1)/V1.get(0));
		return Xangle;
	}
	public static List<Float> Zangle(List<Float>V1){
		List<Float> Zangle = new ArrayList<>();
		Zangle.add((float)Math.toDegrees( Math.atan(V1.get(2)/(Math.sqrt(Math.pow(V1.get(0), 2)+Math.pow(V1.get(1), 2))))));
		return Zangle;
	}
	public static List<Float> addition(List<Float>V1, List <Float>V2){
		
		System.out.println((Arrays.toString(V1.toArray())+Arrays.toString(V2.toArray())));
		 List<Float> sum= new ArrayList<>();
		 for (int i=0; i<V1.size(); i++){
		 sum.add((V1.get(i)+V2.get(i)));

	}
		return sum;
	}

	public static List<Float> subtraction(List<Float>V1, List<Float>V2){
		List<Float> difference = new ArrayList<>();
		difference.add( V1.get(0)-V2.get(0));
		difference.add(V1.get(1)-V2.get(1));
		 for (int i=2; i<V1.size(); i++){
		difference.add(V1.get(2)-V2.get(2));
		 }
		return difference;
		
	}
	public static List<Float> multiply(List<Float>V1, float scalar){
		List<Float> product = new ArrayList<>();
		product.add(scalar*V1.get(0));
		product.add(scalar*V1.get(1));
		 for (int i=2; i<V1.size(); i++){
		product.add(scalar*V1.get(2));
		 }
		return product;
	}
	
	public static  List<Float> magnitude(List<Float>V1){
	
		List<Float> magnitude=  new ArrayList<>();
		magnitude.add((float) Math.sqrt(Math.pow(V1.get(0), 2)+Math.pow(V1.get(1), 2)+Math.pow(V1.get(2), 2)));
		return magnitude;
	}
	
	public static List<Float>unitVector(List <Float>V1){
	 float magnitude=magnitude(V1).get(0);
		List<Float> unit= new ArrayList<>();
			unit.add(V1.get(0)/magnitude);
			unit.add(V1.get(1)/magnitude);
			unit.add(V1.get(2)/magnitude);
		return unit;
	}
	
	public static List<Float> GeoToCart(List<Float>  Geo){
		List<Float> cart = new ArrayList<>();
		
			cart.add((float)( Math.round(Math.cos(Math.toRadians(Geo.get(1)))*Geo.get(0)*100))/100);
			
			cart.add((float) (Math.round(Math.sin(Math.toRadians((Geo.get(1))))*Geo.get(0)*100))/100);
			for (int i=2; i<Geo.size(); i++){
			cart.add((float)Math.round( (Math.sin(Math.toRadians((Geo.get(2))))*Geo.get(0)*100))/100);
			}
		return cart;
	}
	
	public static List <Float> CartToGeo (List<Float>Cart){
		List <Float> geo= new ArrayList<>();
		geo.add(magnitude(Cart).get(0));
		geo.add(Xangle(Cart).get(0));
		geo.add(Zangle(Cart).get(0));
		return geo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> f = new ArrayList<>();
		f.add((float) 10);
		f.add((float) 30);
		//f.add((float) 30);
		System.out.println(Math.sin(Math.toDegrees(0.523599)));
System.out.println((float)(Math.sin(Math.toRadians((f.get(1))))));
System.out.println(GeoToCart(f));
	}

}









