import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> array;
  /* to be implemented in part (a) */
  public RandomStringChooser(String[] words){
    array = new ArrayList<String>();
    for(int i = 0; i < words.length; i++){
      array.add(words[i]);
    }
  }

  public String getNext(){
    if(array.size() > 0) 
    return array.remove((int)(Math.Random() * array.size()));
    else 
    return "NONE";
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
