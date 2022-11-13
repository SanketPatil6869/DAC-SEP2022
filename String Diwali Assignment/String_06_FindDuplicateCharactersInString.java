
// Wap to find duplicate characters in a String ?

public class String_06_FindDuplicateCharactersInString
{  
     public static void main(String[] args)
	 {  
        String str1 = "Great responsibility";  
        int count;  
          
        char str[] = str1.toCharArray();  
          
        System.out.println("\nDuplicate characters in a given string: ");  

        for(int i = 0; i <str.length; i++)
		{  
            count = 1;  
            for(int j = i+1; j <str.length; j++) {  
                if(str[i] == str[j] && str[i] != ' ')
				{  
                    count++;  
                    str[j] = '0';  	 //Set string[j] to 0 to avoid printing visited character  
                }  
            }  
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]+" => count : "+count);  
        } 
		
    }  
} 


/*
=> this showa that array is distorted, but fine, it's not the string
System.out.println();
for(int i = 0; i <str.length; i++)
{
	 System.out.print(str[i]);  
}
/* 	