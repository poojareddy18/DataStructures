// Repeated Character in a String 

public class HelloWorld{

     public static void main(String []args){
         String s = " aaaaaaaaaaa";
         char c ='a';
         int count =0;
         for(int i = 0;i<=10;i++)
         {
             if(s.charAt(i)==c)
             {
                 count++;
                 System.out.println(count);
             }
         }
         
     }
}