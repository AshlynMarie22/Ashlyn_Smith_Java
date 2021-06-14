package com.company.QuoteAPI.controller;


import com.company.QuoteAPI.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteApiController {

    private static List<Quote> quotes= new ArrayList<>(Arrays.asList(
        new Quote(1, "You are off to great places, today is your day. Your mountain is waiting, so get on your way.", "Dr. Seuss"),
        new Quote(2, "You always pass failure on the way to success.", "Mickey Rooney"),
        new Quote(3, "The secret of getting ahead is getting started.", "Mark Twain"),
        new Quote(5, "Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.", "Neil Gaiman"),
        new Quote(6, "Everything you can imagine is real.", "Pablo Picasso"),
        new Quote(7, "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us.", "Helen Keller"),
        new Quote(8, "Whatever you are, be a good one.", "Abraham Lincoln"),
        new Quote(9, "If we have the attitude that it’s going to be a great day it usually is.", "Catherine Pulsifier"),
        new Quote(10, "Your passion is waiting for your courage to catch up.", "Isabelle Lafleche")
        ));


private Random rand =new Random();

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuote() {
        return quotes.get(rand.nextInt(quotes.size()));}
}
