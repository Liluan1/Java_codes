import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * exp_3
 */
public class exp_3 {

    public static void main(String[] args) {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("C:\\Users\\Liluan\\Desktop\\1.out"));
            String line = "\n";
            bw.write("hello world"+line);
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                bw.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


    }
}
