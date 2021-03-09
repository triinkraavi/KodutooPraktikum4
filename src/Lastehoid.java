import java.util.*;
import java.io.File;

public class Lastehoid {

    public static void main(String[] args) throws Exception {
        File fail = new File("lapsehoidjad.txt");

        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            ArrayList<Lapsehoidja> list1 = new ArrayList<>();
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                Lapsehoidja lapsehoidja1 = new Lapsehoidja(Integer.parseInt(tükid[0]), tükid[1]);
                list1.add(lapsehoidja1);
            }
            Lapsehoidja jana = new Lapsehoidja(35, "Jana");
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).getFirmasiseneNr() > 35) {
                    list1.add(i, jana);
                    break;
                }



            }

            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).getFirmasiseneNr() == 46) {
                    list1.remove(j);
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i).getFirmasiseneNr() + " " + list1.get(i).getLapsehoidjaNimi());

            }

        }

    }
}

