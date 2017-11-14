package com.zx.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ZX on 2017/11/13.
 */
@RestController
@RequestMapping("/persons")
class PersonController {

    @GetMapping("/{id}")
    public String getPerson(@PathVariable Long id) {
        return "person";
    }

   /* @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Person person) {

    }*/
}
