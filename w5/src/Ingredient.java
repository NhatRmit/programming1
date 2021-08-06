import java.util.Scanner;
public class Ingredient {
    //Attribute
    private String name;
    private String unit;
    private static int idofIngredient = 0;

    //Constructor
    public Ingredient() {
        idofIngredient++;
    }

    public Ingredient(String name, String unit) {
        setName(name);
        setUnit(unit);
    }

    public void setName(String name) {this.name = name.toUpperCase();}
    public void setUnit(String unit) {this.unit = unit;}

    public String getName() {return name;}
    public String getUnit() {return unit;}   

    //function
    public static Ingredient createIngredient(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please fill in all information of your ingredient:");
        System.out.println("ID: " + Ingredient.idofIngredient);
        Ingredient new_ingredient = new Ingredient();
        System.out.print("Name: ");
        new_ingredient.setName(s.next());
        s.nextLine();
        System.out.print("Measurement Unit: ");
        new_ingredient.setUnit(s.next());
        s.nextLine();
        return new_ingredient;
    }

    public void output(){
        System.out.printf("Name: %s, Measurement Unit: %s\n", getName(), getUnit());
    }
}