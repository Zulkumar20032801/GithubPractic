public class Main {
    public static void main(String[] args) {

        String n="malina";
//        System.out.println(n.endsWith("na"));   //Возврашает   boolean  тип
//        System.out.println(n.startsWith("ma"));
//

//     int [] let={18,19,22};
//       var(let,"Aidai","Alyona","Dilnaz");
//    }
//    static void var( int [] let, String...im){
//        for (int i = 0; i < let.length ; i++) {
//            System.out.println(im[i] + " "+let[i]+"лет");
//
//     }

        String sl="  i like java!!!";
        System.out.println(sl.charAt(sl.length()-1));
        System.out.println(sl.endsWith("!!!"));
        System.out.println(sl.startsWith("i like"));
        System.out.println(sl.contains("java"));
        System.out.println(sl.replace('a','o'));
        System.out.println(sl.toUpperCase());
        System.out.println(sl.toLowerCase());
        System.out.println(sl.length());
        System.out.println(sl.substring(8,13).toUpperCase());
        System.out.println(sl.trim());
    }
}