import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] answers = new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "what", "java", "lang", "python", "la", "a");
        questions[1] = new Question(2, "idunni", "null", "null", "is it null ?", "im bored ", "i need my car ");
        questions[2] = new Question(3, "fucking ", "java", "is boring ", "at first ", "but gets ", "better ");
        questions[3] = new Question(4, "null", "null", "null", "null", "null", "null");
        questions[4] = new Question(34, "who's the f1 world champion ", "max verstappen", "max verstappen",
                "max verstappen", "max verstappen", "max verstappen");
    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question No: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println("A: " + question.getOpt1());
            System.out.println("B: " + question.getOpt2());
            System.out.println("C: " + question.getOpt3());
            System.out.println("D: " + question.getOpt4());

            Scanner scanner = new Scanner(System.in);
            answers[i] = scanner.nextLine();
            i++;
        }

        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String answer = question.getAnswer();
            String userAnswer = answers[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Your score is " + score);
    }

    
    
}