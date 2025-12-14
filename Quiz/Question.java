package Quiz;

public class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response);
    }

    public String getText() {
        return text;
    }
}
