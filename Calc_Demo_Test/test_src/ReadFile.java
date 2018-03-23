import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFile {

	public ReadFile(String path , int n){
		File file=new File(path);  
        BufferedReader reader=null;  
        String temp=null;  
        int line=1;  
        boolean result = true;
        try{  
                reader=new BufferedReader(new FileReader(file));  
                while((temp=reader.readLine())!=null){  
                    System.out.println("line"+line+":"+temp);  //temp即为读到的每一行的内容
                    
                    CheckResult cr = new CheckResult();
                    result = (cr.CheckResult(temp) && result);//
                    
                    line++;  
                }  
                System.out.println(line);
                if (result && n== (line-2)) {
                	System.out.println("success!");
                }
                else {
                	System.out.println("failed!");
                }
        }  
        catch(Exception e){  
            e.printStackTrace();  
        }  
        finally{  
            if(reader!=null){  
                try{  
                    reader.close();  
                }  
                catch(Exception e){  
                    e.printStackTrace();  
                }  
            }  
        }  
	}
}
