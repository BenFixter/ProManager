
package promanager;


public class App extends Project {
    
    String type;

    public App(String n, String d, String c, int p, String t) {
        super(n, d, c, p);
        type = t;
    }

   String getName() {
       return super.name;
   }
   String getDeadline() {
       return super.deadline;
   }
    String getClient() {
       return super.client;
   }
    int getPrice() {
       return super.price;
   }
    String getType() {
        return this.type;
    }
    void setType(String t) {
       this.type = t;
   }
}
