package exercise1;

public class TestDriver {


    public static void main(String[] args) {
        Question[] questions = new Question[5];
        questions[0] = new Question("Java is originally created by what company?","Sun Microsystems");
        questions[1] = new Question("What is the color for eggpant?","Purple");
        questions[2] = new Question("What is the color for orange?","Orange");
        questions[3] = new Question("What is the color for moon?","Yellow");
        questions[4] = new Question("What is the color for tree?","Green");

        Test color = new Test(questions);
        color.startTest();
    }
}
