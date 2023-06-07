package tr.edu.metu.ii.sm.additionapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
