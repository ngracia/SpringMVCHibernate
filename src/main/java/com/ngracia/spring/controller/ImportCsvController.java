package com.ngracia.spring.controller;

import com.ngracia.spring.service.ImportCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
@Controller
public class ImportCsvController {

    @Autowired
    ImportCsvService importCsvService;
}
