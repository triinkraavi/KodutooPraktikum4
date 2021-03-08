import java.util.Scanner;
import java.io.File;

public class Lühendaja {


    public static void main(String[] args) throws Exception {
        File fail = new File("nimed.txt");

        try (Scanner sc = new Scanner(fail, "UTF-8")){
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                StringBuilder str = new StringBuilder();
                str.append(tükid[tükid.length-1] + " ");
                for (int i = 0; i < tükid.length-1; i++) {
                    if(tükid[i].contains("-")){
                        String[] sidekriipsuga = tükid[i].split("-");
                        str.append(sidekriipsuga[0].charAt(0) + "-" + sidekriipsuga[1].charAt(0) + ".");

                        }
                    else {
                        str.append(tükid[i].charAt(0) + ". ");
                    }

                }
                System.out.println(str);

                }

            }
        }

    }

