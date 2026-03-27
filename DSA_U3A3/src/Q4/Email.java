package Q4;

public class Email implements Sendable {

    private String sender;

    public Email(String sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }

    @Override
    public String getSender() {
        return sender;
    }

}
