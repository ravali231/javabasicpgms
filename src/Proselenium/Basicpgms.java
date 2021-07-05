package Proselenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Basicpgms {
	
	public static void main(String[] args) throws IOException
	{

	//System.out.println("Hi");
	
	//Code for swap without 3rd number
	/*
	int a=20, b=10;
	
	
	System.out.println("Before swapping a and b values are " +a+ " " +b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println("After swapping a and b values are " +a+ " " +b);
	
			
	//Code for swap in single line
	
	b = a+b-(a=b);
	System.out.println("After swapping a and b values are " +a+ " " +b);
	*/
		
	//code for reverse number
	/*
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	
	
	int rev = 0;
	
	while(num!=0)
	{
		rev = rev*10 + num%10;
		num = num/10;
	}
	
	System.out.println("Reverse of a number is : " +rev);
	
	
	//using string buffer class
	
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sb.reverse();
	
	System.out.println("Reverse of a string is : " +rev);
	
	
	//using string builder class
	
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	StringBuilder rev = sbl.reverse();
	

	System.out.println("Reverse of a string is : " +rev);
	
	
	//reverse of string using string builder
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String str = sc1.nextLine();
	StringBuilder sb2 = new StringBuilder(str);
	StringBuilder rev = sb2.reverse();
	System.out.println("Reverse of a string is : " +rev);
	
	
	//reverse of string using concatenation
		
	String str = "abcd";
	String rev = "";
	 
	int len = str.length();
	for (int i=len-1;i>=0;i--)
	{
	rev = rev + str.charAt(i);	
	
			
	}
	System.out.println("Reverse of a string is : " +rev);
	
	
	//using character array
	String str = "abcd";
	String rev = "";
	char a[] = str.toCharArray();
	int len = str.length();
	for (int i=len-1;i>=0;i--)
	{
	rev = rev + a[i];
	
			
	}
	System.out.println("Reverse of a string is : " +rev);
	
	
	//Verify if number is palindrome or not
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a palindrome number  : ");
	int num = sc.nextInt();
	int org_num = num;
	int rev =0;
	
	while(num!=0)
	{
		rev = rev*10+num%10;
		num = num/10;
		
	}
	System.out.println("Reverse of number " +rev);
	
	if (rev == org_num)
	{
		System.out.println(rev +" is a palindrome number");
	}
	else
	{
		System.out.println(rev +" is not a palindrome number");
	}
	
	
	//palindrome of string using concatenation
		
	
		String str = "madam";
		String org_str = str;
		String rev = "";
		 
		int len = str.length();
		for (int i=len-1;i>=0;i--)
		{
		rev = rev + str.charAt(i);	
		
				
		}
		System.out.println("Reverse of a string is : " +rev);
	

	
	if(org_str.equals(rev))
	{
		System.out.println(org_str +" is a palindrome String");
	}
	else
	{
		System.out.println(org_str +" is not a palindrome String");
	}
	
	
	
	//Count Number of digits
		
	int num = 123456;
	int count =0;
	
	while(num>0)
	{
		num = num/10;
		count++;
	}
	
	System.out.println("Number of digits are " +count);
	
		
	//count even digits and odd digits in number
		
	int num = 1234567;
	int evennum_count = 0;
	int oddnum_count = 0;
	
	while(num>0)
	{
		int rem = num%10;
		if(rem%2 == 0)
		{
			evennum_count++;
		}
		else
		{
			oddnum_count++;
		}
		num = num/10;
	}
	System.out.println("Even number of digits in a num is " +evennum_count);
	System.out.println("Odd number of digits in a num is " +oddnum_count);
	
		
	//sum of digits in a number
		
	int num = 987654;
	int rem =0;
	
	while (num>0)
	{
		rem = rem + num%10;
		num = num/10;
		
	}
	System.out.println("Sum of digits in a number is " +rem);
	
		
	//Largest of 3 numbers
		
	int a=23,b=34,c=89;
	if(a>b && a>c)
	{
		System.out.println(a+" is the largest number");
	}
	else if(b>a && b>c)
	{
		System.out.println(b+" is the largest number");
	}
	else if(c>a && c>b)
	{
		System.out.println(c+" is the largest number");
	}
	
	//Largest of 3 numbers using ternary operator
		
	int a=93,b=99,c=89;
	
	int largest = a>b?a:b;
	int largest1 = c > largest?c:largest;
	System.out.println("Largest of a number is "+largest1);
	
	//Fibonaci series
		
	int f1=0,f2=1,f3=0;
	System.out.print(f1+ " " +f2);
	
	for(int i=2;i<10;i++)
	{
		f3=f1+f2;
		System.out.print(" "+f3);
		f1=f2;
		f2=f3;		
	}
	
	//prime number
		
	int num=5;
	int count=0;
	if(num>1)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i ==0)
			count++;
		}
		if(count == 2)
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num +" is not a prime number");
		}
		
	}
	else
	{
		System.out.println(num +" is not a prime number");
	}
	
	//Generate Random number
	Random rand = new Random();
	int num = rand.nextInt(1000);
	System.out.println("Random number is "+num);
	double num1 = rand.nextDouble();
	System.out.println("Random double number is "+num1);
	System.out.println(Math.random());
	
	//String str = RandomStringUtils.randomNumeric(5);
	//System.out.println(str);
	
	//Factorial of a number
	int num =5;
	int factorial = 1;
	
	for (int i=1;i<=num; i++)
	{
		factorial = factorial*i;
	}
	
	System.out.println("Factorial for " +num+ " is " +factorial);
	
	//Sum of elements in a array
		
	int a[]= {5,2,7,9,6};
	int sum=0;
	
	for(int i=0;i<=a.length-1;i++)
	{
		sum = sum+a[i];
	}
	System.out.println("Sum of elements in the array is "+sum);
	
	
	//enhanced for loop
	for(int i:a) 
	{
		sum = sum+i;
	}
	System.out.println("Sum of elements in the array is "+sum);
	
	//Extract even and odd numbers in array
	int a[]= {1,2,3,4,5,6,7,8};
	System.out.println("Even numbers in the array");
	for(int value:a)
	{
		if(value%2 == 0)
		{
			System.out.println(value);
		}
	}
	System.out.println("Odd numbers in the array");
	for(int value:a)
	{
		if(value%2 != 0)
		{
			System.out.println(value);
		}
	}
	
	//check equal arrays using arrays method
		
	int a1[] = {1,2,3,4,5};
	int a2[] = {1,2,3,6,5};
	boolean status = Arrays.equals(a1, a2);
	if(status == true) 
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");
	}
	
	//check equal arrays
	int a1[] = {1,2,3,4,5};
	int a2[] = {1,2,3,4,5};
	
	boolean status = true;
	if(a1.length == a2.length)
	{
		for(int i=0;i<a1.length;i++) 
		{
			if(a1[i] != a2[i])
			status = false;
		}
	}
	else
	{
		status = false;
	}
	if(status == true)
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");	
	}
	
	//Missing number in the array
	int a[]= {1,2,4,5};
	int sum1=0;
	for(int i=0;i<a.length;i++)
	{
		sum1 = sum1+a[i];
	}
	System.out.println("sum of elements in array is "+sum1);	
	int sum2=0;
	for(int i=1;i<=5;i++)
	{
		sum2 = sum2+i;
	}
	System.out.println("sum of elements in array is "+sum2);
	int sum3=sum2-sum1;
	System.out.println("Missing element in array is "+sum3);
	
	//Max and min numbers in a array
	int a[]= {50,20,60,30,80};
	int max=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("The maximum element is "+max);
	
	int min=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]< min)
		{
			min=a[i];
		}
	}
	System.out.println("The minimum element is "+min);
	
	//Duplicate elements in a array
	String arr[] = {"java","c","c++","python","java"};
	boolean flag = false;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Duplicate element is :"+arr[i]);
				flag = true;
				
			}
		}
	}
		if(flag == true) 
		{
			System.out.println("Duplicate element found in array");
		}
		else
		{
			System.out.println("Duplicate element not found in array");
		}
	
	HashSet <String> langs = new HashSet();
	for(String l:arr)
	{
		if(langs.add(l)==false)
		{
			System.out.println("Found duplicate element "+l);
			flag=true;
		}
	}
	if(flag == false)
	{
		System.out.println("Duplicate element not found in array");
	}
	
	//Search an element in array
	int a[]= {10,20,30,40,50};
	int search_ele =30;
	boolean flag = false;
	
	for(int i=0;i<a.length;i++) 
	{
		if(search_ele==a[i])
		{
			System.out.println("Element found at "+i);
			flag=true;
			break;
		}
	}
	if(flag == false)
	{
		System.out.println("Element not Found");
	}
	
	//Sort elements in the array
	int a[]= {6,8,3,1,9};
	
	System.out.println("Elements in array before sorting " +Arrays.toString(a));
	for(int i=0;i<a.length-1;i++) //number of passes
	{
		for(int j=0;j<a.length-1;j++) //iterations
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	System.out.println("Elements in array after sorting " +Arrays.toString(a));
	

	//Sort elements in the array using builtin methods
	Integer a[]= {6,8,3,1,9};
		
	System.out.println("Elements in array before sorting " +Arrays.toString(a));
	Arrays.parallelSort(a);
	System.out.println("Elements in array after sorting " +Arrays.toString(a));
	
	System.out.println("Elements in array before sorting " +Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("Elements in array after sorting " +Arrays.toString(a));
	
	System.out.println("Elements in array before sorting " +Arrays.toString(a));
	Arrays.sort(a,Collections.reverseOrder());
	
	System.out.println("Elements in array after sorting " +Arrays.toString(a));
	
		
	//Remove junk or special characters in a string
	String s = "!@#$%^&*  )2345 6ertyuiQWER TYUI(";
	s=s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
	
	//Remove junk or special characters in a string
	String s = "Java Programming   selenium Automation";
	s=s.replaceAll("\\s", "");
	System.out.println(s);
	
	//count character occurence
	String s = "Java Programming Java oops";
	int total_count = s.length();
	int totalcount_afterremove = s.replace("a", "").length();
	int char_occurence = total_count-totalcount_afterremove;
	System.out.println("Number of occurences of a is "+char_occurence);
	
	//Number of words in a string
	String s = "Welcome to Selenium";
	int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' ') ) 
		{
			count++;
		}
	}
	System.out.println("Number of words in a string are "+count);
	
	//Reverse each word in a string
	String s1 = "Welcome to Java";
	String[] words = s1.split(" ");
	String reversestring = "";
	for(String w: words)
	{
		String reverseword = "";
		for(int i=w.length()-1;i>=0;i--)
		{
			reverseword = reverseword+w.charAt(i);
		}
		reversestring = reversestring + reverseword + " ";
	}
	System.out.println("Reverse of each word in a string are :"+reversestring);
	
	//Read data from text file
	FileReader fr = new FileReader("/home/ravali/seleniumpract/Test.txt");
	BufferedReader br = new BufferedReader(fr);
	String str;
	while((str = br.readLine())!= null)
			{
			System.out.println(str);
			}
	br.close();
	//Approach 2
	File f = new File("/home/ravali/seleniumpract/Test.txt");
	Scanner sc = new Scanner(f);
	
	while(sc.hasNextLine())
			{
			System.out.println(sc.nextLine());
			}
	//Approach3
	sc.useDelimiter("\\Z");
	System.out.println(sc.next());
	*/
	//Write data into file
	FileWriter fw = new FileWriter("/home/ravali/seleniumpract/Test1.txt");
	BufferedWriter br = new BufferedWriter(fw);
	br.write("This is java ");
	br.write("This is python ");
	br.write("This is php ");
	br.write("This is selenium ");
	br.write("This is oops");
	
	System.out.println("Finished !!!");
	br.close();
	
	}
}
