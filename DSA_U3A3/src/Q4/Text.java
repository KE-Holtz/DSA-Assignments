package Q4;

public class Text implements Sendable {
    private String sender;

    public Text(String sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending text to " + recipient + " with message: " + message);
    }

    @Override
    public String getSender() {
        return sender;
    }
}
