package com.example.subjectservice.controller;


import com.example.subjectservice.entity.Subject;
import com.example.subjectservice.service.impl.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")

public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @PostMapping("/add")
    public ResponseEntity<Object> createSubject(@RequestBody Subject subject){
        subject = subjectService.save(subject);
        return  new ResponseEntity<>("insert completed..!", HttpStatus.CREATED);
    }


    @GetMapping("/findall")
    public ResponseEntity<Object> findSubject(){
        Iterable<Subject> list = subjectService.findAll();
        return  new ResponseEntity<>(list , HttpStatus.CREATED);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Object> findSubjectByid(@PathVariable("{id}")Iterable<Integer> id){
        Iterable<Subject> list = subjectService.findAllById(id);
        return  new ResponseEntity<>(list , HttpStatus.CREATED);
    }
}
