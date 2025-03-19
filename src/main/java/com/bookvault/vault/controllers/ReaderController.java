package com.bookvault.vault.controllers;

import com.bookvault.vault.models.Reader;
import com.bookvault.vault.services.ReaderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReaderController {

    private ReaderService readerService;

    @RequestMapping(method = RequestMethod.POST, path ="vault/create")
    public ResponseEntity<Reader> addReader(@RequestBody Reader reader){
        Reader newReader = readerService.addReader(reader);
        return new ResponseEntity<>(newReader, HttpStatus.CREATED);
    }
}
