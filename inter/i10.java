// Encryptable interface
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES class implementing Encryptable interface
class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Add AES encryption algorithm implementation
        System.out.println("Encrypting using AES: " + data);
        // Actual encryption logic would go here
        return "AES-Encrypted-Data";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Add AES decryption algorithm implementation
        System.out.println("Decrypting using AES: " + encryptedData);
        // Actual decryption logic would go here
        return "Decrypted-Data";
    }
}

// RSA class implementing Encryptable interface
class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Add RSA encryption algorithm implementation
        System.out.println("Encrypting using RSA: " + data);
        // Actual encryption logic would go here
        return "RSA-Encrypted-Data";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Add RSA decryption algorithm implementation
        System.out.println("Decrypting using RSA: " + encryptedData);
        // Actual decryption logic would go here
        return "Decrypted-Data";
    }
}

// Main class to test the Encryptable interface and encryption classes
public class i10{
    public static void main(String[] args) {
        // Create instances of AES and RSA
        Encryptable aes = new AES();
        Encryptable rsa = new RSA();

        // Encrypt and decrypt using AES
        String aesData = "SensitiveData";
        String aesEncrypted = aes.encrypt(aesData);
        String aesDecrypted = aes.decrypt(aesEncrypted);

        System.out.println("AES Decrypted Data: " + aesDecrypted);

        // Encrypt and decrypt using RSA
        String rsaData = "ConfidentialInfo";
        String rsaEncrypted = rsa.encrypt(rsaData);
        String rsaDecrypted = rsa.decrypt(rsaEncrypted);

        System.out.println("RSA Decrypted Data: " + rsaDecrypted);
    }
}
