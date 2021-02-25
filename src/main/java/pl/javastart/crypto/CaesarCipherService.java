package pl.javastart.crypto;

import org.springframework.stereotype.Service;
import pl.javastart.profiles.ProductionProfile;

@Service
@ProductionProfile
public class CaesarCipherService implements CipherService {
    private static final int SHIFT = 3;

    @Override
    public String encrypt(String text) {
        char[] originalData = text.toCharArray();
        char[] encryptedData = new char[text.length()];
        for(int i = 0; i < text.length(); i++) {
            encryptedData[i] = (char) (originalData[i] + SHIFT);
        }
        return String.copyValueOf(encryptedData);
    }

    @Override
    public String decrypt(String cipher) {
        char[] encryptedData = cipher.toCharArray();
        char[] decryptedData = new char[cipher.length()];
        for(int i = 0; i < cipher.length(); i++) {
            decryptedData[i] = (char) (encryptedData[i] - SHIFT);
        }
        return String.copyValueOf(decryptedData);
    }
}
