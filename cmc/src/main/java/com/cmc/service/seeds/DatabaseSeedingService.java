package com.cmc.service.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseSeedingService {
    @Autowired
    StudentSeeder studentSeeder;

    public void run() {
        studentSeeder.run();
    }
}
