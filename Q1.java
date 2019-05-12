package kunal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kunal on 12-05-2019.
 */
public class Q1 {
    public static void removeDuplicates()
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
        for(int i=0;i<linkedList.size();i++)
        {
            for(int j=i+1;j<linkedList.size();j++)//removing duplicated from linked list
            {
                if(linkedList.get(i).equals(linkedList.get(j)))
                {
                    linkedList.remove(j);
                    j--;//reducing the value of j by 1 since the size of the linked list will also reduce by 1.
                }
            }
        }
        for(int i=0;i<linkedList.size();i++)
        {
            System.out.print(linkedList.get(i)+" ");
        }
    }
    public static void main(String []args)
    {
        removeDuplicates();
    }
}
