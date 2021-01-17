package pl.javastart.decorators;

import org.springframework.stereotype.Component;

@Component
public class BasicTextFormatter implements TextFormatter {
    @Override
    public String format(String txt) {
        return txt;
    }
}
