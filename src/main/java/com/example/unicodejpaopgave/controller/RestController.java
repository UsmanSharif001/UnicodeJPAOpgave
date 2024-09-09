package com.example.unicodejpaopgave.controller;
import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UnicodeRepository unicodeRepository;


    @GetMapping("/unicode")
        public List<Unicode> getAllUnicode() {
        return unicodeRepository.findAll();
    }

    @GetMapping("/frominttochar/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/fromchartoint/{c}")
    public String charToUnicode(@PathVariable String c) {
        char charStartInput = c.charAt(0);
        int unicode = (int) charStartInput;
        return "char=" + charStartInput + " unicode=" + unicode;
    }



}
