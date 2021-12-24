package baitap.copyfiletext;

import thuchanh.timgiatrilonnhatinrafile.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> strings = CopyFileText.readFile("D:\\4. Outlook sync\\OneDrive\\Desktop\\Modul2\\Bai16IOTextFile\\src\\baitap\\copyfiletext\\input");
        System.out.println(strings);
        CopyFileText.writeFile("D:\\4. Outlook sync\\OneDrive\\Desktop\\Modul2\\Bai16IOTextFile\\src\\baitap\\copyfiletext\\output",strings);

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

    public static void writeFile(String filePath, List<String> strings){
        try{

            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            for (String str: strings) {
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
