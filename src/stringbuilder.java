public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder strbuild = new StringBuilder(" welcome");

        strbuild.append(" Java");
        System.out.println(strbuild);
        strbuild.replace(1, 3 , "java");
        System.out.println( "replace = " + strbuild);
        strbuild.reverse();
        System.out.println(strbuild);
        strbuild.delete(1, 4);
        System.out.println(strbuild);
    }
}
