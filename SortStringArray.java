package FirstPackage;

import java.util.Scanner;

public class SortStringArray {
	public static int convert(String s)  
	{  
	    int num = 0;  
	    int n = s.length();  
	    for(int i = 0; i < n; i++)  
	        num = num * 10 + ((int)s.charAt(i) - 48);  
	  
	   return num;
	}  
	public static void main(String[] args)  
	{  
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter theSize of Array:");
	    int arrSize = sc.nextInt();
	    String[] strArray = new String[arrSize];
	    System.out.println("Enter theelement of Array:");
	    for(int i = 0; i < arrSize; i++) {
	    	strArray[i] =sc.next();
	    }
        
	    for (int i = 0; i < arrSize; i++) {
	        for (int j = i + 1; j < strArray.length; j++) {
	        	String tmp ="" ;
	            if (convert(strArray[i]) > convert(strArray[j]) ) {
	                tmp = strArray[i];
	                strArray[i] = strArray[j];
	                strArray[j] = tmp;
	            }
	        }
	    }
	    System.out.println("Enter Sorted Array:");
	    for(int i = 0; i < arrSize; i++) {
	    	System.out.print(strArray[i]+" ");
	    }
	}  
}
