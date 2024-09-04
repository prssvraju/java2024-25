import java.io.*;
import java.util.*;
class Mybinarysearch {
    public static void main(String args[])
    {
        int n, key, i, f, l, m;
        int a[] = new int[20];
        System.out.println("enter size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter key");
        key = sc.nextInt();
        f = 0;
        l = n-1;
        m = (f + l)/ 2;
        while (f<=l) {
            if (a[m] < key)
            {
                f = m + 1;
            } else if (a[m] == key) 
            {
                System.out.println("elementis found");
                break;
            } else 
            {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f>l) 
        {
            System.out.println("element is not found");
        }
    }
}