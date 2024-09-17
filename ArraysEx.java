public class ArraysEx {
   public static void main(String[] args) 
    {
        int k[] = new int[]{3,4,5,6};
        display(k); 
        k= new int[10];
        System.out.println("");
        display(k);

    }   
    public static void display(int arr[])
    {
        for(int x:arr)
        {
            System.out.print(x);
        }
    }
}
