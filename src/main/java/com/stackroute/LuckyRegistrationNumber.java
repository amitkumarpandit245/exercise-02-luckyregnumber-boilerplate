package com.stackroute;

import java.util.Scanner;

//Complete the code below as given in the problem.md file
public class LuckyRegistrationNumber {

   
    public static int checkRegistrationNumber(String regNumber) {
    	int result;
    	String state=regNumber.substring(0,2);
    	int number=Integer.parseInt(regNumber.substring(2,4));
    	int ac=0;
    	if(regNumber.length()<10){
    		String alphabet=regNumber.substring(4,5);
    		if(alphabet.charAt(0)>=65 && alphabet.charAt(0)<=90){
    			ac=1;
    		}
    	}else{
    		String alphabet=regNumber.substring(4,6);
       		if((alphabet.charAt(0)>=65 && alphabet.charAt(0)<=90) && (alphabet.charAt(1)>=65 && alphabet.charAt(1)<=90)){
    			ac=1;
    		}
    	}
    	
    	int luckyNum1=Integer.parseInt(regNumber.substring(6,10));
    	int luckyNum=luckyNum1;
    	int sumLuckyNum=0;
    	while(luckyNum>0){
    		int temp=luckyNum%10;
    		sumLuckyNum+=temp;
    		luckyNum=luckyNum/10;
    	}
    	int checkLuckyNum=((sumLuckyNum/10)+(sumLuckyNum%10));
    	
    	//System.out.println(sumLuckyNum+"  "+checkLuckyNum);
    	//System.out.println(state+" "+number+" "+alphabet+" "+luckyNum1);
    	if((state.equals("KA") || state.equals("DL")) && (number<=10 && number>=1) && (ac==1) && (luckyNum1>=1000 && luckyNum1<=9999)){
 
    		result=0;
    		if(result==0 && checkLuckyNum==6){
    			System.out.println("Lucky Registration Number");
    			result=1;
    			return result;
    		}
    		System.out.println("Valid Registration Number");
    		return result;
    	}
    	else{
    		System.out.println("Invalid Registration Number");
    		result=-1;
    	}
    	
        return result;
    }

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Scanner s=new Scanner(System.in);
    	String input=s.nextLine();
    	int r=LuckyRegistrationNumber.checkRegistrationNumber(input);
    	
    }

}