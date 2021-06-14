package com.company.WordApi.controller;


import com.company.WordApi.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordApiController {
    private static int id = 1;


    private static List<Word> words= new ArrayList<>(Arrays.asList(
            new Word(id++, "Fiddlesticks", "Used to express impatience, dismissal, etc."),
            new Word(id++, "Agglomeration", "A jumbled cluster of mass of varied parts."),
            new Word(id++, "Skylark", "To frolic; sport."),
            new Word(id++, "Moonshot", "A very challenging and innovative project or undertaking."),
            new Word(id++, "Palaver", "Persuasive talk; flattery; cajolery."),
            new Word(id++, "Nudnik", "A persistently dull, boring pest."),
            new Word(id++, "Thrawn", "Contrary; peevish; obstinate."),
            new Word(id++, "Alfresco", "Out-of-doors; in the open air."),
            new Word(id++, "Lucida", "The brightest star in a constellation."),
            new Word(id++, "Foofaraw", "A great fuss or disturbance about something very insignificant.")
    ));


    private Random rand =new Random();

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Word getDefinition() {
        return words.get(rand.nextInt(words.size()));}
}



