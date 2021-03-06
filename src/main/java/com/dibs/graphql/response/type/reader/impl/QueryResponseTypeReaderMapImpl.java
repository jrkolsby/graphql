package com.dibs.graphql.response.type.reader.impl;

import java.util.Map;

import com.dibs.graphql.response.type.reader.QueryResponseTypeReader;

public class QueryResponseTypeReaderMapImpl implements QueryResponseTypeReader {

	@SuppressWarnings("unchecked")
	@Override
	public Object readProperty(Object sourceBean, String fieldName) {
		Map<Object, Object> sourceMap = (Map<Object, Object>) sourceBean;
		return sourceMap.get(fieldName);
	}

}
