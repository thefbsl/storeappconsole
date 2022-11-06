package observer;

public interface Subject {
    void follow(Observer observer);
    void sendMessage();
}