package tr.edu.metu.ii.sm.additionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.metu.ii.sm.additionapp.exceptions.OverflowException;
import tr.edu.metu.ii.sm.additionapp.model.AdditionModel;
import tr.edu.metu.ii.sm.additionapp.service.AdditionService;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api")
public class AdditionController {
    @Autowired
    AdditionService additionService;

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher c = Cipher.getInstance("DES");
        String password = "123123123";
        return "Hello prod environment!";
    }

    @RequestMapping(value="/addIntegers", method=RequestMethod.POST)
    public AdditionModel addIntegers(@RequestBody AdditionModel model) throws OverflowException {
        model.setResult(additionService.addIntegers(model.getA(), model.getB()));
        return model;
    }
}
