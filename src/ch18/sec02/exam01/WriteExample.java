package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    static OutputStream os= null;
    public static void main(String[] args) {
        try {
            os = new FileOutputStream("./test1.db");

//         byte a = 10;
//         byte b = 20;
//         byte c = 30;
//
//            os.write(a);
//            os.write(b);
//            os.write(c);
//            os.flush();

            byte[] array = {40, 50, 60};

            os.write(array);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
