package study.practice.practice47;

public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		int num80 = 0;
		
		for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score > max) max = score;
            if (score < min) min = score;
            sum += score;
            if (score >= 80) num80++;
        }

        double scor = (double) sum / scores.length;

        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 점수: " + scor);
        System.out.println("80점 이상 학생 수: " + num80 + "명");
		}
	}



