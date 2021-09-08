/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterncode;

/**
 * This application is used to notify the subscribers about uploading the new video
 * It notify about the new video to all the subscribers who subscribes the channel.
 */
public class ObserverPatternCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Youtuber Series  
        Youtuber adam_series = new  Youtuber("Adam Series");
        Youtuber joy_series = new  Youtuber("Joy Series");
        // Youtube Subscribers
        YoutubeSubscribers james = new YoutubeSubscribers("James");
        YoutubeSubscribers sam = new YoutubeSubscribers("Sam");
        YoutubeSubscribers adam = new YoutubeSubscribers("Adam");
        YoutubeSubscribers john = new YoutubeSubscribers("John");

        // Register the subscribers in the application
        adam_series.addsubscriber(sam);
        adam_series.addsubscriber(john);
        
        joy_series.addsubscriber(james);
        joy_series.addsubscriber(adam);
        
        
        // Notify to Upload video
        adam_series.videoname("Java Course");
        joy_series.videoname("Machine Learning Course");
        
        // Unsubscribe the Youtube subscriber
        adam_series.removesubscriber(adam);
    }
    
}
