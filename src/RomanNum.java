import java.util.Scanner;
public class RomanNum {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String rn[] = {"O","M","D","C","L","X","V","I"};
  int num1 = 0;
  int num2 = 0;
  int num3 = 0;
  int num4 = 0;
  int num5 = 0;
  int num6 = 0;
  int num7 = 0;
  Scanner sc = new Scanner(System.in);
  System.out.print("아라비아 숫자를 로마 숫자로 변환합니다 입력 : ");
  int num = sc.nextInt();
  while (num != 0) {
   if (num%10<5) {
    num7 = num%5;
    num -= num7;
   }
   else {
    num6 = 1;
    num7 = num%5;
    num = num - num7 - 5;
   }
   if (num%100<50) {
    num5 = num%50/10;
    num = num - num5*10;
   }
   else {
    num4 = 1;
    num5 = num%50/10;
    num = num - (num5*10) - 50;
   }
   if (num%1000<500) {
    num3 = num%500/100;
    num = num - num3*100;
   }
   else {
    num2 = 1;
    num3 = num%500/100;
    num = num - (num3*100) - 500;
   }
   num1 = num/1000;
   num = num - num1*1000;
  }
  
  int numarr[] = {0,num1,num2,num3,num4,num5,num6,num7};
  
  for (int i = 1; i <= 7; i++) {
   int j = 1;
   while (j <= numarr[i]) {
    if (numarr[i] == 4) {
     System.out.print(rn[i]+rn[i-1]);
     break;
    }
    System.out.print(rn[i]);
    j++;
   }
  }
 }
}