package pl.javastart.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.decorators.TextFormatter;

@Component
public class TextPrinter {
    private final TextFormatter textFormatter;

    @Autowired
    public TextPrinter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void println(String text) {
        System.out.println(textFormatter.format(text));
    }
}
