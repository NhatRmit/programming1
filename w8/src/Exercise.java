import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient("water", "ml");
        Ingredient i2 = new Ingredient("salt", "g");
        Ingredient i3 = new Ingredient("sugar", "g");
        Ingredient i4 = new Ingredient("chicken", "kg");

        RecipeComponent rc1 = new RecipeComponent(i1, 123.1);
        RecipeComponent rc2 = new RecipeComponent(i2, 2.2);
        RecipeComponent rc3 = new RecipeComponent(i3, 99.3);
        RecipeComponent rc4 = new RecipeComponent(i4, 44.4);

        RecipeDisplay repcasualdisplay = new RecipeCasualDisplay();
        repcasualdisplay.addComponent(rc1);
        repcasualdisplay.addComponent(rc2);
        repcasualdisplay.addComponent(rc3);
        repcasualdisplay.addComponent(rc4);
        repcasualdisplay.setSeparator(new SpaceSeparator());
        repcasualdisplay.display();

        System.out.println();

        RecipeDisplay repseriousdisplay = new RecipeSeriousDisplay();
        repseriousdisplay.addComponent(rc1);
        repseriousdisplay.addComponent(rc2);
        repseriousdisplay.addComponent(rc3);
        repseriousdisplay.addComponent(rc4);
        repseriousdisplay.setSeparator(new DashSeparator());
        repseriousdisplay.display();

        System.out.println();

        RecipeDisplay rephackerdisplay = new RecipeHackerDisplay();
        rephackerdisplay.addComponent(rc1);
        rephackerdisplay.addComponent(rc2);
        rephackerdisplay.addComponent(rc3);
        rephackerdisplay.addComponent(rc4);
        rephackerdisplay.setSeparator(new BinarySeparator());
        rephackerdisplay.display();
    }
}




/////////////////////////////////////
/////////// Main Classes ///////////
class RecipeComponent {
    Ingredient ing;
    double amount;

    public RecipeComponent(Ingredient ing, double amount) {
        this.ing = ing;
        this.amount = amount;
    }

    public String toString() {
        return (ing.toString() + " - " + amount);
    }
}

class Ingredient {
    String name;
    String measurement;

    public Ingredient(String n, String m) {
        name = n;
        measurement = m;
    }

    public String toString() {
        return String.format("%s %s", name, measurement);
    }
}
/////////////////////////////////////




/////////////////////////////////////
//Display Recipe using Inheritance //
class RecipeDisplay {
    ArrayList<RecipeComponent> components;
    Separator sep;

    public void setSeparator(Separator sep) {
        this.sep = sep;
    }

    public void displaySeparator() {
        System.out.println(sep.getSeparator());
    }

    public RecipeDisplay() {
        components = new ArrayList<RecipeComponent>();
    }

    public void addComponent(RecipeComponent rc) {
        components.add(rc);
    }

    public void display() {
        System.out.println("I don't know how to display");
    }
}

class RecipeCasualDisplay extends RecipeDisplay {
    @Override
    public void display() {
        for (RecipeComponent rc : components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}

class RecipeComponentByAmount implements Comparator<RecipeComponent> {
    public int compare(RecipeComponent rep1, RecipeComponent rep2) {
        if (rep1.amount > rep2.amount) {
            return -1;
        }
        if (rep1.amount < rep2.amount) {
            return 1;
        }
        return 0;
    }
}

class RecipeSeriousDisplay extends RecipeDisplay {
    @Override
    public void display() {
        components.sort(new RecipeComponentByAmount());
        for (RecipeComponent rc : components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}

class RecipeComponentByFirstDigit implements Comparator<RecipeComponent> {
    public int compare(RecipeComponent rep1, RecipeComponent rep2) {
        int d1 = (int)(String.valueOf(rep1.amount).charAt(0));
        int d2 = (int)(String.valueOf(rep2.amount).charAt(0));

        return d2 - d1;
    }
}

class RecipeHackerDisplay extends RecipeDisplay {
    @Override
    public void display() {
        components.sort(new RecipeComponentByFirstDigit());
        for(RecipeComponent rc : components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}
/////////////////////////////////////



/////////////////////////////////////
/// Separator using Inheritance ////
class Separator {
    public String getSeparator() {
        return "";
    }
}

class SpaceSeparator extends Separator {
    @Override
    public String getSeparator() {
        return "                ";
    }
}

class DashSeparator extends Separator {
    @Override
    public String getSeparator() {
        return "-----------------";
    }
}

class BinarySeparator extends Separator {
    @Override
    public String getSeparator() {
        return "01010101010101010";
    }
}
/////////////////////////////////////