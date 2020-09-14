package eu.kaluzinski.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService implements QuotesService {

    private static final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
