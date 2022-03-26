package tajbanana.consumeapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestService {

    private final String URL_ALL_COUNTRIES = "https://restcountries.com/v3.1/all";

    RestTemplate restTemplate = new RestTemplate();

    public List<Object> getAllCountries() {
        Object[] countries = restTemplate.getForObject(
                URL_ALL_COUNTRIES,Object[].class);

        return Arrays.asList(countries);
    }
}
