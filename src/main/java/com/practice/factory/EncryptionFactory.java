package com.practice.factory;

import com.practice.encrypt.Encryption;
import com.practice.enums.EncodingPatternEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Component
public class EncryptionFactory {
    Map<EncodingPatternEnum, Encryption> map;
    @Autowired
    EncryptionFactory(Set<Encryption> set){

        createStrategy(set);
    }

    private void createStrategy(Set<Encryption> set) {
        map=new HashMap<>();
        set.stream()
                .forEach(encryption -> map.put(encryption.getEncryptionType(),encryption));
    }
    public Encryption findEncryption(EncodingPatternEnum patternEnum){
        return map.get(patternEnum);
    }
}
