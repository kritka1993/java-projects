import java.util.Scanner;

public class QuestionService 
{
   Question[] questions=new Question[5];
   String selection[]=new String[5];
   

    public QuestionService()
     {
        questions[0]=new Question(1,": Who is developed java?","a) microsoft","b) Apple","c) Sun microsystem","d) google","c");
        questions[1]=new Question(2,": Which keyword is used to define class in java?","a) Define","b) class","c) struct","d) object","b");
        questions[2]=new Question(3,": Entry point of java program?","a) start()","b) main()","c) run()","d) init()","b");
        questions[3]=new Question(4,": Not a java keyword?","a) static","b) void","c) main","d) public","c");
        questions[4]=new Question(5,": Which keyword is used to create an object?","a) class","b) new","c) this","d) super","b");

     
      }


    public void playQuis()
    {
      int i = 0;
     for (Question q : questions) 
      {
        System.out.println(q.getId()+q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        System.out.println();
        //System.out.println("Answer = "+q.getAnswer());
        Scanner sc=new Scanner(System.in);                  //getting the input from user
        selection[i]=sc.nextLine();
        i++;
      }

      for(String s: selection)
      {
        System.out.println(s);
      }

    }  
    
    public void printScore()
      {
        int score=0;

        for(int i=0;i<questions.length;i++)
        {
             Question que= questions[i];
             String actualAns = que.getAnswer();
             String userAns =selection[i];

             if (actualAns.equals(userAns)) 
              {
                score++;
             }
        }
             System.out.println(score);

      }
}
