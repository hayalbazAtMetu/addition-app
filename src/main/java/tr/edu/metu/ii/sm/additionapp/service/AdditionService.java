package tr.edu.metu.ii.sm.additionapp.service;

import org.springframework.stereotype.Service;
import tr.edu.metu.ii.sm.additionapp.exceptions.OverflowException;

@Service
public class AdditionService {
    public int addIntegers(int a, int b) throws OverflowException {
        int res = 0;
        try {
            res = Math.addExact(a,b);
        } catch (ArithmeticException e) {
            throw new OverflowException(e.getMessage());
        }
        return res;
    }
}
