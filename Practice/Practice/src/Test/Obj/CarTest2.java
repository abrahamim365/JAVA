package Test.Obj;

public class CarTest2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		
		System.out.println("c1의 color="+c1.color+", gearType="
							+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="
				+c2.gearType+", door="+c2.door);
	}

}
//생성자간의 호출을 하시오 . car1은 white, auto ,4 car2는 blue,auto,4
class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1() {

	}
	
	Car1(String color) {

	}
	
	Car1(String color, String gearType, int door) {
	}
}