package com.company.MagicBallApi.controller;

import com.company.MagicBallApi.model.MagicBallAnswer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MagicBallController {

//    URI: /magic
//  - Method: POST
//  - Request Body: question
//  - Response Body: Answer
//- Answer Object instance variables:
//  - id
//  - question
//  - answer

    private static List<String> answers= new ArrayList<>(Arrays.asList(
            "It is certain",
            "Without a doubt",
            "Yes – definitely",
            "You may rely on it",
            "Don’t count on it",
            "Very doubtful",
            "Reply hazy, try again",
            "Ask again later"

    ));


    int id = 0;
    Random rand = new Random();

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public MagicBallAnswer createMagicBallAnswer(@RequestBody MagicBallAnswer answer){
        int randomNum = rand.nextInt(answers.size());

        String randomAnswer = answers.get(randomNum);

        answer.setId(++id);
        answer.setAnswer(randomAnswer);
        return answer;

    }

}
