package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q2 {
    public static void returnKthLast()
    {
        LinkedList<Integer> linkedList=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int no_of_elements;
        System.out.println("Enter number of elements to be entered in the linked list.");
        no_of_elements=scanner.nextInt();
        int element;
        System.out.println("Enter the elements to be entered in the linked list:");
        for(int i=0;i<no_of_elements;i++)
        {
            element=scanner.nextInt();
            linkedList.add(element);
        }
        int k;
        System.out.println("Enter value of k");
        k=scanner.nextInt();
        System.out.println(linkedList.get(linkedList.size()-k));//command to remove second last element
    }
    public static void main(String []args)
    {
        returnKthLast();
    }
}
