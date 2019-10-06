package learnProgramming;

public class StaticCounterField {
    public static int counter = 0;
    public StaticCounterField(){
        counter++;
        System.out.println(counter);
    }
}
