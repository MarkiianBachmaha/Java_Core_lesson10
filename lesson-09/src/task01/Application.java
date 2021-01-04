package task01;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� ������� ����� �� 5 ����");
		System.out.println("�������� 2, ��� ��������� �� ������� ����� � ����������");
		System.out.println("�������� 3, ��� ������� ������ ����� � ������ �� ����");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String wor = new String(scanner.next());
		String reverse = new StringBuffer(wor).reverse().toString();
		boolean flag = false;

		while (true) {

			menu();

			switch (scanner.next()) {

			case "1": {
				System.out.println("Enter the word:");
				scanner = new Scanner(System.in);
				String word = scanner.next();

				if (word.length() == 5) {
					System.out.println("This word has 5 letters;");
					flag = true;
				} else {
					try {
						throw new Exception();
					} catch (Exception e) {
						System.out.println("This word has no 5 letters. Enter a word of 5 letters;");
					}
				}
				System.out.println();

				break;
			}

			case "2": {
				System.out.println("Enter the word:");
				scanner = new Scanner(System.in);
				String words = scanner.next();

				if (wor.equalsIgnoreCase(reverse)) {
					System.out.println("This word is palindrom;");
				} else {
					System.out.println("This word is not palindrom;");
				}
				System.out.println();

				break;
			}

			case "3": {

				String s = "�� ����, �� ��������� ���� �� �����";
				System.out.println(s.replaceAll("[�������貳��AaEeIiOoUuYy]", "-"));

				System.out.println();

				break;
			}

			}
		}
	}
}