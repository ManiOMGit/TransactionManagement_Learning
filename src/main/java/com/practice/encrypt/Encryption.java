package com.practice.encrypt;

import com.practice.enums.EncodingPatternEnum;

public interface Encryption {
    public void encrypt(String toBeEncrypted);
    public EncodingPatternEnum getEncryptionType();
}
