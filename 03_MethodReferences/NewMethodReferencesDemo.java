interface Parser{
    public String parse(String s);
}
class StringParser{
    public static String convert(String s){
        if(s.length()<=3){
            s = s.toUpperCase();
        }
        else{
            s = s.toLowerCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String str, Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
public class NewMethodReferencesDemo {
    public static void main(String[] args) {
        String str = "Kri";

        MyPrinter printer = new MyPrinter();
        printer.print(str, StringParser::convert);
}
}
