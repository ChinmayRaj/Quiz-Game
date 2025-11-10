public class Question {
    int id;
    String question;
    String o1;
    String o2;
    String o3;  
    String o4;
    String answer;

    public Question(int id, String question, String o1, String o2, String o3, String o4, String answer) {
        this.id = id;
        this.question = question;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.answer = answer;
    }
    public int getId() {
        return id;
    }   
    public String getQuestion() {
        return question;
    }
    public String getO1() {
        return o1;
    }
    public String getO2() {
        return o2;
    }
    public String getO3() {
        return o3;
    }
    public String getO4() {
        return o4;
    }
    public String getAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return "Question ID: " + id + "\nQuestion: " + question + "\nOptions:\n1. " + o1 + "\n2. " + o2 + "\n3. " + o3 + "\n4. " + o4 + "\nAnswer: " + answer + "\n";
    }

}
