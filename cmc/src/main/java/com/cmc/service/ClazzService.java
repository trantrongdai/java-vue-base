package com.cmc.service;

import com.cmc.model.dto.ClazzDto;

import java.util.List;

public interface ClazzService {

    /**
     * Find Clazz by id
     *
     * @param id
     * @return ClazzDto instance
     */
    ClazzDto findById(Long id);

    /**
     * list all Clazz
     *
     * @return List of ClazzDto
     */
    List<ClazzDto> listAll();

}
