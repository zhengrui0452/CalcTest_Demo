import java.io.File;
import java.io.IOException;


public class WriteToFile {

	public WriteToFile(String path)
	{
		try{
            File file = new File("result.txt");
            if(file.createNewFile()){
                System.out.println("�ļ������ɹ���");
            }
            else{
                System.out.println("�����ˣ����ļ��Ѿ����ڡ�");
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
	}
}
