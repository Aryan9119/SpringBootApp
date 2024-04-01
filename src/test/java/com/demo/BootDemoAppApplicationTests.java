package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class BootDemoAppApplicationTests {
    private Calculator c = new Calculator();

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        assertNotNull(context, "Application context should not be null");
    }

    @Test
    @Disabled
    void testSum() {
        //expected
        int expectedResult = 17;
        //actual
        int actualResult = c.doSum(12, 3, 2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testProduct() {
        //expected
        int expectedResult = 6;
        //actual
        int actualResult = c.doProduct(3, 2);
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void testCompareNums(){
        //actual result
        Boolean actualResult = c.compareTwoNums(3, 3);
        assertThat(actualResult).isTrue();



    }


}

