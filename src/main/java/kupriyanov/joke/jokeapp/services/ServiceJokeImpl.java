package kupriyanov.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ServiceJokeImpl implements ServiceJoke {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ServiceJokeImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
