
package session11_DesignPattern;
class Database {

    private static Database singleObject;
    private String name;

    private Database(String n) {
        name = n;
    }
    
    public String getName(){
        return name;
    }

    public static Database getInstance(String n) {
        if (singleObject == null) {
            singleObject = new Database(n);
        }

        return singleObject;
    }
}
public class TestSingleton {

    public static void main(String[] args) {
        Database db;
        db = Database.getInstance("Products");
        System.out.println("This is the " + db.getName()+ " database");

        db = Database.getInstance("Employees");
        System.out.println("This is the " + db.getName() + " database");
    }
}
