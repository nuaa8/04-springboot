package com.itheima1;

import com.itheima.Springboot07TestApplication;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot07TestApplication.class)
//如果启动类在SpringBoot启动类的包或子包中，可以省略启动类的设置，也就是省略classes的设定
class Springboot07TestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void save() {
        bookService.save();
    }

}
