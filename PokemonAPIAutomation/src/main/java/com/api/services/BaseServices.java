package com.api.services;

import com.api.configuration.config;

public class BaseServices{

    protected String _baseURL;

    public BaseServices(){
        _baseURL = config.getProperty("baseURL");
    }
}
