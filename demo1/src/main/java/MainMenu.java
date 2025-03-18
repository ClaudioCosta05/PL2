import java.awt.*;

public class MainMenu{

    public static void main(String[] args){

        try{
            GrupoAutomovelUI menu = new GrupoAutomovelUI();
            menu.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
