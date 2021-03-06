public class SõnadeAnalüüs {
    public static void main(String[] args) {
        String lause = "Kui Arno isaga koolimajja jõudis, olid tunnid juba alanud.";
        String uuslause = lause.replace(",", "");
        String uuslause2 = uuslause.replace(".", "");
        System.out.println("Algne lause: " + lause);
        String[] tükid = uuslause2.split(" ");
        for (int i = 0; i < tükid.length; i++) {
            System.out.println("Sõna '" + tükid[i] + "' pikkus: " + tükid[i].length());
        }


    }
}
