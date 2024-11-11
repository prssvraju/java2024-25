
public class LocalNestClass {
    public static void main(String[] args) {
        class Local {
            int x;
            Local(int a)
            {
                x=a;
            }
            public void displayPower()
            {
                System.out.println("Power is"+Math.pow(x, 3));
            }
        }
        Local lc = new Local(10);
        lc.displayPower();
        
    }
    
}
