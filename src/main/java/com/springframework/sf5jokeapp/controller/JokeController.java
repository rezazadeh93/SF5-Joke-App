package com.springframework.sf5jokeapp.controller;

import com.springframework.sf5jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeText;

    public JokeController(JokeService jokeText) {
        this.jokeText = jokeText;
    }

    @RequestMapping({"/", ""})
    public String getJokeView(Model model) {
        model.addAttribute("jokeText", jokeText.getRandJoke());

        return "chucknorris";
    }
}
