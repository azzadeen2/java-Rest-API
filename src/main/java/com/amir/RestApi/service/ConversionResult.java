package com.amir.RestApi.service;

import java.time.ZonedDateTime;

public record ConversionResult(double converted, ZonedDateTime timestamp) {
}
