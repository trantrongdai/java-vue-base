package com.cmc.service.seeds;

import com.cmc.model.Clazz;
import com.cmc.model.Student;
import com.cmc.repository.ClazzRepository;
import com.cmc.repository.StudentRepository;
import com.cmc.util.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSeeder {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClazzRepository clazzRepository;

    public void run() {
        Clazz clazz1 = new Clazz();
        clazz1.setName("Class Math");
        clazz1.setCreatedAt(DateTimeUtils.getCurrentTimeUTC());
        clazz1.setUpdatedAt(DateTimeUtils.getCurrentTimeUTC());

        Clazz clazz2 = new Clazz();
        clazz2.setName("Class Physic");
        clazz2.setCreatedAt(DateTimeUtils.getCurrentTimeUTC());
        clazz2.setUpdatedAt(DateTimeUtils.getCurrentTimeUTC());


        clazz1 = clazzRepository.save(clazz1);
        clazz2 = clazzRepository.save(clazz2);

        Student student1 = new Student();
        student1.setName("Tony");
        student1.setRollNumber("ST1");
        student1.setClazz(clazz1);
        student1.setCreatedAt(DateTimeUtils.getCurrentTimeUTC());
        student1.setUpdatedAt(DateTimeUtils.getCurrentTimeUTC());


        Student student2 = new Student();
        student2.setName("Jenny Pham");
        student2.setRollNumber("ST2");
        student2.setClazz(clazz1);
        student2.setCreatedAt(DateTimeUtils.getCurrentTimeUTC());
        student2.setUpdatedAt(DateTimeUtils.getCurrentTimeUTC());

        studentRepository.save(student1);
        studentRepository.save(student2);
    }


}
