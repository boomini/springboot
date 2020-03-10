package com.example.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {
    @Test
    public void name() throws Exception{
        assertEquals("hello","hello");
    }
    @Test
    public void name2() throws Exception{
        assertEquals("hello","bye");
    }
}
