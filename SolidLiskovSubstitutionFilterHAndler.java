
class  Handler{
    public  void save(){
        System.out.println("Save me in database");
    }
}

public class SolidLiskovSubstitutionFilterHAndler extends  Handler {

    public void save(String string){
        if(string.length()>50){
            System.out.println("save me if length is more than 50");
            super.save();
        }
    }

}
