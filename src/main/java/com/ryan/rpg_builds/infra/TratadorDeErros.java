package com.ryan.rpg_builds.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static java.util.stream.Collectors.toList;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> tratarErroValidacao(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors().stream().map((e) -> new DadosErroValidacao(e.getField(),
                e.getDefaultMessage())).toList();
        return ResponseEntity.badRequest().body(erros);
    }
}