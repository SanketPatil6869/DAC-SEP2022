// 20. String Constructor Program in Java

public class StringConstructors 
 { 
        public static void main(String[] args) 
     { 
           char[] charArray ={'H','i',' ','D','I','N','E','S','H'}; 
           byte[] ascii ={65,66,67,68,70,71,73}; 
           String str  = "Welcome"; 
           String strl =new String("Java"); 
           String str2 =new String(charArray); 
           String str3 =new String(charArray,3,3); 
           String str4 =new String(ascii); 
           String str5 =new String(ascii,2,3); 
           String str6 =new String(); 
           String str7 =new String(str); 
           System.out.println("str : "+ str); 
           System.out.println("strl : "+ strl); 
           System.out.println("str2 : "+ str2); 
           System.out.println("str3 : "+ str3); 
           System.out.println("str4 : "+ str4); 
           System.out.println("str5 : "+ str5); 
           System.out.println("str6 : "+ str6); 
           System.out.println("str7 : "+ str7); 
           str += " Dinesh Thakur"; 
           System.out.println("str : "+ str); 
     } 
 }