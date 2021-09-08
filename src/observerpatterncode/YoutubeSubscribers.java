/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterncode;

public class YoutubeSubscribers implements Observer{
    private final String name;
    public YoutubeSubscribers(String Name)
    {
     this.name = Name;   
    }
    @Override
    public void update(String youtubername, String videoname){
    System.out.println(name+ ": This "+ videoname +" is presented by "+ youtubername);
    
    }
}
