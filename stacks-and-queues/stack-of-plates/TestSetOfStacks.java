import stacksofplates.*;

public class TestSetOfStacks {
    
    public static void main(String[] args) {
        int capacityPerSubstack = 5;
        SetOfStacks set = new SetOfStacks(capacityPerSubstack);
        
        for (int i = 0; i < 34; ++i) {
            set.push(i);
        }
        
        for (int i = 0; i < 35; ++i) {
            System.out.print("Popped " + set.pop()+"\n");
        }
    }
}
