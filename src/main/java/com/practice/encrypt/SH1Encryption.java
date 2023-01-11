package com.practice.encrypt;

import com.practice.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SH1Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encrypting using SH1 encryption algorithm");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA1;
    }
}
