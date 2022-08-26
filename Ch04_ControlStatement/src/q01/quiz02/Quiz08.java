package q01.quiz02;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 학생수를 입력해주세요 : ");
		int totalStudent = sc.nextInt();
		System.out.println("각 학생별 점수를 점수를 입력해주세요 : ");
		double numMax = 0;
		
		for (int i=1; i<totalStudent+1; i++) {
			double student = sc.nextDouble();
			System.out.println(i +" 번째 학생을 입력했습니다.");
			if (numMax < student) {
				numMax =student;
			}	
			}
		System.out.println(totalStudent + "명의 학생 중 점수가 제일 높은 학생의 점수는 = " + numMax + "점 입니다. ");
		}

	}

