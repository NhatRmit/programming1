public class Problem1 {
    public static void main(String[] args) throws InvalidVaccineTypeException {
        Person p1 = new Person("Nhat 1", 16);
        Person p2 = new Person("Nhat 2", 25);
        Person p3 = new Person("Nhat 3", 50);
        Person p4 = new Person("Nhat 4", 70);

        TypeVaccine a = new TypeA();
        TypeVaccine b = new TypeB();
        TypeVaccine c = new TypeC();
        TypeVaccine d = new TypeD();

        p1.getVaccine(a);
        p2.getVaccine(b);
        p3.getVaccine(c);
        p4.getVaccine(d);

    }
}

class TypeVaccine {
    String name;
    double amount;

    public TypeVaccine(){}

    public TypeVaccine(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public boolean isTwoDoses() {
        return true;
    }

    public int daysBetween() {
        return -1;
    }
}

class TypeA extends TypeVaccine implements UsedByYoung{
    @Override
    public boolean isTwoDoses() {
        return true;
    }

    @Override
    public int daysBetween() {
        return 20;
    }

    @Override
    public String procedureForTheYoung(){
        return super.name + "is ok for young people";
    }
}

class TypeB extends TypeVaccine implements UsedByElderly{
    @Override
    public boolean isTwoDoses() {
        return true;
    }

    @Override
    public int daysBetween() {
        return 30;
    }

    @Override
    public String procedureForTheElderly(){
        return super.name + "is ok for young people";
    }
}

class TypeC extends TypeVaccine implements UsedByYoung{
    @Override
    public boolean isTwoDoses() {
        return false;
    }

    @Override
    public int daysBetween() {
        return -1;
    }

    @Override
    public String procedureForTheYoung(){
        return super.name + "is ok for young people";
    }
}

class TypeD extends TypeVaccine implements UsedByElderly{
    @Override
    public boolean isTwoDoses() {
        return false;
    }

    @Override
    public int daysBetween() {
        return -1;
    }

    @Override
    public String procedureForTheElderly(){
        return super.name + "is ok for young people";
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getVaccine(TypeVaccine v) throws InvalidVaccineTypeException{
        if(age < 18){
            if(v instanceof UsedByElderly){
                throw new InvalidVaccineTypeException("Vaccine is not suitable");
            }
        }
        
        if(age > 65) {
            if(v instanceof UsedByYoung){
                throw new InvalidVaccineTypeException("Vaccine is not suitable");
            }
        }

        if(v.isTwoDoses()) {
            System.out.println(this.name + ", you will get the second dose after " + v.daysBetween() + "days");
        } else {
            System.out.println(this.name + ", you need only one dose");
        }
    }
}

class InvalidVaccineTypeException extends Exception {
    public InvalidVaccineTypeException(String errorMessage) {
        super(errorMessage);
    }
}

interface UsedByYoung {
    public String procedureForTheYoung();
}

interface UsedByElderly {
    public String procedureForTheElderly();
}