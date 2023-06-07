package tr.edu.metu.ii.sm.additionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.metu.ii.sm.additionapp.model.AdditionModel;
import tr.edu.metu.ii.sm.additionapp.service.AdditionService;

@RestController
@RequestMapping("/api")
public class AdditionController {
    @Autowired
    AdditionService additionService;

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping(value="/addIntegers", method=RequestMethod.POST)
    public AdditionModel addIntegers(@RequestBody AdditionModel model) {
        model.setResult(additionService.addIntegers(model.getA(), model.getB()));
        return model;
    }
}
