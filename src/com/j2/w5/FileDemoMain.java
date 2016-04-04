/*
 * @author sch
 * @since 160404 (@ ÀÚ¹Ùµ¶)
 * demo how to use file decorator
 */

package com.j2.w5;
import java.io.File;
import java.io.FileInputStream;


public class FileDemoMain {
    public static void main(String[] args) throws Exception {
       File myhome=new File(System.getProperty("user.home"));
       System.out.println("myhome is "+myhome);
       
       String cwd=new File( "." ).getCanonicalPath();
       System.out.println("current working dir is "+cwd);
       
       File readme=new File(cwd,"a.txt");
       System.out.println("readme file is "+readme);
       
       FileInputStream isReadme=new FileInputStream(readme);
       System.out.println("readme file is "+readme);
             
      
      try{

       int i;
       while((i=isReadme.read())!=-1) {
         char c=(char)i;
         System.out.print(c);
       }
      }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(isReadme != null)
                isReadme.close();
        }
    }
}
        