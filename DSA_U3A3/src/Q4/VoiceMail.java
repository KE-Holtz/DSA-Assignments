package Q4;

public class VoiceMail implements Sendable {
    private String sender;

    public VoiceMail(String sender) {
        this.sender = sender;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending voicemail to " + recipient + " with message: " + message);
    }

    @Override
    public String getSender() {
        return sender;
    }
}
