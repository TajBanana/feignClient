package tajbanana.consumeapi.services;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "feignPostDemo", url = "http://localhost:8080")
public interface FeignPostServiceUtil {

    @PostMapping(path = "post")
    @Headers("Content-Type: text/plain")
    String postResponse(String text);
}
