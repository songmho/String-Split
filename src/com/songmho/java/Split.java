package com.songmho.java;

import java.util.ArrayList;

public class Split{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result=new ArrayList<>();
		
		result=split_char("abc def ghi jkl",' ');
		
		for(String buf : result){
			System.out.println(buf);
		}
		
		System.out.println();
		
		result=split_count("asdfasdfasdfasdfasdf",4);
		for(String buf : result){
			System.out.println(buf);
		}
		
	}
	
	public static ArrayList<String> split_char(String s,char c){		//method
		ArrayList<String> result=new ArrayList<>();		//result var
		String str="";
		for(int i=0;i<s.length();i++){			//making split
			if(s.charAt(i)!=c){					//s.CharAt(i) not equals split char
				str=str+s.charAt(i);
			}
			else{									//s.CharAt(i) equals split char
				result.add(str);
				str="";
			}
			
			if(i == s.length()-1){			//when loop is end, add str to result
				result.add(str);
				str="";
			}
		}
		
		return result;
	}
	
	public static ArrayList<String> split_count(String s, int i){
		ArrayList<String> result=new ArrayList<>();
		String str="";
		
		for(int a=0;a<s.length();a++){
				str=str+s.charAt(a);

			if((a+1)%i==0){
				result.add(str);
				str="";
			}
			if(a==s.length()-1 && str.length()>0){
				result.add(str);
				str="";
			}
		}
		
		return result;
	}

}
