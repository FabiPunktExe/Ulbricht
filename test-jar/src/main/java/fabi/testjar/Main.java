package fabi.testjar;

public class Main {

    public static void main(String[] args) {
        SimpleList<String> list = new SimpleList<>(
                "Walter Ernst Paul Ulbricht was a German communist politician.",
                "Ulbricht played a leading role in the creation of the Weimar-era Communist Party of Germany (KPD)"
        );
        list.add("and later in the early development and establishment of the German Democratic Republic.");
        for (int i = 0; i < list.getLength(); i++) System.out.println(list.get(i));
    }
}