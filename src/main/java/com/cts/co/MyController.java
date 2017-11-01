package com.cts.co;

import com.cts.service.Bus;
import com.cts.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {


   @Qualifier("car")
    @Autowired
    Vehicle vehicle;

     @RequestMapping(value = "/getresult" ,method = RequestMethod.GET)

   public ModelAndView getOutput(HttpServletRequest request, HttpServletResponse response ){

        String input1=request.getParameter("input");
        /*int k= (int) vehicle.getTotalExpense(input);*/
        ModelAndView mv=new ModelAndView();
        mv.setViewName("output");
        mv.addObject("result",input1);
        return mv;
    }
}


