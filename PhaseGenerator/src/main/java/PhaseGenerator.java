import java.io.*;

/**
 * Created by Nia on 06.11.2015.
 *
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
                System.out.println(dataline);
                String[] retdata =  dataline.split(";");
                System.out.println(retdata.length);



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
