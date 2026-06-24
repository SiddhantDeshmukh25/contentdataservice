package com.deutsche.cds.service.externalapi;

import com.deutsche.cds.response.NseResponse;

import java.util.List;

public interface NseService {

    List<NseResponse> getResponseFromNse();
}
