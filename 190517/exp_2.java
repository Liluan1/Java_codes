import java.io.BufferedReader;
import java.io.FileReader;

/**
 * exp_2
 */
public class exp_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Liluan\\Desktop\\1.out"));
            String result = null;
            while((result = br.readLine())!=null){
                System.out.println(result);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                br.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
