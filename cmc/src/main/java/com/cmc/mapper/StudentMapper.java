package com.cmc.mapper;

import com.cmc.dto.request.StudentRequestDto;
import com.cmc.model.Student;
import com.cmc.model.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student fromRequestDto(StudentRequestDto studentDto);

    StudentDto fromEntity(Student center);
}
