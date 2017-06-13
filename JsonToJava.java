
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonToJava {

    public static void main(String[] args)  {
        try{
        	
        	Reader reader = new   InputStreamReader(new FileInputStream(new File("D:\\Users\\nitajadh\\Desktop\\json.conf")), "UTF-8");      
        	Gson gson = new GsonBuilder().create();
            Person p = gson.fromJson(reader, Person.class);
            
            System.out.println(p);
        }
        catch(IOException e){
        	e.printStackTrace();
        }
    }
}