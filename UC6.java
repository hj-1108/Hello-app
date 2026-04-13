public class UC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = "Hello, ";
            // Enhanced for loop to build the string with delimiters
            for (String name : args) {
                greeting += name + ", ";
            }
            
            // Substring method to remove the trailing ", "
            greeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(greeting + "!");
        }
    }
}
