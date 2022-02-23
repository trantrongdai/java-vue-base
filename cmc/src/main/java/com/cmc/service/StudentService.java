package com.cmc.service;

import com.cmc.dto.request.BatchDeleteRequestDto;
import com.cmc.dto.request.StudentRequestDto;
import com.cmc.dto.request.filter.StudentFilterRequest;
import com.cmc.model.Student;
import com.cmc.model.dto.StudentDto;
import org.springframework.data.domain.Page;

public interface StudentService {
    StudentDto createStudent(StudentRequestDto createRequestDto);

    StudentDto updateStudent(Long id, StudentRequestDto updateRequestDto);

    void deleteStudent(Long id);

    StudentDto getStudentDetails(Long id);

    Page<Student> findAll(Integer pageIndex, Integer pageSize, StudentFilterRequest filterRequest);

    void batchDelete(BatchDeleteRequestDto batchDeleteRequestDto);
}
