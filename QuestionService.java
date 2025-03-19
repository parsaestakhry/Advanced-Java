public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "what", "java", "lang", "python", "la", "a");
        questions[1] = new Question(2, "idunni", "null", "null", "is it null ?", "im bored ", "i need my car ");
        questions[2] = new Question(3, "fucking ", "java", "is boring ", "at first ", "but gets ", "better ");
        questions[3] = new Question(4, "null", "null", "null", "null", "null", "null");
        questions[4] = new Question(34, "who's the f1 world champion ", "max verstappen", "max verstappen",
                "max verstappen", "max verstappen", "max verstappen");
    }

    public void playQuiz() {
        for (Question question : questions) {
            System.out.println(question);
        }
    }
}