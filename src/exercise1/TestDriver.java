package exercise1;

public class TestDriver {


    public static void main(String[] args) {
        Question[] questions = new Question[5];
        questions[0] = new Question("Java is originally created by what company?","Sun Microsystems");
        questions[1] = new Question("What is the collection of related objects?","class");
        questions[2] = new Question("Objects are created by using the ______ keyword","new");
        questions[3] = new Question(" _______ variables are declared INSIDE a class but OUTSIDE of method bodies","Instance");
        questions[4] = new Question("What can be used to compile multiple classes at once?","javac");

        Test java = new Test(questions);
        java.startTest();
    }
}
