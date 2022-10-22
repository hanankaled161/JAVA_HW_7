/**
 * Created by Qursan on 22/10/22.
 */
public class TestAll {

    public static void main(String[] args) {
        BasicAccount A = new BasicAccount();
        A.deposits(2000);
        System.out.println(A.getBalance());
        A.withdraws(100);
        System.out.println(A.getBalance());

        System.out.println("////////////////////////");

        Questions q = new Questions();
        q.setText("what is your name?");
        q.setAnswer("hanaN");
        q.display();
        System.out.println(q.check_answer("Hanan "));

        System.out.println("////////////////////////");

        FillInQuestion f = new FillInQuestion();
        f.setText("HANAN");
        f.display();
        System.out.println(f.getTextWithAnswer());

        System.out.println("////////////////////////");

        Student s = new Student("Ali", "2025", "IS");
        System.out.println(s.toString());

        System.out.println("////////////////////////");

        Instructor i = new Instructor("lara", "2023", 2000);
        System.out.println(i.toString());

        System.out.println("////////////////////////");

        BetterRectangle b = new BetterRectangle(1, 2, 3, 4);
        System.out.println(b.getPerimeter());
        System.out.println(b.getArea());
    }
}