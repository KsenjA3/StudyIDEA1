public class Demo1  {
    public static void main (String [] args) {
        int m=0;
        for (int i = 0; i <100 ; i++) {
            m=m++;
        }
        System.out.println(m);

        String a2="hello";
        double b2=2.0;
        boolean w2= false;
        var n2  =(w2?b2:a2);
        System.out.println(n2);

        Integer a3=3;
        Double b3=4.0;
        boolean w3= true;
        Number n3  =(w3?a3:b3);
        System.out.println(n3);


    }
}
