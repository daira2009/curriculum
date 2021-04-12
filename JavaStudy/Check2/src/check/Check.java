package check;

import constants.Constants;

public class Check {
	private static String firstName = "一";
	private static String lastName = "平";

	public static void main(String[] args) {

		// インスタンス生成
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		// メソッド実行
		printName(firstName,lastName);
		pet.introduce();
		robotPet.introduce();
	}

	private static void printName(String firstName, String lastName) {
		System.out.println("prinrNameメソッド →" + firstName + lastName);
	}
}
