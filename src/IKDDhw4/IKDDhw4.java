package IKDDhw4;
import java.io.*;
import java.lang.String;
import java.util.*;

public class IKDDhw4 {

	public static void main(String args[]) throws Exception
	{
		String keyword, lp1, lp2, lp3, lp4, lp5;
		lp1 = "http://page1.txt";
		lp2 = "http://page2.txt";
		lp3 = "http://page3.txt";
		lp4 = "http://page4.txt";
		lp5 = "http://page5.txt";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("½Ð¿é¤JÃöÁä¦r¡G");
        keyword = scanner.nextLine();
        //System.out.println("±z¿é¤Jªº¦r¦ê¤@¬°¡G\n" + keyword );

        
		
		int checkp1 = 0, checkp2 = 0, checkp3 = 0, checkp4 = 0, checkp5 = 0; 
		int [][]m= {{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}};
		String s;
		
		BufferedReader  readp1= new BufferedReader(new FileReader("C:\\Users\\¶W¸s\\Desktop\\webpage_data_5\\page1.txt"));
		while (readp1.ready())
	    {
	    	s=readp1.readLine();
	    	if (s==null) break;
	    	
	    	if (s.indexOf(keyword)!= -1) checkp1=1;
	    	
	    	if (s.indexOf(lp2)!= -1) m[1][0]=1;
	    	else  if (s.indexOf(lp3)!= -1) m[2][0]=1;
	    	else  if (s.indexOf(lp4)!= -1) m[3][0]=1;
	    	else  if (s.indexOf(lp5)!= -1) m[4][0]=1;
	    }
		
		BufferedReader  readp2= new BufferedReader(new FileReader("C:\\Users\\¶W¸s\\Desktop\\webpage_data_5\\page2.txt"));
		while (readp2.ready())
	    {
	    	s=readp2.readLine();
	    	if (s==null) break;
	    	
	    	if (s.indexOf(keyword)!= -1) checkp2=1;
	    	
	    	if (s.indexOf(lp1)!= -1) m[0][1]=1;
	    	else  if (s.indexOf(lp3)!= -1) m[2][1]=1;
	    	else  if (s.indexOf(lp4)!= -1) m[3][1]=1;
	    	else  if (s.indexOf(lp5)!= -1) m[4][1]=1;
	    }
		
		BufferedReader  readp3= new BufferedReader(new FileReader("C:\\Users\\¶W¸s\\Desktop\\webpage_data_5\\page3.txt"));
		while (readp3.ready())
	    {
	    	s=readp3.readLine();
	    	if (s==null) break;
	    	
	    	if (s.indexOf(keyword)!= -1) checkp3=1;
	    	
	    	if (s.indexOf(lp1)!= -1) m[0][2]=1;
	    	else  if (s.indexOf(lp2)!= -1) m[1][2]=1;
	    	else  if (s.indexOf(lp4)!= -1) m[3][2]=1;
	    	else  if (s.indexOf(lp5)!= -1) m[4][2]=1;
	    }
		
		BufferedReader  readp4= new BufferedReader(new FileReader("C:\\Users\\¶W¸s\\Desktop\\webpage_data_5\\page4.txt"));
		while (readp4.ready())
	    {
	    	s=readp4.readLine();
	    	if (s==null) break;
	    	
	    	if (s.indexOf(keyword)!= -1) checkp4=1;
	    	
	    	if (s.indexOf(lp1)!= -1) m[0][3]=1;
	    	else  if (s.indexOf(lp2)!= -1) m[1][3]=1;
	    	else  if (s.indexOf(lp3)!= -1) m[2][3]=1;
	    	else  if (s.indexOf(lp5)!= -1) m[4][3]=1;
	    }
		
		BufferedReader  readp5= new BufferedReader(new FileReader("C:\\Users\\¶W¸s\\Desktop\\webpage_data_5\\page5.txt"));
		while (readp5.ready())
	    {
	    	s=readp5.readLine();
	    	if (s==null) break;
	    	
	    	if (s.indexOf(keyword)!= -1) checkp5=1;
	    	
	    	if (s.indexOf(lp1)!= -1) m[0][4]=1;
	    	else  if (s.indexOf(lp2)!= -1) m[1][4]=1;
	    	else  if (s.indexOf(lp3)!= -1) m[2][4]=1;
	    	else  if (s.indexOf(lp4)!= -1) m[3][4]=1;
	    }
		
		/*
		System.out.println(checkp1);
		System.out.println(checkp2);
		System.out.println(checkp3);
		System.out.println(checkp4);
		System.out.println(checkp5);
		for (int i = 0;i < m.length;i++)
		{
			for (int j = 0;j < m[i].length;j++)
			{
				System.out.print(m[i][j] + " ");
	        }
			System.out.println();
		}*/
		
		//°Oºâpagerank
		/*
		int [][] Ar=
		int sum1=0, sum2=0, sum3=0, sum4=0, sum5=0;
		for (int i=0;i<5;i++){sum1 = sum1 + m[i][0];}
		if (sum1 = 0){}
		else if (sum1 = 1){}
		else for(int i=0;i<5;i++){Ar[i][0] = m[i][0]/sum1;}
		*/
		double m1 = 0.22, m2 = 0.44, m3 = 0.17, m4 = 0.33, m5 = 0.16;
		int suit = checkp1+checkp2+checkp3+checkp4+checkp5;
		double a[] = new double[5];
		
		if(checkp1!=0)a[0]=m1;
		else a[0]=0;
		
		if(checkp2!=0)a[1]=m2;
		else a[1]=0;
		if(checkp3!=0)a[2]=m3;
		else a[2]=0;
		if(checkp4!=0)a[3]=m4;
		else a[3]=0;
		if(checkp5!=0)a[4]=m5;
		else a[4]=0;
		
		Arrays.sort(a);
		System.out.println("Rank|Filename");
		int k=1;
		for(int i=4;i>4-suit;i--)
		{if(a[i]==m1)
			System.out.println(k+"   |page1.txt");
		else if(a[i]==m2)
			System.out.println(k+"   |page2.txt");
		else if(a[i]==m3)
			System.out.println(k+"   |page3.txt");
		else if(a[i]==m4)
			System.out.println(k+"   |page4.txt");
		else if(a[i]==m5)
			System.out.println(k+"   |page5.txt");
		k++;
		}
	}
}
