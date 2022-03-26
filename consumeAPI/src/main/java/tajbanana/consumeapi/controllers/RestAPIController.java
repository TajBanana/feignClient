package tajbanana.consumeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tajbanana.consumeapi.services.RestService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class RestAPIController {

    @Autowired
    private RestService restService;

    @GetMapping(path = "rest/all")
    public List<Object> listAllCountries() {
        return restService.getAllCountries();
    }


}
