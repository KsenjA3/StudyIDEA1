public class InnerDemo {
    public static void main (String [] args) {
        InnerTest inTest = new InnerTest(1, true);
        inTest.new inner();
    }
}
