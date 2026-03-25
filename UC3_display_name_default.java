public class UC3_display_name_default {
    public static void main(String[] args) {
        String name = "World";
        if (args.length > 0){
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
    }
}
