package com.jimaloojuma.clients.notifications;


import com.fasterxml.jackson.annotation.JsonProperty;

public record NotificationRequest(
        @JsonProperty("toCustomerId") Integer toCustomerId,
        @JsonProperty("toCustomerName") String toCustomerName,
        @JsonProperty("message") String message
) {
}