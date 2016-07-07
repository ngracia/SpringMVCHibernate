package com.ngracia.spring.controller;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.service.ImportCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
@RestController
@RequestMapping("/api/")
public class ImportCsvController {

    @Autowired
    ImportCsvService importCsvService;

    @RequestMapping(value = { "/importCsvProducts/{path}/{f}" }, method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody RequestResponseDto importCsvProducts(@PathVariable("path") String path, @PathVariable("f") String fileName) {
        RequestResponseDto requestResponseDto = importCsvService.importProductsListCsv(path, fileName);
        return requestResponseDto;
    }

}
