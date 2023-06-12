package tr.edu.metu.ii.sm.additionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.metu.ii.sm.additionapp.exceptions.OverflowException;
import tr.edu.metu.ii.sm.additionapp.model.AdditionModel;
import tr.edu.metu.ii.sm.additionapp.service.AdditionService;

@RestController
@RequestMapping("/api")
public class AdditionController {
    @Autowired
    AdditionService additionService;

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() {
        return "Hello prod env!";
    }

    @RequestMapping(value="/addIntegers", method=RequestMethod.POST)
    public AdditionModel addIntegers(@RequestBody AdditionModel model) throws OverflowException {
        model.setResult(additionService.addIntegers(model.getA(), model.getB()));
        return model;
    }
}
