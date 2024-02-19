import java.io.*;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= cin.nextInt();

        System.out.println("Enter the gender(M and F):");
        String gender=cin.next();

        System.out.println("Enter the name:");
        String name=cin.next();
        if(gender.equalsIgnoreCase("M")||gender.equalsIgnoreCase("F"))
        {   if(year==2020)
        {
            File file1=new File("D:\\JAVAProject\\lab3\\src\\yob2020.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String strLine ;
            int RankCount=0;
            while(null != (strLine = bufferedReader.readLine()))
            {

                String strname=strLine.split(",")[0];
                String strsex=strLine.split(",")[1];
                if(strsex.equalsIgnoreCase(gender)) {
                    RankCount++;
                    if (strname.equalsIgnoreCase(name) ) {
                        if(strsex.equalsIgnoreCase("M")) {
                            System.out.println(name + " is ranked " + RankCount + " in year 2020" + " of the Man");
                        }
                        else {
                            System.out.println(name + " is ranked " + RankCount + " in year 2020" + " of the Female");
                        }
                        return;
                    }

                }
            }
            System.out.println(name+" is not ranked in year 2020");

        }
        else if(year==2021)
        {

            File file=new File("D:\\JAVAProject\\lab3\\src\\yob2021.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String strLine ;
            int RankCount=0;
            while(null != (strLine = bufferedReader.readLine()))
            {

                String strname=strLine.split(",")[0];
                String strsex=strLine.split(",")[1];
                if(strsex.equalsIgnoreCase(gender))
                {
                    RankCount++;
                    if (strname.equalsIgnoreCase(name))
                    {
                        if(strsex.equalsIgnoreCase("M")) {
                            System.out.println(name + " is ranked " + RankCount + " in year 2021" + " of the Man");
                        }
                        else {
                            System.out.println(name + " is ranked " + RankCount + " in year 2021" + " of the Female");
                        }
                        return;

                    }
                }


            }
            System.out.println(name+" is not ranked in year 2021");


        }
        }
        else
            System.out.println("the gender should be M of Man,F of female");
    }

}
