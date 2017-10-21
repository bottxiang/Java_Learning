import java.util.Scanner;
public class Hell {
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
/***构造100以内素数的表，用数组下标表示数*************************/	
//		boolean[] isPrime = new boolean[100];
//		for (int i = 0; i < isPrime.length; i++)
//		{
//			isPrime[i] = true;
//		}
//		for (int i = 2; i < isPrime.length; i++)
//		{
//			if (isPrime[i])
//			{
//				for (int k = 2; k * i < 100; k++)
//				{
//					isPrime[k * i] = false;
//				}
//			}
//		}
//		for (int i = 2; i < isPrime.length; i++)
//		{
//			if (isPrime[i] == true)
//			{
//				System.out.print(i + " ");
//			}
//		}
/***构造50个素数的表*******************************************/
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1;
//		MAIN_LOOP:
//		for (int x = 3; cnt < primes.length; x++)
//		{
//			for (int i =0; i < cnt; i++)
//			{
//				if (x % primes[i] == 0)
//				{
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for (int k : primes)
//		{
//			System.out.print(k+" ");
//		}
		
/***投票器************************************************/
//		int[] numbers = new int[10];
//		int x;
//		x = IN.nextInt();
//		while (x != -1)
//		{
//			if (x >= 0 && x <= 9)
//			{
//				numbers[x]++;
//			}
//			x = IN.nextInt();
//		}
//		for (int i = 0; i < numbers.length; i++)
//		{
//			System.out.println(i+": "+numbers[i]);
//		}
		
/***Java_Array********************************************/
//		int[] a = {1,2,3,4};
//		int[] b = {1,2,3,4};
//		//a != b;数组变量可以比较，比较的是二者是否是同一数组的管理者
//		System.out.println(a == b);
//		int[] c = a; //c和a共同管理同一个数组
//		c[0] = 16;
//		System.out.println(c[0]);
//		System.out.println(a[0]);//对c[0]修改，a[0]的值也会改变
		
/***求最大公约数**************************************/
//		int a = IN.nextInt();
//		int b = IN.nextInt();
//		int oa = a;
//		int ob = b;
//1)普通方法		
//		int gcd = 1;
//		for (int i = 2; i <= a && i<=b; i++)
//		{
//			 if(a % i == 0 && b % i == 0)
//			 {
//				 gcd = i;
//			 }
//		}
//		System.out.println(a+"和"+b+"最大公约数是"+gcd);
//2)辗转相除法
//		while (b != 0)
//		{
//			int r = a % b;
//			a = b;
//			b = r;
//		}
//		System.out.println(oa+"和"+ob+"最大公约数是"+a);
/***求 1 - 1/2 + 1/3 - 1/4 + ...  1/n**************/
//		int n = IN.nextInt();
//		double sum = 0.0;
//		for (int i = 1; i <= n; i++)
//		{
//			if (i % 2 == 1)
//			{
//				sum += 1.0 / i;
//			}
//			else
//			{
//				sum -= 1.0 / i;
//			}
//		}
//		System.out.print("1");
//		for(int i = 2; i <= n; i++)
//		{
//			if(i % 10 == 1)
//			{
//				System.out.println();
//			}
//			if(i % 2 == 0)
//			{
//				System.out.print(" - 1/"+i);
//			}
//			else
//			{
//				System.out.print(" + 1/"+i);
//			}
////			if(i % 10 == 0)
////				{
////					System.out.println();
////				}
//		}
//		System.out.println();
//		System.out.println("="+sum);
		
/***凑   钱*****************************************/
//		int amount = IN.nextInt();
////①所有方案数
//		int count = 0;
//		for(int one = 0; one <= amount / 1; one++)
//		{
//			for(int five = 0; five <= amount / 5; five++)
//			{
//				for(int ten = 0; ten <= amount / 10; ten++ )
//				{
//					for(int twenty = 0; twenty <= amount /20; twenty++)
//					{
//						if(one*1+five*5+ten*10+twenty*20 == amount)
//						{
//							System.out.println(one+"张1元+"+five+"张5元+"+ten+"张10元+"+twenty+"张20元"+"-->"+amount);
//							count++;
//						}
//					}
//				}
//			}
//		}
//		System.out.println("fang an shu:"+count);
//		System.out.println();
//		
//		count = 0;
////②仅使用break或者使用 break OUT:
//		for(int one = 0; one <= amount / 1; one++)
//		{
//			for(int five = 0; five <= amount / 5; five++)
//			{
//				for(int ten = 0; ten <= amount / 10; ten++ )
//				{
//					for(int twenty = 0; twenty <= amount /20; twenty++)
//					{
//						if(one*1+five*5+ten*10+twenty*20 == amount)
//						{
//							System.out.println(one+"张1元+"+five+"张5元+"+ten+"张10元+"+twenty+"张20元"+"-->"+amount);
//							count++;
//							break;   //如果使用标号的话找到一种方案就退出标号标记的那个for循环
//						}
//					}
//				}
//			}
//		}
//		System.out.println("fang an shu:"+count);
		
/***isPrime***********************************/
//		int count = 0;
//		for (int n = 2; n < 1000; n++)
//		{
//			boolean isPrime = true;
//			for (int i = 2; i < n; i++)
//			{
//				if (n % i == 0)
//				{	
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime)
//			{	if(count < 50) 
//				{
//					count++;
//					System.out.println("第"+count+"个："+n);
//				}
//				if (count == 50) //Using "else" is OK
//					break;
//			}
//		}
/***输入一个整数，反序输出****************************/		
//		int number;
//		int result = 0;
//		number = IN.nextInt();
		
//		while(number > 0)
//		{
//			int digit = number % 10;
//			result = result * 10 + digit;
//			System.out.print(digit);
//			number = number / 10;
//		}
		
//		do
//		{
//			int digit = number % 10;
//			result = result * 10 + digit;
//			System.out.print(digit);
//			number = number / 10;
//		}while(number > 0);
//		
//		System.out.println();
//		System.out.println(result);
/***猜数游戏*************************************************/		
//		int number = (int)(Math.random()*100+1);//[0,1) -->[1,100]
//		int count = 0;
//		int a;
//		do
//		{
//			a = IN.nextInt();
//			count++;
//			if(a > number)
//			{
//				System.out.print("偏大，请继续：");
//			}
//			if(a < number)
//			{
//				System.out.print("偏小，请继续：");
//				
//			}
//		}while(a != number);
		
//		System.out.print("请输入：");
//		a = IN.nextInt();
//		count++;		
//		while(a != number)
//		{
//			if(a > number)
//			{
//				System.out.print("偏大，请继续：");
//				count++;
//			}
//			else
//			{
//				System.out.print("偏小，请继续：");
//				count++;
//			}
//			a = IN.nextInt();
//		}
//		System.out.println("恭喜您猜对了，猜了"+count+"次");
		
		
/****输入任意个数的数求平均数，输入-1表示结束***************************/		
//		int num;
//		int sum = 0;
//		int count = 0;
//		num = IN.nextInt();
//		while ( num != -1 )
//		{	
//			sum = sum + num;
//			count++;
//			num = IN.nextInt();
//		}
//		if ( count > 0)
//		{	
//			System.out.println("Average:"+(double)sum/count );
//		}
	}
}
