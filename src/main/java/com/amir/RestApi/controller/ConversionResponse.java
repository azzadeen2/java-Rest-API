package com.amir.RestApi.controller;

import java.time.ZonedDateTime;

public record ConversionResponse(String from, String to, double amount, double converted, ZonedDateTime timestamp) {
}
