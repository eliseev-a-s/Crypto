import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        Person personOne = new Person();
        Person personTwo = new Person();

        personTwo.addFriend("personOne", personOne.getPublicKey());

        String encryptedMessage = personTwo.sendMessage("personOne", "Test message");
        log.info("Encrypted message: " + encryptedMessage);

        String decryptedMessage = personOne.receiveMessage(encryptedMessage);
        log.info("Decrypted message: " + decryptedMessage);
    }
}
