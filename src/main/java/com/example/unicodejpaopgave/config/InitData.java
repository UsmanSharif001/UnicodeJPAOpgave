package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String...args)throws Exception {

        Set<Character> unicodeChars = new HashSet<>();
        unicodeChars.add('$');
        unicodeChars.add('€');
        unicodeChars.add('£');
        unicodeChars.add('@');
        unicodeChars.add('A');

        for (Character ch : unicodeChars) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) ch);
            unicode.setBogstav(ch);
            unicode.setDescription("Unicode character: " + ch);

            // Save to the database
            unicodeRepository.save(unicode);
        }

    }



}
