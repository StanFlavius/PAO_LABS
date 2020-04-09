package LAB6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex3 {

    public void solve(){
        FileInputStream fin = null;
        List<String> arr = new ArrayList<String>();
        try{
            fin = new FileInputStream("clienti.txt");
            int ch;
            int ct = 0;
            StringBuilder sb = new StringBuilder();
            while((ch = fin.read()) != -1){
                if((char)ch != '\n'){
                    sb.append((char)ch);
                }
                else{
                    String str = sb.toString();
                    String result = str.substring(0, str.length() - 1);
                    arr.add(result);
                    sb.delete(0, sb.length());
                }
            }
            String str = sb.toString();
            arr.add(str);
        }
        catch (IOException e){
            System.out.println("Eroare");
        }
        finally {
            if(fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println("nu s a putut inchide fisierul");
                }
            }
        }

        List<String> listMaj = new ArrayList<>();
        List<String> listMin = new ArrayList<>();

        System.out.println("sunt " + arr.size() + " clienti");

        for(int i = 0; i < arr.size(); i++){
            String[] vec = arr.get(i).split(" ");
            Integer v = Integer.parseInt(vec[2]);
            StringBuilder sb = new StringBuilder();
            sb.append(vec[0]);
            sb.append(' ');
            sb.append(vec[1]);
            if(v >= 18) listMaj.add(sb.toString());
            else listMin.add(sb.toString());
        }

        System.out.println("lista clienti majori");
        for(String str : listMaj)
            System.out.println(str);
        System.out.println("lista clienti minori");
        for(String str : listMin)
            System.out.println(str);
    }
}