import java.util.Scanner;
public class Pattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println();
			System.out.println("1 Full Pyramid");
			System.out.println("2 Invterted Pyramid");
			System.out.println("3 Exit");
			System.out.println("4 Pyramid Number");
			System.out.println("5 Pyramid121");
			System.out.println("6 Palindrome Pyramid");
			System.out.println("7 Palindrome Pyramid Char");
			System.out.println("8 Diamond");
			System.out.println("9 halfDiamond");
			System.out.println("10 pascalsTriangle");
			System.out.println("11 Hollow Diamond inscribed rectangle");
			System.out.println("12 Buuterfly");
			System.out.println("13 Triagle with Numbers");
			System.out.println("14 halfPyramidNumber");
			System.out.println("15 halfPyramidChar");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			System.out.println();
			switch(choice){
				case 1:
				pyramid();
				break;
				case 2:
				invertedPyramid();
				break;
				case 3:
				System.exit(0);
				case 4:
				pyramidNumber();
				break;
				case 5:
				pyramid121();
				break;
				case 6:
				palindromePyramid();
				break;
				case 7:
				palindromePyramidChar();
				break;
				case 8:
				solidDiamond();
				break;
				case 9:
				halfDiamond();
				break;
				case 10:
				pascalsTriangle();
				break;
				case 11:
				inscribedDiamond();
				break;
				case 12:
				butterfly();
				break;
				case 13:
				tringleWithNumber();
				break;
				case 14:
				halfPyramidNumber();
				break;
				case 15:
				halfPyramidChar();
				default:
				System.out.println("Wrong choice");
			}
		
		}while(true);
	}
	
	static void halfPyramidChar()
	{
		for(int i=1;i<=5;i++)
		{
			int k=65;
			int l=70-i;
			for(int j=1;j<=9;j++)
			{
				if(j<=6-i)
				{
					System.out.print((char)k++);
				}
				else if(j>=4+i)
				{
					System.out.print((char)l--);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
ABCDEEDCB
ABCD DCBA
ABC   CBA
AB     BA
A       A
		*/
	}
	
	static void halfPyramidNumber()
	{
		for(int i=1;i<=5;i++)
		{
			int k=i;
			for(int j=1;j<=10;j++)
			{
				if(j<=i )
				{
					System.out.print(j);	
				}
				else if(j>=11-i){
				System.out.print(k);	
				k--;
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		/*
		1                 1
		1 2             2 1
		1 2 3         3 2 1
		1 2 3 4     4 3 2 1
		1 2 3 4 5 5 4 3 2 1
		*/
	}
	
	static void tringleWithNumber()
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			boolean flag=true;
			
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i && j<=3+i && flag)
				{
					System.out.print(k);
					k++;
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
/*
   1
  2 3
 4 5 6
7 8 9 10
*/		
	}
	static void butterfly()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i<=5 && (j<=i || j>=11-i))
				{
					System.out.print("*");
				}
				else if(i>=6 && (j<=11-i || j>=i))
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/		
	}
	static void inscribedDiamond()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if((j<=6-i || j>=5+i) && i<=5)
				{
					System.out.print("*");
				}
				else if((j<=i-5 || j>=16-i) && i>=6)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}		
		}
		System.out.println();
		}
		
/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/		
	}
	public static void pascalsTriangle()
	{
			int k=1;
		for(int i=1;i<=7;i++)
		{
			k=1;
			for(int j=1;j<=7;j++)
			{
				if(j<=i)
				{
					System.out.print(k);
					k=k*(i-j)/j;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*
1
11
121
1331
14641
15101051
1615201561
*/		
	}
	
	static void halfDiamond()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i && i<6)
				{
					System.out.print("*");
				}
				else if(j<=10-i && i>5)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" " );
				}
			}
			System.out.println();
		}
/*
*
**
***
****
*****
****
***
**
*
*/		
	}
	static void solidDiamond()
	{
		for(int i=1;i<=10;i++)
		{
			boolean flag=true;
			for(int j=1;j<=9;j++)
			{
				if(j >= 6 - i && j <= 4 + i && i <= 5 && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else if(j >= i - 5 && j <= 15 - i && i >= 6 && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
/*
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/		
		
	}
	static void palindromePyramidChar()
	{
		for(int i=1;i<=6;i++)
		{
				char ch='A';
				char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			ch-=2;
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
	static void palindromePyramid()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	/*
	1
	1 2 
	1 2 1
	1 2 3 2 1
	1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1
*/
	}
	static void pyramid121()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			k=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=4+i && j>=6-i)
				{
					System.out.print(k);
					if(j<5)
					{
						k++;
					}
					else{
						k--;
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void pyramidNumber()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			k=i;
			for(int j=1;j<=9;j++)
			{
				if(j<=4+i && j>=6-i)
				{
					System.out.print(k);
					if(j<5)
					{
						k++;
					}
					else{
						k--;
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
	1
   232
  34543
 4567654
567898765
		*/
	}
	public static void pyramid()
	{
		for(int i=1;i<=6;i++)
		{
			boolean flag=true;
			for(int j=1;j<=11;j++)
			{
				if(j<=5+i && j>=7-i && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else{
					
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
		/*
	 *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
		*/
	}
	static void invertedPyramid()
	{
		for(int i=1;i<=6;i++)
		{
			boolean flag=true; 
			for(int j=1;j<=11;j++)
			{
				if(j>=i&& j<=12-i && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
/*
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/
}

