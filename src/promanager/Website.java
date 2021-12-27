
package promanager;


public class Website extends Project {
    
   String server;
   int pages;
      
   Website(String n, String d, String c, int p, String s, int np)
   {
       super(n,d,c,p);
       server = s;
       pages = np;
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
    String getServer(){
        return this.server;
    }
    int getPages(){
        return this.pages;
    }
    void setServer(String s) {
       this.server = s;
   }
    void setPages(int np) {
       this.pages = np;
   }  
}
