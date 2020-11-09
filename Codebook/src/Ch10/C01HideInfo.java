package Ch10;

class C01Person
{
	//멤버 변수
	public String name;
	private int age;
	private float weight;
	private double height;
	
	//생성자 메서드
	C01Person(String n)
	{
		name = n;
	}
	//멤버 메서드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
public class C01HideInfo {

	public static void main(String[] args) {
		C01Person Lee = new C01Person("이병헌");
		C01Person Kim = new C01Person("김태희");
		
		Lee.setAge(40);
		System.out.println("이병헌 나이 : " + Lee.getAge());
		
	}

}
