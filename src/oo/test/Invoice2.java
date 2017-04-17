package oo.test;

import java.util.Scanner;

public class Invoice2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      int n;
	      int get = 0;
	      String spc = new String();
	      String fir[] = new String[3];
	      int ct[] = {0,0,0,0,0,0,0};
	      int money[] = {2000000,200000,40000,10000,4000,1000,200};
	      String price[] = {"特獎","頭獎","二獎","三獎","四獎","五獎","六獎"};
	      
	      System.out.print("輸入特獎號碼：");
	      spc = scanner.next();
	      System.out.print("輸入頭獎號碼：");
	      for(int i = 0;i < 3;i++)
	          fir[i] = scanner.next();
	      
	      
	      System.out.print("你有幾張發票?");
	      n = scanner.nextInt();
	      String s;
	      for(int i =0;i < n;i++){
	          s = scanner.next();
	          if(s.equals(spc)){
	              ct[0]++;
	              get += money[0];
	          }
	          for(int j = 0;j < 3;j++){
	              for(int m = 1;m <= 6;m++){
	                  if(s.substring(m-1,s.length()).equals(fir[j].substring(m-1,fir[j].length()))){
	                      ct[m]++;
	                      get += money[m];
	                      break;
	                  }
	              }
	          }
	      }
	      for(int i = 0;i < ct.length ;i++){
	          if(ct[i] > 0){
	              System.out.println(String.format("%s：%d", price[i],ct[i]));
	          }
	      }
	      
	      System.out.println(String.format("共得%d元", get));
	   }
	}
