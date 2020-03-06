package springexemploclienterest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springexemploclienterest.model.dto.ClasseExemplo;
import springexemploclienterest.service.EndPointService;

@RestController
@RequestMapping(value = "/endPoint", produces = MediaType.APPLICATION_JSON_VALUE)
public class EndPointController {
    @Autowired
    EndPointService endPointService;

    /**
     * Em vez de termos multiplos argumentos do tipo:
     * @RequestParam(value="param1",defaultValue="") String param1, ...
     * Apenas definimos uma classe DTO.
     */
    @GetMapping
    public ResponseEntity<ClasseExemplo> endPoint(ClasseExemplo classeExemplo) {
        return endPointService.avaliaRespostaEndPoint(classeExemplo);
    }
}
