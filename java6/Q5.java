

public class Q5 {
    public static void main(String[] args) {
        String str = "    hello World! ";
        System.out.println(str.repeat(4));
        System.out.println(str.strip());
        System.out.println("\u2005\u2004\u2000\u2005\u2004\u2000hello".trim());
        System.out.println("\u2005\u2004\u2000\u2005\u2004\u2000hello".strip());
        System.out.println("    ".isBlank());
        System.out.println("hello".indent(30));
        String st = "Hello WOrld".transform((s)->s.toUpperCase());
        System.out.println(st);

        String newstr = """
        \tfirst line
                \t\tsecond line
                \t\t\tthird line
                \t\tfourth line
                """.stripIndent();
        System.out.println(newstr);

        System.out.println("first\\nsecond,third".translateEscapes());
        System.out.println("first\\nsecond,third");

        System.out.println("first number %s".formatted(2));
    }
}
