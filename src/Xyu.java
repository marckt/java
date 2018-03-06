import javax.naming.spi.DirectoryManager;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Xyu { //строчкай_строчка2_реверс
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StatusBar statusBar = new StatusBar();

        Path FROM = Paths.get("/home/nikolay/disk01/slax-64bit-9.3.0 (1).iso");
        System.out.println("Starting copy from"+FROM.toString());
        System.out.println("Name of new file: ");
        String filename = br.readLine();

        Path TO = Paths.get("/home/nikolay/trash/"+filename+".iso");

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
            System.out.println("EBANAJA XPEHb");
        }


    }

}




