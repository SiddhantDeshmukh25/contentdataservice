package com.deutsche.cds.Controller;

import com.deutsche.cds.service.equity.EquitySourcingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping(path = "/source")
public class SourcingController {

    private final EquitySourcingService equitySourcingService;

    public SourcingController(EquitySourcingService equitySourcingService) {
        this.equitySourcingService = equitySourcingService;
    }

    @GetMapping("/nse")
    public String nseScheduler(){
        return equitySourcingService.sourceDataFromNse();
    }
}
