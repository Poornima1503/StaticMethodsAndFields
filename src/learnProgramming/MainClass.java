package learnProgramming;

public class MainClass {
    public final int z = 100;
    public static void main(String[] args) {
        StaticMethodsAndFields s = new StaticMethodsAndFields();

        s.instanceMethod();
        StaticMethodsAndFields.staticMethod();
        System.out.println(StaticMethodsAndFields.i);
        System.out.println();
//
        StaticCounterField s1 = new StaticCounterField();
        StaticCounterField s2 = new StaticCounterField();
        StaticCounterField s3 = new StaticCounterField();
        StaticCounterField s4 = new StaticCounterField();
        StaticCounterField s5 = new StaticCounterField();
//
        System.out.println();

        NonStaticCounterField n1 = new NonStaticCounterField();
        NonStaticCounterField n2 = new NonStaticCounterField();
        NonStaticCounterField n3 = new NonStaticCounterField();
        NonStaticCounterField n4 = new NonStaticCounterField();
        NonStaticCounterField n5 = new NonStaticCounterField();

        MainClass m = new MainClass();

        System.out.println(m.z );
        m.anotherMethod();

    }

    public void anotherMethod(){
        System.out.println(z);
//        z = z +1;

    }
}
