
package promanager;


public class Game extends Project{
    
    String platform;
    String genre;

    public Game(String n, String d, String c, int p, String pm, String g) {
        super(n, d, c, p);
        platform = pm;
        genre = g;
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
    String getPlatform(){
        return this.platform;
    }
    String getGenre(){
        return this.genre;
    }    
    void setPlatform(String pm){
        this.platform = pm;
    }
    void setGenre(String g){
        this.genre = g;
    }
}
