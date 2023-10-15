public class InnerTest {
    private int i;
    private boolean b;

    public InnerTest (int i, boolean b){
        this.i=i;
        this.b=b;
    }



    class inner {
        private int pri=i;
        int defi=i++;
        public int pubi=defi++;
        inner () {
             System.out.println("внутренний конструктор");
         }

        void printin () {
            if (b) System.out.println ("inner"+"\npri= "+pri+"\ndefi= "+defi+"\npubi= "+pubi);
        }


    }

}
