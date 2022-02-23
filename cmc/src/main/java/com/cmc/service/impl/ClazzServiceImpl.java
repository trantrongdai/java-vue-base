package com.cmc.service.impl;

import com.cmc.model.dto.ClazzDto;
import com.cmc.service.ClazzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    private static final Logger logger = LoggerFactory.getLogger(ClazzServiceImpl.class);

    @Autowired
    MessageTranslator messageTranslator;

    @Value("${center.prefix:TT}")
    private String codePrefix;

    @Transactional(readOnly = true)
    @Override
    public ClazzDto findById(Long id) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<ClazzDto> listAll() {
        return null;
    }
}
