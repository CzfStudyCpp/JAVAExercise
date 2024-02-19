import java.net.MalformedURLException;
import java.util.*;
import java.net.URL;
public class Web {
    public static void main (String []args)
    {
        Scanner cin= new Scanner(System.in);
        System.out.print("Enter the URL:");
        String url=cin.nextLine();
        crawler(url);
    }
    public static void crawler(String startingUrl)
    {
        ArrayList<String>pending=new ArrayList<>();
        ArrayList<String>travel=new ArrayList<>();

        pending.add(startingUrl);
        while(!pending.isEmpty()&&travel.size()<=500){
            String Url=pending.remove(0);
            if(!travel.contains(Url)){
                travel.add(Url);
                System.out.println("Crawl "+Url);
            }
            for(String s:getSubURLs(Url))
            {
                if(!travel.contains(s))
                    pending.add(s);
            }
        }
    }

    public static ArrayList<String>getSubURLs(String urlString){
        ArrayList<String> list=new ArrayList<>();
        try{
            URL  tempUrl=new URL(urlString);
            Scanner cin=new Scanner(tempUrl.openStream());
            int current=0;
            while(cin.hasNext()){
                String line =cin.nextLine();
                current=line.indexOf("http:",current);
                while(current>0){
                    int endIndex=line.indexOf("\"",current);
                    if(endIndex>0){
                        list.add(line.substring(current,endIndex));
                        current=line.indexOf("http:",endIndex);
                    }
                    else
                        current=-1;
                }
            }
        } catch (Exception e) {
          System.out.println("Error"+e.getMessage());
        }
        return list;
    }
}
