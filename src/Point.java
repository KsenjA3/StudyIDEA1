 class Point {
     int x;
    static int y =9;

     Point (int x, int y) {
         this ("повторный вызов конструкторa - сумма: ", x+y);
        this. x= x;
        this.y =y;

     }
     Point (String a, int b) {
         System.out.println("печать из второго конструктора -" +a+b);
     }


     static void print () {
         System.out.println("static " +y);
     }

}
