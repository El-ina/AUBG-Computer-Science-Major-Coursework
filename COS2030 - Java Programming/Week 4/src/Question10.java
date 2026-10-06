import java.util.Arrays;

public class Question10 {
    static void main() {
        // each row is one student, each column one question (rows 0 to 2 are the lecture's)
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'D', 'C', 'B', 'D', 'E', 'E', 'A', 'C'},
                {'D', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'A', 'E', 'A', 'A', 'D'},
                {'D', 'C', 'D', 'C', 'A', 'D', 'E', 'E', 'B', 'D'},
                {'C', 'B', 'D', 'A', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] scores = scores(answers, keys);

        for(int i = 0; i < scores.length; i++){
            System.out.printf("Student %d: %d correct%n", i, scores[i]);
        }

        double average = average(scores);
        System.out.printf("Class average: %.2f out of %d%n", average, keys.length);

        int[] correctAnswersPerQuestion = correctPerQuestion(answers, keys);
        System.out.printf("Correct answers per question: %s%n", Arrays.toString(correctAnswersPerQuestion));

        int indexOfHardestQuestion = indexOfMin(correctAnswersPerQuestion);
        System.out.printf("Hardest question: %d (index %d), %d of %d correct%n", indexOfHardestQuestion + 1, indexOfHardestQuestion, correctAnswersPerQuestion[indexOfHardestQuestion], scores.length);
    }

    public static int[] scores(char[][] answers, char[] keys){
        int[] scores = new int[answers.length];

        for(int student = 0; student < answers.length; student++){
            for(int answer = 0; answer < answers[student].length; answer++){
                if(answers[student][answer] == keys[answer]){
                    scores[student]++;
                }
            }
        }

        return scores;
    }

    public static int[] correctPerQuestion(char[][] answers, char[] keys){
        int[] correctPerQuestion = new int[keys.length];

        for(int question = 0; question < answers[0].length; question++){
            for(int answer = 0; answer < answers.length; answer++){
                if(answers[answer][question] == keys[question]){
                    correctPerQuestion[question]++;
                }
            }
        }

        return correctPerQuestion;
    }

    public static double average(int[] values){
        int count = values.length;
        double sum = 0;

        for(int value : values){
            sum += value;
        }

        return sum / count;


    }

    public static int indexOfMin(int[] values){
        int min = Integer.MAX_VALUE;
        int indexOfMin = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
                indexOfMin = i;
            }
        }

        return indexOfMin;
    }
}
