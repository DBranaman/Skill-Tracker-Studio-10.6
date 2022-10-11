package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {
    @GetMapping(value = "form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<h2>Name:</h2>" +
                "<form action='form2'>" +
                "<input type='text' name='name'>" +
                "<h2>My favorite language:</h2>" +
                "<select name='favorite'>" +
                "<option>Java</option>" +
                "<option>C++</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<h2>My second favorite language:</h2>" +
                "<select name='secFavorite'>" +
                "<option>Java</option>" +
                "<option>C++</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='thiFavorite'>" +
                "<option>Java</option>" +
                "<option>C++</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</html>";
    }

    @GetMapping(value = "form2")
    @ResponseBody
    public String hello(@RequestParam String name, @RequestParam String favorite, @RequestParam String secFavorite, @RequestParam String thiFavorite){
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ favorite +"</li>" +
                "<li>" + secFavorite + "</li>" +
                "<li>" + thiFavorite + "/li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping
    @ResponseBody
    public String homePage(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }



}
