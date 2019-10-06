package learnProgramming;

public class NonStaticCounterField {
    public int counter = 0;
    public NonStaticCounterField(){
        counter++;
        System.out.println(counter);
    }
}
