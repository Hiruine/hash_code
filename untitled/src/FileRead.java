/**
 * Created by Nixan on 01.03.2018.
 */

import java.io.*;
    public class FileRead{

        public static void main(String[] args)throws Exception
        {
            // We need to provide file path as the parameter:
            // double backquote is to avoid compiler interpret words
            // like \test as \t (ie. as a escape sequence)
            File file = new File("C:\\Users\\Nixan\\Desktop\\untitled\\medium.in");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            st = br.readLine();

//            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
    }

