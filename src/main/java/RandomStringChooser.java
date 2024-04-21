import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> array = new ArrayList<String>();
  /* to be implemented in part (a) */
  public RandomStringChooser(String[] words){
    for(int i = 0; i < words.length; i++){
      array.add(words[i]);
    }
  }

  public String getNext(){
    if(array.size() > 0)
    return array.get((int)(Math.Random() * array.length));
    else 
    return "NONE";
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
