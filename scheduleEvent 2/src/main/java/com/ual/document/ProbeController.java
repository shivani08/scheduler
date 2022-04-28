package com.ual.document;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = "application/json")
@CrossOrigin(origins = "*")
//@Slf4j
public class ProbeController {
    public static final String ID = "COUNTER";

    @GetMapping("/health")
    public ResponseEntity<String> areUHealthy() {
        String response = null;
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
