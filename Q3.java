package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q3 {
    public static void main(String []args)
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
        if(k==0 || k==no_of_elements-1)//Check if it is trying to remove first or last element.
        {
            System.out.println("Cannot delete this element.");
            System.exit(0);
        }
        else //If not first or last element, remove element.
        {
            linkedList.remove(k);
        }
        for(int i=0;i<linkedList.size();i++)
        {
            System.out.print(linkedList.get(i)+" ");
        }
    }
}
