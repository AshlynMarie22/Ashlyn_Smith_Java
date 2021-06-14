package com.company.MagicBallApi.controller;

import com.company.MagicBallApi.model.MagicBallAnswer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicBallController {


    private static List<MagicBallAnswer> answers= new ArrayList<>(Arrays.asList(
            new MagicBallAnswer( 1, "","It is certain"),
            new MagicBallAnswer(2, "","Without a doubt"),
            new MagicBallAnswer(3, "","Yes – definitely"),
            new MagicBallAnswer(4, "", "You may rely on it"),
            new MagicBallAnswer( 5, "", "Don’t count on it"),
            new MagicBallAnswer( 6, "", "Very doubtful"),
            new MagicBallAnswer(7, "", "Reply hazy, try again"),
            new MagicBallAnswer(8, "","Ask again later")

    ));


    int id = 0;
    Random rand = new Random();

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public MagicBallAnswer createMagicBallAnswer(@RequestBody String question){
        int randomNum = rand.nextInt(answers.size());

        answers.get(randomNum).setQuestion(question);
        return answers.get(randomNum);

    }

}
