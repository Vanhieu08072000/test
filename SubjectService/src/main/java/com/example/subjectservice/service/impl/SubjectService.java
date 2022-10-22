package com.example.subjectservice.service.impl;

import com.example.subjectservice.entity.Subject;

public interface SubjectService {
    <S extends Subject> S save(S entity);

    Iterable<Subject> findAll();

    Iterable<Subject> findAllById(Iterable<Integer> integers);
}
