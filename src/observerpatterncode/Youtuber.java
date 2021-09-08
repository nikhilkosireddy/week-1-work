/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterncode;

import java.util.ArrayList;

public class Youtuber implements Subject{
    
    private String youtuber;
    private ArrayList<Observer> subscriber;
    public Youtuber(String Name)
    {
     this.youtuber = Name;   
     subscriber = new ArrayList<Observer>();
    }
    
    @Override
    public void addsubscriber(Observer observers)
    {
        subscriber.add(observers);
    }
    @Override
    public void removesubscriber(Observer observers)
    {
        subscriber.remove(observers);
    }
    
    @Override
    public void notifyObserver(String videoname)
    {
        for(Observer obs: subscriber)
        {
            obs.update(youtuber, videoname);
        }
    }
    
    public void videoname(String name)
    {
        System.out.println(youtuber + " uploads " + name + " video");
        notifyObserver(name);
    }
}
