import java.util.Scanner;

public class QuestionService {
    Question[] questions=new Question[5];

    public QuestionService() {
        questions[0]=new Question(1,"What is the capital of India?","Mumbai","Chennai","New Delhi","Kolkata","New Delhi");
        questions[1]=new Question(2,"What is the capital of USA?","Washington DC","New York","Los Angeles","Chicago","Washington DC");
        questions[2]=new Question(3,"What is the capital of UK?","Manchester","Birmingham","London","Liverpool","London");
        questions[3]=new Question(4,"What is the capital of Australia?","Sydney","Melbourne","Canberra","Brisbane","Canberra");
        questions[4]=new Question(5,"What is the capital of Canada?","Toronto","Vancouver","Ottawa","Montreal","Ottawa");
    }

    public void displayQuestion() {
       System.out.println("Quiz Game");
int c=0;
Scanner sc=new Scanner(System.in);
try{
         for(Question q:questions) {
            
              System.out.println(q.getId()+". "+q.getQuestion());
System.out.println("Options:");
                System.out.println("1. "+q.getO1());
                System.out.println("2. "+q.getO2());
                System.out.println("3. "+q.getO3());
                System.out.println("4. "+q.getO4());
                System.out.println("Enter your answer: ");
                
                String userAnswer=sc.nextLine().trim();
if(userAnswer.equalsIgnoreCase(q.getAnswer())){ // correct comparison
                   c++;
               }
    }
}
finally {
           sc.close();
       }
            System.out.println("Your score is: "+c+"/5");
        }

}
