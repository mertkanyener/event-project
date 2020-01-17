package com.mertkan.eventproject.payload;

public class AdminOpsResponse {

    private Long objectId;
    private String responseBody;

    public AdminOpsResponse(Long objectId, String responseBody) {
        this.objectId = objectId;
        this.responseBody = responseBody;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}
