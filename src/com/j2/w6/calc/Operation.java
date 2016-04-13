package b;

import java.util.*;

public abstract class Operation {
	
	Stack st = new Stack();
	Multiplication mu;
	Addition ad;
	Boolean flag1;
	String[] stri;
	
	
	public Operation() {
		
	}
 
	public void setMultiplication (Multiplication mu) {
		this.mu = mu;
	}
 
	public void setAddition (Addition ad) {
		this.ad = ad;
	}
 
 
	public String StringSplit(String str) {
		
		String[] stri = str.split("");
		
		int[] opFlag1 = new int[stri.length];
		for (int i= 0; i< stri.length; i++){
			if ((stri[i]=="e")){
				stri[i]= "2.71828";
			}
			else if (stri[i]=="p"){
				stri[i]= "3.14159";
			}
		}
		
		
		for (int i= 0; i< stri.length; i++){
			if ((stri[i]=="/")){
				opFlag1[i] = 4;
			}
			if ((stri[i]=="*")){
				opFlag1[i] = 3;
			}
			if ((stri[i]=="-")){
				opFlag1[i] = 2;
			}
			if ((stri[i]=="+") ) {
				opFlag1[i] = 1;
			}else{
				opFlag1[i] = 0;
			}
		
		}
		int flag4 = 1;
		int flag2=0;
		int flag3=0;
		for (int i= 0; i< stri.length; i++){
			if(opFlag1[i]!=0){
				flag4 =flag4+2;
			}
		}
		String[] stri1 = new String[flag4];
		for (int i= 0; i< stri.length; i++){
			
			if((opFlag1[i]==1)){
				String ex ="";
				for(int j= flag3; j<i; j++){
					ex= ex+stri[i];
				}
				stri1[flag2+1]= "+";
				stri1[flag2] = ex;
				flag2 = flag2+2;
				flag3= i+1;
			}
			if((opFlag1[i]==2)){
				String ex ="";
				for(int j= flag3; j<i; j++){
					ex= ex+stri[i];
				}
				stri1[flag2+1]= "+";
				stri1[flag2] = ex;
				flag2 = flag2+2;
				flag3= i+1;
			}
			if((opFlag1[i]==3)){
				String ex ="";
				for(int j= flag3; j<i; j++){
					ex= ex+stri[i];
				}
				stri1[flag2+1]= "+";
				stri1[flag2] = ex;
				flag2 = flag2+2;
				flag3= i+1;
			}
			if((opFlag1[i]==4)){
				String ex ="";
				for(int j= flag3; j<i; j++){
					ex= ex+stri[i];
				}
				stri1[flag2+1]= "+";
				stri1[flag2] = ex;
				flag2 = flag2+2;
				flag3= i+1;
			}
		
		String[] stri2 = new String[flag4];	
		
		}
	}
 

 
	
	   
	
}