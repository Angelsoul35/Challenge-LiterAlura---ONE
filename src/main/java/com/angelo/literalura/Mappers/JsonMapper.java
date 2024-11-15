package com.angelo.literalura.Mappers;

import com.angelo.literalura.Exceptions.ParseJsonException;

public interface JsonMapper {

    <T> T jsonMap (String json, Class<T> clazz) throws ParseJsonException;
}
