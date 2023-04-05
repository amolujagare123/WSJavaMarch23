public class MyClass {
    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
       /* int i ;
        i = 10 ;*/

        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 90.34;
        ob.c = 'k';
        ob.str = "amol";
        ob.display();


        MyClass ob2 = new MyClass();
        ob2.a = 20;
        ob2.d = 95.34;
        ob2.c = 's';
        ob2.str = "java";
        ob2.display();
    }

}
