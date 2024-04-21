package DSA;

import java.util.Scanner;

public class LinearSearch 
{
    public static int linearSearch(int arr[],int length,int element)
    {
            for(int i=1;i<length;i++)
            {
                if(arr[i]==element)
                {
                    return i;
                }
            }
            return -1;
    }

    public static int BinarySearch(int arr[], int element, int length)
    {
        int steps=0;
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            steps++;
            int mid=(left+right)/2;

            if(arr[mid]==element)
            {
                System.out.println("Steps taken by binary search :"+steps);
                return mid;
            }
            else if(arr[mid]<element)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of array :");
        int length=sc.nextInt();
        System.out.println("Enter target element :");
        int element=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter array elements :");
        
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        // int result= linearSearch(arr,length,element);
        // System.out.println("Element found at index :"+(result+1));
        int resultBinary = BinarySearch(arr, element, length);
        System.out.println("Element found at index :"+(resultBinary+1));
    }
    
}
