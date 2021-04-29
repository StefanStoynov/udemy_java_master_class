package section_4.playing_cat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && temperature < 46 && temperature > 24){
            return true;
        }else if (temperature < 36 && temperature > 24){
            return true;
        }else{
            return false;
        }
    }
}
