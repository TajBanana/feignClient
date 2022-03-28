package tajbanana.consumeapi.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "feignDemo", url = "https://restcountries.com/v3.1")
public interface FeignServiceUtil {

    @GetMapping("all")
    List<Object> getAllCountries();

}
