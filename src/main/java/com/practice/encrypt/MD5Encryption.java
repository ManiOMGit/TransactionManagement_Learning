package com.practice.encrypt;

import com.practice.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encypting using MD5 encryption algorithm");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
