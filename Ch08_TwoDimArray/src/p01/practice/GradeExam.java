package p01.practice;

// 학생 성적 매기기 (문제수 : 10문제) 
public class GradeExam {

	public static void main(String[] args) {
		char[][] studentAnswers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'B', 'A', 'D'}, //첫번째 학생이 제출한 정답 
				{'D', 'B', 'A', 'A', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'C', 'B', 'D', 'E', 'A', 'A', 'D'},
				{'C', 'B', 'A', 'C', 'C', 'D', 'C', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'E', 'A', 'D', 'E', 'A', 'A', 'D'}
		};;
		char[] answers = {'D', 'B', 'C', 'C', 'A', 'D', 'E', 'B', 'A', 'D'}; // 정답 
		
		// 5명 학생 성적 구하기
		for (int i=0; i<studentAnswers.length; i++) {
			int correctCount = 0;
			for (int j=0; j<studentAnswers[i].length; j++) {
				if(studentAnswers[i][j] == answers[j]) {
					correctCount++;
				}
			}
			System.out.println("학생 번호 " + (i+1) + "의 정답 총 개수 : " + correctCount);
		}

	}

}
