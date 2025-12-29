package dev.zbib.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DummyController {

    @PostMapping("/dummy")
    public ResponseEntity<String> dummy(@RequestBody Integer data) {
        return ResponseEntity.ok("Received data: " + data);
    }

}
