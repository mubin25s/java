package Quiz;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("Capital of France?", "Paris"));
        quiz.addQuestion(new Question("2 + 2?", "4"));
        quiz.start();
    }
}
