package com.bookvault.vault.services;

import com.bookvault.vault.models.Reader;
import com.bookvault.vault.repositories.ReaderRepository;

import java.util.List;
import java.util.Optional;

public class ReaderService {

    private ReaderRepository readerRepository;

    public Optional<Reader> getReaderById(Long id){
        return readerRepository.findById(id);
    }

    public List<Reader> readerList(){
        return readerRepository.findAll();
    }

    public Reader addReader(Reader reader){
        readerRepository.save(reader);
        return reader;
    }

    public void deleteReaderById(Long id){
        readerRepository.deleteById(id);
    }
}
