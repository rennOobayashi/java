package week7;

public class PetEx {

	public static void main(String[] args) {
		Pet firstPet = new Pet("초코", "고양이");
		Pet secondPet = new Pet("구름이", "강아지", 2, "흰");
		
		System.out.println("< 첫 번째 애완동물 >");
		System.out.println("이름: " + firstPet.name);
		System.out.println("종류: " + firstPet.type);
		System.out.println("나이: " + firstPet.age);
		System.out.println("색상: " + firstPet.color);
		
		System.out.println();
		
		System.out.println("< 두 번째 애완동물 >");
		System.out.println("이름: " + secondPet.name);
		System.out.println("종류: " + secondPet.type);
		System.out.println("나이: " + secondPet.age);
		System.out.println("색상: " + secondPet.color);
	}

}
