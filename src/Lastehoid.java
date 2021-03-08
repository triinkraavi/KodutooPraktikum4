import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Lastehoid {

    public static void main(String[] args) throws Exception {
        File fail = new File("lapsehoidjad.txt");

        try (Scanner sc = new Scanner(fail, "UTF-8")){
            ArrayList<Lapsehoidja> list1 = new ArrayList<>();
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                Lapsehoidja lapsehoidja1 = new Lapsehoidja(Integer.parseInt(tükid[0]), tükid[1]);
                list1.add(lapsehoidja1);
                }
            Lapsehoidja jana = new Lapsehoidja(35,"Jana");
            list1.add(jana);


            }



        }
    }

