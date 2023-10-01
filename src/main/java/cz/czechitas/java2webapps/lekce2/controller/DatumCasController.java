package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller

public class DatumCasController {
        private static final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
        private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);
        private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);

        @GetMapping ("/")
        public ModelAndView datumACas (){
                ModelAndView resultDatumACas = new ModelAndView("datumACas");
                resultDatumACas.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
                resultDatumACas.addObject("cas", LocalTime.now().format(TIME_FORMATTER));
                return resultDatumACas;
        }

        @GetMapping ("/datum")
        public ModelAndView datum (){
                ModelAndView resultDatum = new ModelAndView("datum");
                resultDatum.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
                return resultDatum;
        }

        @GetMapping ("/cas")
        public ModelAndView cas () {
                ModelAndView resultCas = new ModelAndView("cas");
                resultCas.addObject("cas", LocalTime.now().format(TIME_FORMATTER));
                return resultCas;
        }
}