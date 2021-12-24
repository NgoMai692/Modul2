package baitap.readfilecsv;

import baitap.copyfiletext.CopyFileText;
import thuchanh.timgiatrilonnhatinrafile.ReadAndWriteFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {

    public static void main(String[] args) {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        List<String> strings = readFile("D:\\4. Outlook sync\\OneDrive\\Desktop\\Modul2\\Bai16IOTextFile\\src\\baitap\\readfilecsv\\countries.csv");
        System.out.println(strings);
    }

    public static List<String> readFile(String filePath){
        List<String> strings = new ArrayList<>();

        try{
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine())!= null){
                strings.add(line+"\n");
            }
            br.close();

        }catch (Exception e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return strings;
    }
}
