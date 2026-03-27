package Q4;

public class MessageBomber {

    public static void main(String[] args) {
        Sendable textSender = new Text("Alice");
        Sendable voicemailSender = new VoiceMail("Bob");

        sendBomb(textSender, "Charlie");
        sendBomb(voicemailSender, "Dave");
    }

    public static void sendBomb(Sendable sender, String recipient) {
        for (int i = 0; i < 25; i++) {
        sender.sendMessage(recipient, recipient +" GOT BOMBED BY " + sender.getSender() + "!");
        }
    }
}
