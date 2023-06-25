import java.util.*;

// class to represent a Parent-Child Communication Workshop
public class ParentChildCommunicationWorkshop {
    
    // instance variables
    private String workshopName;
    Private int numOfParticipants;
    private ArrayList<String> topics;
    private int duration;
    
    //constructor
    public ParentChildCommunicationWorkshop(String workshopName, int numOfParticipants, ArrayList<String> topics, int duration) {
        this.workshopName = workshopName;
        this.numOfParticipants = numOfParticipants;
        this.topics = topics;
        this.duration = duration;
    }
    
    //getters and setters
    public String getWorkshopName(){
        return this.workshopName;
    }
    
    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }
    
    public int getNumOfParticipants() {
        return this.numOfParticipants;
    }
    
    public void setNumOfParticipants(int numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }
    
    public ArrayList<String> getTopics() {
        return this.topics;
    }
    
    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
     //methods 
    public void addTopic(String topic) {
        this.topics.add(topic);
    }
    
    public void printTopics() {
        System.out.println("Topics covered in this workshop:");
        for (String topic : this.topics) {
            System.out.println(topic);
        }
    }
    
    public void printWorkshopInfo() {
        System.out.println("Workshop Name: " + this.workshopName);
        System.out.println("Number of participants: " + this.numOfParticipants);
        System.out.println("Duration of workshop: " + this.duration + " hours");
    }
    
    public void startWorkshop() {
        System.out.println("Welcome to " + this.workshopName + "!");
        System.out.println("The purpose of this workshop is to provide a platform to improve parent and child communication techniques.");
        printTopics();
        System.out.println("Let's get started!");
    }
    
    public static void main(String[] args) {
        ArrayList<String> topics = new ArrayList<String>();
        topics.add("Listening & Understanding");
        topics.add("Active Inquiry");
        topics.add("Engaging in Dialogue");
        topics.add("Offering Guidance");
        ParentChildCommunicationWorkshop workshop = new ParentChildCommunicationWorkshop("Parent-Child Communication Workshop", 10, topics, 3);
        workshop.printWorkshopInfo();
        workshop.startWorkshop();
    }
}