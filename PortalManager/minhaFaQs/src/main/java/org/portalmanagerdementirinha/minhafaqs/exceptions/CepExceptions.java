package org.portalmanagerdementirinha.minhafaqs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

    public class CepExceptions {

        public static ResponseEntity<Object> respostaErro(String mensagem, HttpStatus status) {
            Map<String, Object> meuMap = new HashMap<>();
            meuMap.put("mensagem", mensagem);
            meuMap.put("status", status.value());

            return new ResponseEntity<>(meuMap, status);
        }
    }