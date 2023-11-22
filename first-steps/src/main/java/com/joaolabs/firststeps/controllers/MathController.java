package com.joaolabs.firststeps.controllers;

import com.joaolabs.firststeps.utils.ControllerUtils;
import com.joaolabs.firststeps.utils.math.Arithmetic;
import com.joaolabs.firststeps.utils.math.NumberUtils;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        ControllerUtils.validateParams(numberOne, numberTwo);
        return Arithmetic.sum(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        ControllerUtils.validateParams(numberOne, numberTwo);
        return Arithmetic.subtraction(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        ControllerUtils.validateParams(numberOne, numberTwo);
        return Arithmetic.multiplication(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/divi/{numberOne}/{numberTwo}")
    public Double divi(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        ControllerUtils.validateParams(numberOne, numberTwo);
        return Arithmetic.division(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        ControllerUtils.validateParams(numberOne, numberTwo);
        return Arithmetic.average(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/raiz/{number}")
    public Double raiz(@PathVariable(value = "number") String number) throws Exception {
        ControllerUtils.validateParams(number);
        return Arithmetic.squareRoot(NumberUtils.convertToDouble(number));
    }

}
