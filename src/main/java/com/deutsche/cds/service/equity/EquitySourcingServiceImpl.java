package com.deutsche.cds.service.equity;

import com.deutsche.cds.Repository.AssetRepository;
import com.deutsche.cds.Repository.EquityRepository;
import com.deutsche.cds.entity.Asset;
import com.deutsche.cds.response.NseResponse;
import com.deutsche.cds.service.externalapi.NseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquitySourcingServiceImpl implements EquitySourcingService {

    private final NseService nseService;
    private final AssetRepository assetRepository;
    private final EquityRepository equityRepository;

    public EquitySourcingServiceImpl(NseService nseService, AssetRepository assetRepository, EquityRepository equityRepository) {
        this.nseService = nseService;
        this.assetRepository = assetRepository;
        this.equityRepository = equityRepository;
    }

    @Override
    public String sourceDataFromNse() {
        //call upstream
        List<NseResponse> responseFromNse = nseService.getResponseFromNse();


        return "";
    }
}
