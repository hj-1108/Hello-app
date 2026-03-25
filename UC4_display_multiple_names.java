public class UC4_display_multiple_names {
    public static void main(String[] args) {
        if (args.length > 0){
            for(String name : args){
                System.out.println("Hello" + name);
            }
        }else{
        System.out.println("Hello World");
        }
    }
}
