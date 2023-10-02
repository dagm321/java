// importing java files
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
// we can import all types by this
import java.io.*;
// to read data from your file use "FileInputStream"
// to write data into your file use "FileOutputStream"

//OutputStreamWriter used to convert character into bytes
//InputStreamReader used to convert bytes into Character


public class Files {
    
    public void files() throws IOException {
        // FileWriter
        FileWriter right = new FileWriter("path");
        String text = "text";
        right.write(text);
        right.close();

        // FileReader
        FileReader rid = new FileReader("path");
        rid.read();
        rid.close();
        System.out.println(rid.read());
    }

    public void file() throws IOException{
        //FileInputStream and FIleOutputStream
        FileInputStream file = new FileInputStream("");
        byte[] data = new byte[file.available()];
        file.read(data);
        file.close();

        //FileOutputStream
        FileOutputStream fil = new FileOutputStream("");
        String text = "tet";
        byte[] da = text.getBytes();
        fil.write(da);
        fil.close();
    }





        
    }
}
