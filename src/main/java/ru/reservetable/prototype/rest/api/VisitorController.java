package ru.reservetable.prototype.rest.api;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visitor")
@Api(value = "", description = "API для обработки входящих от пользователей запросов")
public class VisitorController {

    @GetMapping("/reserve")
    public ResponseEntity<String> reserveTable(){
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }

}
