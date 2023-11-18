package com.zou.ojsystembackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class OjsystemBackendApplicationTests {

    @Test
    void contextLoads() {
        String s = DigestUtils.md5DigestAsHex(("zou" + "12345678").getBytes());
        System.out.println(s);
    }

}
