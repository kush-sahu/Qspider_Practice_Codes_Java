// this is the actual implementation of all the methods of String in java

// this is my own created Custom Exception for MyString 

import java.util.*;
class MyStringIndexOutOfBoundException extends RuntimeException 
{
	public MyStringIndexOutOfBoundException(String msg){
	      super(msg);	
	}
	
}
class MyString 
{
	char arr[];
	public MyString(String str){
		arr =new char[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
		}
	}
	public MyString(char ch[]){
		arr =new char[ch.length];
		for(int i=0;i<ch.length;i++){
			arr[i]=ch[i];
		}
	}
    public String toString(){
		String str="";
		for(char ch:arr)str+=ch;
		return str;
    }
	public int length(){return arr.length;}
	public String toUpperCase(){
	  StringBuilder sb=new StringBuilder();
	  for(int i=0;i<arr.length;i++){
		  char ch=arr[i];
		  if(ch>='a' && ch<='z'){
			  sb.append((char)(ch-32));
		  }else{
			  sb.append(ch);
		  }
	  }
	  return sb.toString();
	}
	public String toLowerCase(){
	  StringBuilder sb=new StringBuilder();
	  for(int i=0;i<arr.length;i++){
		  char ch=arr[i];
		  if(ch>='A' && ch<='Z'){
			  sb.append((char)(ch+32));
		  }else{
			  sb.append(ch);
		  }
	  }
	  return sb.toString();
	}
	public char charAt(int i) {
		if(i<0 || i>arr.length-1)  {
			throw new MyStringIndexOutOfBoundException("This is custom for MyString clss");
		}
		return arr[i];
	}
	public int indexOf(char ch){
		return indexOf(ch,0);
	}
	public int indexOf(char ch ,int i){
		for( i=0;i<arr.length;i++){
			if(arr[i]==ch)return i;
		}
		return -1;
	}
	public int lastIndexOf(char ch){
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==ch)return i;
		}
		return -1;
	}
	public int codeCharAt(int i){
		if(i<0 || i>=arr.length){
		  throw new MyStringIndexOutOfBoundException("My String index out of bound exception");	
		}
		return (int)arr[i];
	}
	public boolean isEmpty(){
		return arr.length==0?true:false;
	}
	public MyString concat(MyString str){
		String st=str.toString();
		char array[]=new char[str.length()+arr.length];
		int index=0;
		for(char e:arr){
			array[index++]=e;
		}
		for(int i=0;i<st.length();i++){
			array[index++]=st.charAt(i);
		}
		return new MyString(array);
	}
	public MyString trim(){
		int i=0, j=arr.length-1;
		while(arr[i]==' ')i++;
		while(arr[j]==' ')j--;
		return substring(i,j+1);
	}
	public char[] toCharArray(){
		return this.arr;
	}
	public String replace(char c,char r){
	for(int i=0;i<arr.length;i++){
		if(arr[i]==c){
			arr[i]=r;
		}
	}
	return new MyString(arr).toString();
	}
	public boolean equals(MyString str){
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=str.charAt(i))return false;
		}
		return true;
	}
	public boolean equalIgnoreCase(MyString str){
		return this.toString().toLowerCase()==str.toString().toLowerCase();
	}
	public boolean contains(MyString str){
		MyString s=new MyString(arr);
		for(int i=0;i<s.length()-str.length();i++){
			if(s.substring(i,i+str.length()).equals(str))return true;		
		}
		return false;
	}
	public MyString substring(int st,int end){
		int i=st;
		int j=end;
		char ch[]=new char[end-st];
		int ind=0;
		while(i<j){
			ch[ind++]=arr[i++];
		}
		return new MyString(ch);
	}
	public  boolean startsWith(MyString str){
		MyString s=new MyString(arr);
		return s.substring(0,str.length()).equals(str);
	}
	public  boolean endsWith(MyString str){
		MyString s=new MyString(arr);
		return s.substring(s.length()-str.length(),s.length()).equals(str);
	}
	public int codePointBefore(int i){
		return codeCharAt(i-1);
	}
	public int codePointCount(int st,int end){
		return end-st;
	}
    public MyString replace(MyString str,MyString repStr){
		MyString strS=new MyString(arr);
		MyString a[]=strS.split(str);
		//System.out.println(Arrays.toString(a));
		MyString ans=new MyString("");
		
		for(MyString e:a){
			if(ans.length()>1)ans=ans.concat(repStr).concat(e);
			else ans=ans.concat(e);
		}
		return ans;
	} 
	public MyString replaceFirst(MyString str,MyString repStr){
		MyString strS=new MyString(arr);
		MyString a[]=strS.split(str);
		//System.out.println(Arrays.toString(a));
		MyString ans=new MyString("");
		if(a.length==1)return a[0];
		
		for(int i=0;i<a.length;i++){
			if(i==0)ans=ans.concat(a[i]);
			else if(i==1)ans=ans.concat(repStr).concat(a[i]);
			else ans=ans.concat(str).concat(a[i]);
		}
		return ans;
	}

	public MyString[] split(MyString str){
		MyString str1=new MyString(arr);
		ArrayList<MyString>list=new ArrayList<>();
		int i=0;
		for(int a=0;a<=str1.length()-str.length();a++){
			if(str1.substring(a,a+str.length()).equals(str)){
				list.add(str1.substring(i,a));
				i=a+str.length();
				a=i-1;
			}
		}
		if(i<str1.length())
		list.add(str1.substring(i,str1.length()));
		
		MyString ar[]=new MyString[list.size()];
		int index=0;
		for(MyString ele:list)ar[index++]=ele;
		return ar;
	}
	public static void main(String[] args) 
	{
		String str=new String("a");
		MyString st2=new MyString("there are various types of java");
		//1.System.out.println(str.length());
		//2.System.out.println(str.toUpperCase());
		//3.System.out.println(str.toLowerCase());`
		//4.System.out.println(str.charAt(-1));
		//5.System.out.println(str.indexOf('t'));
		//6.System.out.println(str.lastIndexOf('t'));
	    //7.System.out.println(str.codeCharAt(1));
		//8.System.out.println(str.indexOf('t',3));
		//9.System.out.println(str.isEmpty());
		//10.System.out.println(str.concat(st2).toString());
		//11.System.out.println(new MyString("        this String has Spaces").trim());
		//12.System.out.println(java.util.Arrays.toString(new MyString("this String has Spaces").toCharArray()));
		//13.System.out.println(st2.replace('s','9'));
		//14.System.out.println(str.equals(st2));
		//15.System.out.println(str.equalIgnoreCase(st2));
		//16.System.out.println(st2.contains(new MyString("This is kush")));
		//17.System.out.println(st2.substring(2,9));
		//18.System.out.println(str.startsWith(new MyString("2")));
		//19.System.out.println(str.endsWith(new MyString("the")));
		//20.System.out.println(str.codePointBefore(1));
		//21.System.out.println(str.codePointCount(0,6));
		//22.System.out.println(st2.replace(new MyString("o"),new MyString("kush")));
		//23.System.out.println(Arrays.toString(st2.split(new MyString("a"))));
		//24.System.out.println(st2.replaceFirst(new MyString("o"),new MyString("kush")));
		
	}	
}
