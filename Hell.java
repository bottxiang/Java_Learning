import java.util.Scanner;
public class Hell {
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
/***ͶƱ��************************************************/
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
//		//a != b;����������ԱȽϣ��Ƚϵ��Ƕ����Ƿ���ͬһ����Ĺ�����
//		System.out.println(a == b);
//		int[] c = a; //c��a��ͬ����ͬһ������
//		c[0] = 16;
//		System.out.println(c[0]);
//		System.out.println(a[0]);//��c[0]�޸ģ�a[0]��ֵҲ��ı�
		
/***�����Լ��**************************************/
//		int a = IN.nextInt();
//		int b = IN.nextInt();
//		int oa = a;
//		int ob = b;
//1)��ͨ����		
//		int gcd = 1;
//		for (int i = 2; i <= a && i<=b; i++)
//		{
//			 if(a % i == 0 && b % i == 0)
//			 {
//				 gcd = i;
//			 }
//		}
//		System.out.println(a+"��"+b+"���Լ����"+gcd);
//2)շת�����
//		while (b != 0)
//		{
//			int r = a % b;
//			a = b;
//			b = r;
//		}
//		System.out.println(oa+"��"+ob+"���Լ����"+a);
/***�� 1 - 1/2 + 1/3 - 1/4 + ...  1/n**************/
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
		
/***��   Ǯ*****************************************/
//		int amount = IN.nextInt();
////�����з�����
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
//							System.out.println(one+"��1Ԫ+"+five+"��5Ԫ+"+ten+"��10Ԫ+"+twenty+"��20Ԫ"+"-->"+amount);
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
////�ڽ�ʹ��break����ʹ�� break OUT:
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
//							System.out.println(one+"��1Ԫ+"+five+"��5Ԫ+"+ten+"��10Ԫ+"+twenty+"��20Ԫ"+"-->"+amount);
//							count++;
//							break;   //���ʹ�ñ�ŵĻ��ҵ�һ�ַ������˳���ű�ǵ��Ǹ�forѭ��
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
//					System.out.println("��"+count+"����"+n);
//				}
//				if (count == 50) //Using "else" is OK
//					break;
//			}
//		}
/***����һ���������������****************************/		
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
/***������Ϸ*************************************************/		
//		int number = (int)(Math.random()*100+1);//[0,1) -->[1,100]
//		int count = 0;
//		int a;
//		do
//		{
//			a = IN.nextInt();
//			count++;
//			if(a > number)
//			{
//				System.out.print("ƫ���������");
//			}
//			if(a < number)
//			{
//				System.out.print("ƫС���������");
//				
//			}
//		}while(a != number);
		
//		System.out.print("�����룺");
//		a = IN.nextInt();
//		count++;		
//		while(a != number)
//		{
//			if(a > number)
//			{
//				System.out.print("ƫ���������");
//				count++;
//			}
//			else
//			{
//				System.out.print("ƫС���������");
//				count++;
//			}
//			a = IN.nextInt();
//		}
//		System.out.println("��ϲ���¶��ˣ�����"+count+"��");
		
		
/****�����������������ƽ����������-1��ʾ����***************************/		
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
