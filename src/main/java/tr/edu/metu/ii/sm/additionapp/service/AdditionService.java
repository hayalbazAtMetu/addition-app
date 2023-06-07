package tr.edu.metu.ii.sm.additionapp.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
    public int addIntegers(int a, int b) {
        return a + b;
    }
}
