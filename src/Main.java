public class Main {
    public static void main(String[] args) {

        String s1 = new String("Noran");
        String s2 = new String("Yasser");
        String s3 = new String("noran");

        if(s1=="Noran"){
            System.out.println("They are same");
        } else {
            System.out.println("!same");

        }
        System.out.println("===");
        if (s3.equals("Yasser")){

            System.out.println("They are same");
        } else {
            System.out.println("!same");

        }
        System.out.println("===");
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("They are same");
        } else {
            System.out.println("!same");

        }

        System.out.println("===");
        String s4 , s5 ;
        s4="helloo";
        s5="goodbye";

        System.out.println(  s1.regionMatches(0,s3,0,5)); // correct if we give it (true or false in begin the output will true
        System.out.println(  s1.regionMatches(true,0,s3,0,5));

        String strings []={"starting","ending","started","ended"};
        for(String str : strings){
            if(str.startsWith("st"))
                System.out.println(str);
        }
        System.out.println("===");
        for(String str : strings){
            if(str.endsWith("ed"))
                System.out.println(str);
        }
        System.out.println("@@");
        String letters = "abcdefgh";
        System.out.println(letters.indexOf('c'));
        System.out.println("---");
        System.out.println(letters.lastIndexOf('c'));

        System.out.println("---");
        System.out.println(letters.substring(0,4));

        System.out.println("---");
        System.out.println("contact = "+ s1.concat(s2));

    }
}