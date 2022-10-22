package com.example.subjectservice.service.impl.impl;

import com.example.subjectservice.entity.Subject;
import com.example.subjectservice.repository.SubjectRepository;
import com.example.subjectservice.service.impl.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectServiceImpl (SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    @Override
    public <S extends Subject> S save(S entity) {

        return subjectRepository.save(entity);
    }

    @Override
    public Iterable<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Iterable<Subject> findAllById(Iterable<Integer> integers) {
        return subjectRepository.findAllById(integers);
    }

}
