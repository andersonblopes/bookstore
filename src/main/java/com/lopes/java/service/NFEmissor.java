package com.lopes.java.service;

import com.lopes.java.model.Book;
import com.lopes.java.model.NF;

import java.util.concurrent.SubmissionPublisher;

public class NFEmissor {
    private SubmissionPublisher<NF> publisher;

    public NFEmissor() {
        this.publisher = new SubmissionPublisher<>();
        publisher.subscribe(new NFSubscriber());
    }

    public void emit(String clientName, Book book) {
        NF nf = new NF(clientName, book.getName(), 39.99);
        publisher.submit(nf);
    }

    public void close() {
        this.publisher.close();
    }
}
