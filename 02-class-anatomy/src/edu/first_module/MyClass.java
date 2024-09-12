package edu.first_module;
public class MyClass {
    public static void main(String [] args) {
        
        String meuNome = "Fábio";
        // int anoFabricacao = 2024;
        // boolean isComplete = false;

        // anoFabricacao = 2025;

        String myName = fullName(meuNome, "Santos");
        System.out.println(myName);

        int age = 36;

        ageAnalysis(age);
    }

    public static String fullName (String first, String second) {
        return "The name is: " + first.concat(" ").concat(second);
    }

    public static void ageAnalysis(int age) {

        if (age < 30) {
            System.out.println("has las than three decades");
        } else if (age < 50) {
            System.out.println("Although has less than fifty decades, has more than 30 decades.");
        } else {
            System.out.println("He's too old to counting.");
        }
    }

}
