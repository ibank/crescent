package com.tistory.devyongsik.domain;

/**
 * author : need4spd, need4spd@naver.com, 2012. 8. 16.
 */
public class UpdateRequest {
	
	@RequestParamName(name="col_name", defaultValue="sample")
	private String collectionName;

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
}