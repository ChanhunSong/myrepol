/*
 * @author sch
 * @since 160404 (@ ÀÚ¹Ùµ¶)
 * demo how to use file decorator
 */

package com.j2.w5;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;

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
        
       File readmeUTF=new File(cwd,"UTF.txt");
       System.out.println("readme file is "+readmeUTF);
       

        
        InputStream isReadmeUTF = null;
        InputStreamReader isrReadmeUTF = null;
        BufferedReader brReadmeUTF=null;;
        isReadmeUTF=new FileInputStream(readmeUTF);
        isrReadmeUTF=new InputStreamReader(isReadmeUTF,"UTF8");
        brReadmeUTF= new BufferedReader(isrReadmeUTF);
            String str;
        try{
       

            while((str=brReadmeUTF.readLine())!=null) {
                System.out.println("--"+str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(brReadmeUTF != null)
                brReadmeUTF.close();
        }
    }
}
        