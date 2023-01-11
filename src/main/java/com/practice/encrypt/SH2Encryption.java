package com.practice.encrypt;

import com.practice.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SH2Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encrypting using SH2 encryption algorithm");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA2;
    }
}
