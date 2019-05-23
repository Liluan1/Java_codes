import java.io.File;
import java.io.IOException;

public class exp_1 {
    public static void main(String[] args){
        File f1 = new File("C:\\Users\\Liluan\\Desktop");
        if(!f1.exists()){
            System.out.println("aaa");
            try{
                f1.createNewFile();
            }
            catch(IOException e){
                e.printStackTrace();
            }

        }
        else if(f1.isDirectory()){
            File[] files = f1.listFiles();
            for(File f : files){
                System.out. println(f);
            }
        }
    }
}
