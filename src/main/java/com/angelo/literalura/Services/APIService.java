package com.angelo.literalura.Services;


import com.angelo.literalura.Exceptions.HttpRequestException;
import com.angelo.literalura.Exceptions.ParseJsonException;

import java.io.IOException;

public interface APIService {

    String httpResponse(String paramURL) throws NullPointerException, IOException, InterruptedException, ParseJsonException, HttpRequestException;
}
