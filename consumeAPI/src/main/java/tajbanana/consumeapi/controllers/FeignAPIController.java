package tajbanana.consumeapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tajbanana.consumeapi.services.FeignServiceUtil;
import tajbanana.consumeapi.services.FeignPostServiceUtil;

import java.util.List;

@RestController
@RequestMapping("/api/feign")
public class FeignAPIController {

    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @Autowired
    private FeignPostServiceUtil feignPostServiceUtil;

    @GetMapping(path = "all")
    public List<Object> getAllCountries() {
        return feignServiceUtil.getAllCountries();
    }

    @PostMapping("post")
    public String postResponse(@RequestBody String text) {
        return feignPostServiceUtil.postResponse(text);
    }

}
