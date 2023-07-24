package net.binarypaper.springbootgradle.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "hello")
@Slf4j
public class HelloController {

    @GetMapping(path = "{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        log.info("name: {}", name);
        return "Hello " + name;
    }
}