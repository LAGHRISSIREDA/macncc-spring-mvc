package com.codesigne.services;


import com.codesigne.entities.Document;
import com.codesigne.repositories.DocumentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DocumentService {

    DocumentRepository docRepository;

    @Autowired
    public DocumentService(DocumentRepository docRepository) {
        this.docRepository = docRepository;
    }

    public Document save(Document doc){
        return docRepository.save(doc);
    }

    public List<Document> listAll() {
        return docRepository.findAll();
    }

    public Document get(Long id) {
        return docRepository.findById(id).get();
    }

    public void delete(Long id) {
        docRepository.deleteById(id);
    }
}
