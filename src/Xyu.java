import javax.naming.spi.DirectoryManager;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Xyu { //строчкай_строчка2_реверс
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StatusBar statusBar = new StatusBar();

        Path FROM = Paths.get(args[0]);
        
        System.out.println("Starting copy from"+FROM.toString());
        System.out.println("Name of new file: ");
        Path TO = Paths.get(args[0].substring(args[0].lastIndexOf('/')+1));

        CopyOption [] options = new CopyOption[] {StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES};
        try {
            statusBar.start();
            Files.copy(FROM,TO,options);
            if (Files.exists(TO))
                StatusBar.isInterrupted =true;
            statusBar.join();
            System.out.println("OK!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }


    }

}



