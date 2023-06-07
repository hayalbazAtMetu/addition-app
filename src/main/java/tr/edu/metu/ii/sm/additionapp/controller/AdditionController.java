package tr.edu.metu.ii.sm.additionapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.metu.ii.sm.additionapp.model.AdditionModel;

@RestController
@RequestMapping("/api")
public class AdditionController {
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String addIntegers() {
        return "Hello world!";
    }

    @RequestMapping(value="/addIntegers", method=RequestMethod.POST)
    public AdditionModel addIntegers(@RequestBody AdditionModel model) {
        model.setResult(model.getA() + model.getB());
        return model;
    }
}
