package boot20;

import io.micrometer.core.instrument.Metrics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        Metrics.counter("hello.count").increment();
        return "workd";
    }
}
