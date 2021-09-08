/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterncode;

public interface Subject {
    public void addsubscriber(Observer observers);
    public void removesubscriber(Observer observers);
    public void notifyObserver(String msg);
    
}
