import java.io.*;

/**
 * Created by Nia on 06.11.2015.
 */

public class PhaseGenerator {
    static public void main (String[] args)throws IOException {

        String openFile = "D:\\Programing\\Java\\project\\UA_IT_SCHOOL\\PhaseGenerator\\src\\main\\resources\\foo";

        String dataline = null;
        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(openFile);
            bufferedReader = new BufferedReader(fileReader);
            while ((dataline = bufferedReader.readLine())!= null){
                for (String retdata: dataline.split(";",-1)){
                    System.out.println(retdata);
                    String[] wordList1 ={retdata};

                    int lenthData = wordList1.length;
                   System.out.println(lenthData);
                }


            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Немогу открыть файл");
        }
        try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
        }
        catch (IOException e){
        }




    }
}
