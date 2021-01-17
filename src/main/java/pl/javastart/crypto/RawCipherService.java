package pl.javastart.crypto;

import org.springframework.stereotype.Service;
import pl.javastart.profiles.DevProfile;

@Service
@DevProfile
public class RawCipherService implements CipherService {
    @Override
    public String encrypt(String text) {
        return text;
    }

    @Override
    public String decrypt(String cipher) {
        return cipher;
    }
}
