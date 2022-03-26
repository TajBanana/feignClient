package tajbanana.consumeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tajbanana.consumeapi.services.FeignServiceUtil;

import java.util.List;

@RestController
@RequestMapping("/api/feign")
public class FeignAPIController {

    private FeignServiceUtil feignServiceUtil;

    public FeignAPIController(FeignServiceUtil feignServiceUtil) {
        this.feignServiceUtil = feignServiceUtil;
    }

    @GetMapping(path = "all")
    public List<Object> getAllCountries() {
        return feignServiceUtil.getAllCountries();
    }

}
