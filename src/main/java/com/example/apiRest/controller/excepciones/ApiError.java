package com.example.apiRest.controller.excepciones;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.awt.*;
import java.time.LocalDateTime;

@Getter @Setter
public class ApiError {

    private HttpStatus estado;

    @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private LocalDateTime fecha;
    private String mensaje;

}
