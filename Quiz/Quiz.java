package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.getText());
            String response = scanner.nextLine();
            if (q.checkAnswer(response)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong.");
            }
        }
        System.out.println("Final Score: " + score + "/" + questions.size());
    }
}
