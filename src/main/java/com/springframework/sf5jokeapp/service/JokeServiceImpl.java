package com.springframework.sf5jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getRandJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
